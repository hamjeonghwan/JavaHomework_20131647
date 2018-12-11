package my.day12;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.activation.Activator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame2 extends JFrame implements ActionListener{
	private JButton button;
	private JLabel lable;
	int c=0;
	
	public MyFrame2() {
		setSize(500, 300);
		setTitle("이벤트연습");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout fl = new FlowLayout();
		setLayout(fl);
		
		button = new JButton("버튼을 누르시오");
		button.addActionListener(this);
		add(button, "East");
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) { 
			button.setText("버튼이 눌려졌습니다.");
			
		}
	}
}