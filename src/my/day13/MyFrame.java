package my.day13;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	int x, y;
	class MyPanel extends JPanel {
		public MyPanel() 		{
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
	public MyFrame() {
		setTitle("Basic Painting");
		setSize(600, 200);
		add(new MyPanel());
		setVisible(true);
	}
}