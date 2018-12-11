package my.day11;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleGame2 extends JFrame {
	int n1, n2, n3;
	JButton button1, button2, button3;

	public SimpleGame2() {
		setTitle("Simple Game Machine");
		setSize(300, 150);
		JPanel panel = new JPanel();
		button1 = new JButton("" + n1);
		panel.add(button1);
		button2 = new JButton("" + n2);
		panel.add(button2);
		button3 = new JButton("" + n3);
		panel.add(button3);
		panel.requestFocus();
		panel.setFocusable(true);
		add(panel);
		setVisible(true);
		panel.addKeyListener(new MyKeyListener()); 
		}
	
			class MyKeyListener implements KeyListener {

				@Override
				public void keyPressed(KeyEvent e) {
					// TODO Auto-generated method stub
					Random r =new Random();
					int keycode = e.getKeyCode();
					if (keycode == KeyEvent.VK_ENTER) {
						n1 =r.nextInt(10);
						n2 =r.nextInt(10);
						n3 =r.nextInt(10);
						button1.setText("" + n1);
						button2.setText("" + n2);
						button3.setText("" + n3);
					}
				}
				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}

			}	
		
	
	
	////////////////////////////////////////////////////////////////////			

	public static void main(String[] args) {
		SimpleGame2 f = new SimpleGame2();
	}
	}