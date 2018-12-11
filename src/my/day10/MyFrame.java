package my.day10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame() {
		super("³»²¨");
		setLayout(new BorderLayout());
		getContentPane().setBackground(Color.pink);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame mf=new MyFrame();
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setSize(500, 500);
		JButton b=new JButton("NORTH");
		JButton c=new JButton("SOUTH");
		JButton v=new JButton("CENTER");
		JButton n=new JButton("EAST");
		JButton m=new JButton("WEST");
		mf.add(b, BorderLayout.NORTH);
		mf.add(c, BorderLayout.SOUTH);
		mf.add(v, BorderLayout.CENTER);
		mf.add(n, BorderLayout.EAST);
		mf.add(m, BorderLayout.WEST);
		mf.setVisible(true);
		
	}
}