package my.day12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuTest extends JFrame implements ActionListener {
	JMenuItem open, exit;
	JLabel lbel;
	public MenuTest() {
		setTitle("Menu Test");
		setSize(400, 150);
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("File");
		menu.add(open= new JMenuItem("Open"));
		open.addActionListener(this);
		menu.add(new JMenuItem("Save"));
		menu.add(exit= new JMenuItem("Exit"));
		exit.addActionListener(this);
		menuBar.add(menu);

		menuBar.add(new JMenu("Edit"));
		menuBar.add(new JMenu("View"));
		menuBar.add(new JMenu("Tools"));
		menuBar.add(new JMenu("Help"));

		setJMenuBar(menuBar);
		lbel = new JLabel();
		JPanel p = new JPanel();
		p.add(lbel, "Center");
		add(p);
		setVisible(true);
	}

	public static void main(String args[]) {
		MenuTest f = new MenuTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o =e.getSource();
		if (o == open) {
			JFileChooser j = new JFileChooser();
			int r = j.showOpenDialog(this);
			if (r==JFileChooser.APPROVE_OPTION) {
				String name = j.getSelectedFile().getAbsolutePath();
				lbel.setIcon(new ImageIcon(name));
			}
		}else if(o== exit) {
			System.exit(0);
			
		}
	}
}