package my.day13;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SnowManFace extends JFrame {
	MyPanel m;

	class MyPanel extends JPanel {
		int x = 180, y = -180, z = 180;

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.YELLOW);
			g.fillOval(20, 30, 200, 200);
			g.setColor(Color.BLACK);
			g.drawArc(60, 80, 50, 50, x, y); // ¿ÞÂÊ ´«
			g.drawArc(150, 80, 50, 50, x, y); // ¿À¸¥ÂÊ ´«
			g.drawArc(70, 130, 100, 70, 180, z); // ÀÔ
		}
	}

	public SnowManFace() {
		setSize(300, 300);
		setTitle("´«»ç¶÷ ¾ó±¼");
		JButton j = new JButton("¹Ù²Þ");
		m = new MyPanel();
		m.add(j);

		j.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				m.x = -180;
				m.y = 180;
				m.z = -180;
				repaint();
			}
		});
		setVisible(true);
		add(new MyPanel());
		add(m);
	}

	public static void main(String[] args) {
		SnowManFace s = new SnowManFace();
	}
}
