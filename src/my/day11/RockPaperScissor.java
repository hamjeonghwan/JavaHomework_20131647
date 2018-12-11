package my.day11;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RockPaperScissor extends JFrame implements ActionListener {
	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;
	private JPanel panel;
	private JLabel output, information;
	private JButton rock, paper, scissor;

	public RockPaperScissor() {
		setTitle("����, ����, ��");
		setSize(400, 150);
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3));
		information = new JLabel("�Ʒ��� ��ư �߿��� �ϳ���Ŭ���Ͻÿ�!");
		output = new JLabel("Good Luck!");
		rock = new JButton("0: ����");
		paper = new JButton("1: ����");
		scissor = new JButton("2: ��");
		rock.addActionListener(this);
		paper.addActionListener(this);
		scissor.addActionListener(this);
		panel.add(rock);
		panel.add(paper);
		panel.add(scissor);
		add(information, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		add(output, BorderLayout.SOUTH);
		setVisible(true);
	}

	public static void main(String[] args) {
		RockPaperScissor gui = new RockPaperScissor();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		int user = Integer.parseInt("" + b.getText().charAt(0));
		Random random = new Random();
		int computer = random.nextInt(3);
		if (user == computer)
			output.setText("�ΰ��� ��ǻ�Ͱ� �����");
		else if (user == (computer + 1) % 3)
			output.setText("�ΰ�: " + user + " ��ǻ��: " + computer + "   �ΰ� �¸�");
		else
			output.setText("�ΰ�: " + user + " ��ǻ��: " + computer + "   ��ǻ�� �¸�");
	}
}