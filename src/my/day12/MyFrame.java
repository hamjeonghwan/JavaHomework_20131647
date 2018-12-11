package my.day12;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	int img_x = 150, img_y = 150;

	public MyFrame() {
		setSize(600, 300);
		JButton button = new JButton("");
		ImageIcon icon = new ImageIcon("C://Users/user/eclipse-workspace/JavaHomework_20131647/src/my/day12/aaa.png");
		button.setIcon(icon);
		button.setLocation(img_x, img_y);
		JPanel panel = new JPanel();
		panel.add(button);
		panel.requestFocus();
		panel.setFocusable(true);
		panel.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				switch (keycode) {
				case KeyEvent.VK_UP:
					img_y -= 10;
					break;
				case KeyEvent.VK_DOWN:
					img_y += 10;
					break;
				case KeyEvent.VK_LEFT:
					img_x -= 10;
					break;
				case KeyEvent.VK_RIGHT:
					img_x += 10;
					break;
				}
				button.setLocation(img_x, img_y);
			}

			public void keyReleased(KeyEvent arg0) {
			}

			public void keyTyped(KeyEvent arg0) {
			}
		});
		add(panel);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}