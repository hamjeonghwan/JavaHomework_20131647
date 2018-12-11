package my.day13;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawImageFrame extends JFrame {
	Image img;

	public DrawImageFrame() {
		ImageIcon icon = new ImageIcon("C:\\Users\\user\\Desktop\\1.png");
		img = icon.getImage();
		setSize(600, 550);
		MyPanel6 m = new MyPanel6();
		m.setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		add(m);
		setVisible(true);
	}

	class MyPanel6 extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this); // 이미지를 화면의 원점에 그린다.
		}
	}

	public static void main(String[] args) {
		DrawImageFrame f = new DrawImageFrame();
		f.pack();
		f.setResizable(false);
	}
}