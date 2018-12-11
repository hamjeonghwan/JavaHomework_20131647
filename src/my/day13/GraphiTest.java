package my.day13;

import javax.swing.*;
import java.awt.*;

public class GraphiTest extends JFrame {
	public GraphiTest() {
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
//		MyPanel m = new MyPanel();
//		this.add(m);
		add(new MyPanel());
	}

	public static void main(String[] args) {
		new GraphiTest();
	}

	class MyPanel extends JPanel {

		protected void paintComponent(Graphics g) { // (1)
			super.paintComponent(g);
			g.drawOval(60, 50, 60, 60);
			g.drawRect(120, 50, 60, 60); // (3)
			g.setColor(Color.BLUE);
			g.fillOval(180, 50, 60, 60);
			g.fillRect(240, 50, 60, 60);
		}
	}
}