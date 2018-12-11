package my.day13;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ImagePanel {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImagePanel window = new ImagePanel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ImagePanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setSize(600, 400);
		frame.setLocationRelativeTo(null);
		//frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		panel.setBounds(14, 12, 316, 309);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("\uBC84\uD2BC\uC774\uC608\uC694");
		
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\1.png"));
		btnNewButton.setFont(new Font("HY±Ã¼­B", Font.PLAIN, 15));
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBounds(30, 65, 218, 161);
		panel.add(btnNewButton);
		
			
			JPanel panel_1 = new JPanel();
			panel_1.setBounds(363, 68, 182, 174);
			frame.getContentPane().add(panel_1);
			panel_1.setBackground(Color.YELLOW);
			panel_1.setVisible(false);
			panel_1.setLayout(null);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel_1.setVisible(true);
					panel.setVisible(false);
				
				}
			});
				
			
			JButton btnNewButton_1 = new JButton("\uBC84\uD2BC\uBC84\uD2BC");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel_1.setVisible(false);
					panel.setVisible(true);
				}
			});
			btnNewButton_1.setBounds(32, 52, 117, 83);
			panel_1.add(btnNewButton_1);
			
				
			
				btnNewButton_1.setBackground(Color.RED);
				btnNewButton_1.setFont(new Font("HY±Ã¼­B", Font.PLAIN, 15));
	
	}
}
