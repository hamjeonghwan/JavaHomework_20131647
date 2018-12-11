package my.day13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Point {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class MyPaintApp extends JFrame {
	int x, y;
	Vector<Point> list = new Vector<>();

	class MyPanel extends JPanel {
		public MyPanel() {
			addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent event) {
					x = event.getX();
					y = event.getY();
					list.add(new Point(x, y));
					repaint();
				}
			});
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			for (Point p : list) {
				g.setColor(Color.PINK);
				g.fillOval(p.x, p.y, 10, 10);
				
		}
	}
}
	public MyPaintApp() {
		setSize(600, 150);
		setTitle("My Paint");
		setVisible(true);
		add(new MyPanel());
	}

	public static void main(String[] args) {
		MyPaintApp f = new MyPaintApp();
	}
}