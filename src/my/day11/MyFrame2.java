package my.day11;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame2 extends JFrame{
	private JButton button;
	private JLabel lable;
	int c=0;
	
	public MyFrame2() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout f = new BorderLayout();
		FlowLayout fl = new FlowLayout();
		setLayout(f);
		button = new JButton("증가");
		button.addActionListener(new MyListener());
		lable = new JLabel("현재의 카운터값:" + c);
		add(lable, "Center");
		add(button, "East");
		setVisible(true);
		
	}
	class MyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			// Object obj = (JButton)e.getSource();
			c++;
			lable.setText("현재의 카운터값:" + c);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame2();
	}
}
