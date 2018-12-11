package my.day11;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class WordPanel extends JPanel {
	private JTextField tf;
	private String word;

	public WordPanel() {
		add(new JLabel("Word: "));
		add(tf = new JTextField(12));
		tf.setEditable(false);// �������� �ʰڴ�.
		tf.setHorizontalAlignment(JTextField.CENTER); // �߾�����
	}// ������....

// ���� �ܾ� ���� �޼ҵ�
	public void setWord(String word) {
		tf.setText(this.word = word);
	}

// ��c�� ���ڿ� ������ ���ڰ� * ���ڷ� �ٲٰ�, �ؽ�Ʈ�ʵ忡 ���
	// �̶�, String Ŭ������ replace()�� ����Ѵ�.
	public void match(char c) {
		word = word.replace(c, '*');
		tf.setText(word);
	}

// ��� * ���ڷ� ���߾����� üũ�ϴ� �޼ҵ� (��� ���߸� true, �׷��� ������ false �ι�ȯ)
	public boolean isAllMatched() {
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) != '*')
				return false;
		}
		return true;

	}
}

class ProgressPanel extends JPanel {
	private int count, len; // ���� ����, ���� ����
	private JLabel lb_count, lb_len;

	public ProgressPanel() {
		add(new JLabel("Progress:  "));
		add(lb_count = new JLabel());
		add(new JLabel("/"));
		add(lb_len = new JLabel());
	} // ������..

	// �ܾ� ���� �ʱ�ȭ
	public void setLength(int len) {
		this.len = len;
		count = 0;
		lb_count.setText(String.valueOf(count));
		lb_len.setText(String.valueOf(len));
	}

	public void increment() { // ī��Ʈ �� ���� �� ���� ���̺� ���
		lb_count.setText(String.valueOf(++count));
	}

	public boolean exceedLimet() { // ī��Ʈ���� ���ڱ��̸� �ʰ��ߴ��� üũ
		if (count >= len)
			return true;
		else
			return false;
	}
}
class MyFrame extends JFrame implements ActionListener {
	WordPanel wp;
	ProgressPanel pp;
	Words words;
	String WORD = "Programming";
	JTextField tf;
	JButton jbtn;

	public MyFrame() {
		setTitle("MyFrame: WordTest");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);
		makeUI(); // ��� ������Ʈ�� �ʱ�ȭ�ϴ� �޼ҵ�
		setVisible(true);
	} // ������
	private void makeUI() {
		add(wp = new WordPanel(), BorderLayout.NORTH);
		add(pp = new ProgressPanel(), BorderLayout.SOUTH);
		reset();
		JPanel p = new JPanel();
		p.add(new JLabel("Guess: "));
		p.add(tf = new JTextField(1));
		p.add(jbtn = new JButton("Enter"));
		add(p, BorderLayout.CENTER);
		tf.addActionListener(this);
		jbtn.addActionListener(this);
	} // �ʱ�ȭ �޼ҵ�
	// ó�����·� ������(�ܾ� ����)
	private void reset() {
		words = new Words();
		WORD = words.getWords();
		wp.setWord(WORD);
		pp.setLength(WORD.length());
	}
	// ��ư �̺�Ʈ ó��
	public void actionPerformed(ActionEvent arg0) {
		char c = tf.getText().charAt(0); // �Է��� ù ���� ���� ����
		tf.setText("");
		wp.match(c);
		pp.increment();

		if (wp.isAllMatched()) {
			JOptionPane.showMessageDialog(this, "Mission Sucess");
			reset();
		} else if (pp.exceedLimet()) {
			JOptionPane.showMessageDialog(this, "Mission Faile");
			reset();
		}
	}
}

class Words {
	int len;
	String[] words = { "java", "count", "school", "book", "student", "programmer" };

	public Words() {
		Random rand = new Random();

		Scanner scan = new Scanner(System.in);
		int index = rand.nextInt(words.length);

		len = index;
	}

	public String getWords() {
		return words[len];
	}
}

public class wordTest {
	public static void main(String[] args) {
		new MyFrame();
	}
}