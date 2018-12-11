package my.day13;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class BouncingBall extends JFrame implements ActionListener {
	int x, y;
	private int xSpeed = 3, ySpeed = 3;
	private static final int WIDTH = 600;
	private static final int HEIGHT = 200;
	private static final int PERIOD = 1;

	class MyPanel5 extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.ORANGE);
			g.fillOval(x, y, 40, 40);
		}
	}

	public void update() {
		x += xSpeed;
		y += ySpeed;
		if (x > WIDTH - 60 || x < 0) {
			xSpeed = -xSpeed;
		}
		if (y > HEIGHT - 80 || y < 0) {
			ySpeed = -ySpeed;
		}
	}

	public BouncingBall() {
		setSize(WIDTH, HEIGHT);
		setTitle("Bouncing Ball");
		setVisible(true);
		add(new MyPanel5());
		Timer timer = new Timer(PERIOD, this);
		timer.start();
	}

	public void actionPerformed(ActionEvent evt) {
		update();
		repaint();
	}

	public static void main(String[] args) {
		BouncingBall f = new BouncingBall();
	}
}