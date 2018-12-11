package my.day12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.activation.Activator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EventTest extends JFrame {
	private JButton yellow;
	private JButton pink;
	private JPanel a;
	int c=0;
	
	public EventTest() {
		setSize(500, 300);
		setTitle("이벤트연습");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		yellow = new JButton("노랑");
		pink = new JButton("핑크");
		a = new JPanel();
		FlowLayout fl = new FlowLayout();
		a.setLayout(fl);
		a.add(yellow);
		a.add(pink);
		
		add(a);
		
		yellow.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a.setBackground(Color.yellow);
				
			}
		});
		pink.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a.setBackground(Color.pink);
				
			}
		});
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EventTest();
	}
}