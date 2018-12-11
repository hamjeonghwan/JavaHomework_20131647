package my.day12;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame3 extends JFrame {
	int img_x = 150, img_y = 150;

	public MyFrame3() {
		setSize(600, 300);
		JButton button = new JButton("");
		ImageIcon icon = new ImageIcon("C://Users/user/eclipse-workspace/JavaHomework_20131647/src/my/day12/aaa.png");
		button.setIcon(icon);
		button.setLocation(img_x, img_y);
		JPanel panel = new JPanel();
		panel.add(button);
		panel.requestFocus();
		panel.setFocusable(true);
		panel.addMouseListener(new MouseListener() {
			public void mousePressed(MouseEvent e) {
				img_x = e.getX();
				img_y = e.getY();
				button.setLocation(img_x, img_y);
			}

			public void mouseReleased(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}

			public void mouseClicked(MouseEvent e) {
			}
		});
		add(panel);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyFrame3 f = new MyFrame3();
	}
}