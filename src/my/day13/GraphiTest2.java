package my.day13;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import my.day13.GraphiTest.MyPanel;

public class GraphiTest2 extends JFrame {
	int x, y;

	class MyPanel3 extends JPanel {
		public MyPanel3() {
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					x = e.getX();
					y = e.getY();
					repaint();
				}
			});
		}

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.ORANGE);
			g.fillRect(x, y, 100, 100);
		}
	}

	public GraphiTest2() {

		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
//			MyPanel m = new MyPanel();
//			this.add(m);
		add(new MyPanel3());
	}

	public static void main(String[] args) {
		new GraphiTest();
	}
}
