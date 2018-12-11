package my.day13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

class MyPanel extends JPanel implements ActionListener {
	int light_number=0;
	public MyPanel() {
		setLayout(new BorderLayout());
		JButton b = new JButton("신호 변경");
		b.addActionListener(this);
		add(b, BorderLayout.SOUTH);
	}

	@Override
	protected void paintComponent(Graphics g) {	
		// 신호등을 그린다. 
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawOval(100, 10, 100, 100);
		g.drawOval(200, 10, 100, 100);
		g.drawOval(300, 10, 100, 100);
		
		if (light_number == 0) {
			g.setColor(Color.RED);
			g.drawOval(100, 10, 100, 100);
		} else if (light_number == 1) {
			g.setColor(Color.YELLOW);
			g.drawOval(200, 10, 100, 100);
		} else {
			g.setColor(Color.GREEN);
			g.drawOval(300, 10, 100, 100);
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (++light_number >= 3)
			light_number = 0;
		repaint();
	}
}