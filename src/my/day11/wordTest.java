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
		tf.setEditable(false);// 편집하지 않겠다.
		tf.setHorizontalAlignment(JTextField.CENTER); // 중앙정렬
	}// 생성자....

// 맞출 단어 설정 메소드
	public void setWord(String word) {
		tf.setText(this.word = word);
	}

// ‘c’ 글자와 같으면 글자가 * 글자로 바꾸고, 텍스트필드에 출력
	// 이때, String 클래스의 replace()를 사용한다.
	public void match(char c) {
		word = word.replace(c, '*');
		tf.setText(word);
	}

// 모두 * 글자로 맞추었는지 체크하는 메소드 (모두 맞추면 true, 그렇지 않으면 false 로반환)
	public boolean isAllMatched() {
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) != '*')
				return false;
		}
		return true;

	}
}

class ProgressPanel extends JPanel {
	private int count, len; // 맞춘 갯수, 글자 길이
	private JLabel lb_count, lb_len;

	public ProgressPanel() {
		add(new JLabel("Progress:  "));
		add(lb_count = new JLabel());
		add(new JLabel("/"));
		add(lb_len = new JLabel());
	} // 생성자..

	// 단어 길이 초기화
	public void setLength(int len) {
		this.len = len;
		count = 0;
		lb_count.setText(String.valueOf(count));
		lb_len.setText(String.valueOf(len));
	}

	public void increment() { // 카운트 값 증가 한 것을 레이블에 출력
		lb_count.setText(String.valueOf(++count));
	}

	public boolean exceedLimet() { // 카운트값이 문자길이를 초과했는지 체크
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
		makeUI(); // 모든 컴포넌트를 초기화하는 메소드
		setVisible(true);
	} // 생성자
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
	} // 초기화 메소드
	// 처음상태로 돌리기(단어 설정)
	private void reset() {
		words = new Words();
		WORD = words.getWords();
		wp.setWord(WORD);
		pp.setLength(WORD.length());
	}
	// 버튼 이벤트 처리
	public void actionPerformed(ActionEvent arg0) {
		char c = tf.getText().charAt(0); // 입력한 첫 글자 갖고 오기
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