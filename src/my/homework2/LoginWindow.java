package my.homework2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

class User {

	private String name;
	private String phone;
	private String age;
	private String birth;
	private String sex;
	private String note;

	public String getAge() {
		return age;
	}

	public String getBirth() {
		return birth;
	}

	public String getSex() {
		return sex;
	}

	public String getNote() {
		return note;
	}

	public User(String name, String phone, String age, String birth) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	private String id;
	private String pwd;

	public User(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}

	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}
}

public class LoginWindow extends JFrame {

	private JFrame frmLoginProgram;
	JTextField id;
	JPasswordField pwd;
	Vector<User> list = new Vector<>();

	class ImagePanel extends JPanel {
		private Image img;

		public ImagePanel(Image img) {
			this.img = img;
			Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
			setPreferredSize(size);
			setMinimumSize(size);
			setMaximumSize(size);
			setSize(size);
			setLayout(null);
		}

		public void paintComponent(Graphics g) {
			g.drawImage(img, 0, 0, null);
		}
	}

	public LoginWindow() {
		frmLoginProgram = new JFrame();
		frmLoginProgram.setTitle("로그인프로그램");
		frmLoginProgram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImagePanel panel = new ImagePanel(new ImageIcon("C://Users//user//Desktop//2.png").getImage());
		frmLoginProgram.getContentPane().add(panel, BorderLayout.WEST);

		JLabel label = new JLabel("Log In");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		label.setBackground(SystemColor.menu);
		label.setBounds(367, 87, 124, 54);
		panel.add(label);

		JLabel label_1 = new JLabel("ID : ");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		label_1.setBackground(SystemColor.menu);
		label_1.setBounds(367, 162, 91, 37);
		panel.add(label_1);

		id = new JTextField();
		id.setColumns(10);
		id.setBounds(455, 162, 154, 37);
		panel.add(id);

		pwd = new JPasswordField();
		pwd.setBounds(455, 209, 154, 37);
		panel.add(pwd);

		JLabel label_2 = new JLabel("PW : ");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		label_2.setBackground(SystemColor.menu);
		label_2.setBounds(367, 209, 103, 37);
		panel.add(label_2);

		JButton button = new JButton("로그인");
		button.setBounds(430, 279, 103, 44);
		panel.add(button);

		JPanel JoinPanel = new JPanel();
		frmLoginProgram.getContentPane().add(JoinPanel);
		JoinPanel.setBackground(Color.WHITE);
		JoinPanel.setVisible(false);
		JoinPanel.setLayout(null);
		frmLoginProgram.pack();
		frmLoginProgram.setLocation(600, 250);

		JLabel welcome = new JLabel("Welcome!");
		welcome.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		welcome.setBounds(270, 10, 250, 50);
		JoinPanel.add(welcome);

		JLabel name = new JLabel("Name");
		name.setBounds(70, 90, 40, 35);
		JoinPanel.add(name);

		JTextField nm = new JTextField();
		nm.setBounds(110, 90, 110, 35);
		JoinPanel.add(nm);

		JLabel phone = new JLabel("Phone");
		phone.setBounds(340, 90, 60, 35);
		JoinPanel.add(phone);

		JTextField ph = new JTextField();
		ph.setBounds(400, 90, 130, 35);
		JoinPanel.add(ph);

		JLabel age = new JLabel("Age");
		age.setBounds(70, 150, 40, 35);
		JoinPanel.add(age);

		JTextField ag = new JTextField();
		ag.setBounds(110, 150, 110, 35);
		JoinPanel.add(ag);

		JLabel birth = new JLabel("Birth");
		birth.setBounds(340, 150, 60, 35);
		JoinPanel.add(birth);

		JTextField br = new JTextField();
		br.setBounds(400, 150, 130, 35);
		JoinPanel.add(br);

		JLabel note = new JLabel("Note");
		note.setBounds(340, 210, 60, 35);
		JoinPanel.add(note);

		JTextArea no = new JTextArea();
		no.setBounds(400, 210, 130, 100);
		no.setBorder(new LineBorder(Color.BLACK));
		no.setLineWrap(true);
		JoinPanel.add(no);

		JLabel sex = new JLabel("성별");
		sex.setBounds(70, 210, 40, 35);
		JoinPanel.add(sex);

		String mal[] = { "남자", "여자" };
		JComboBox<String> male = new JComboBox<String>(mal);
		male.setBounds(110, 210, 130, 35);
		JoinPanel.add(male);

		JButton acc = new JButton("Join");
		acc.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		acc.setBounds(250, 320, 120, 50);
		JoinPanel.add(acc);

		acc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = nm.getText().toString();
				String phone = ph.getText().toString();
				String age = ag.getText().toString();
				String birth = br.getText().toString();

				if (name.isEmpty() == true || phone.isEmpty() == true || age.isEmpty() == true
						|| birth.isEmpty() == true) {
					JOptionPane.showMessageDialog(null, "전부작성해주떄요");
				} else {
					JOptionPane.showMessageDialog(null, "안녕~~");
					User a = new User(name, phone, age, birth);
					list.add(a);
					for (User u : list) {
						System.out.println("Name : " + u.getName() + " /Phone : " + u.getPhone() + " /Age : "
								+ u.getAge() + " /Birth : " + u.getBirth());
					}
					nm.setText("");
					ph.setText("");
					ag.setText("");
					br.setText("");
				}
			}
		});
		JMenuBar menuBar = new JMenuBar();
		frmLoginProgram.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setForeground(Color.BLACK);
		mnFile.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		mnFile.setBackground(Color.BLACK);
		menuBar.add(mnFile);

		JMenuItem mntmNewMenuItem = new JMenuItem("로그인화면");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				JoinPanel.setVisible(false);
			}
		});

		mnFile.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("회원가입");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				JoinPanel.setVisible(true);
			}
		});

		mnFile.add(mntmNewMenuItem_1);

		JMenuItem mntmExit = new JMenuItem("프로그램종료");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		mnFile.add(mntmExit);

		JMenu mnMenu = new JMenu("About");
		mnMenu.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		mnMenu.setForeground(Color.BLACK);
		menuBar.add(mnMenu);

		JMenuItem mntmInformation = new JMenuItem("도움말");
		mnMenu.add(mntmInformation);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String _id = id.getText().toString();
				String _pwd = pwd.getText().toString();

				if (_id.equals("admin") && _pwd.equals("1234")) {
					JOptionPane.showMessageDialog(null, "로그인 성공해부렀다");
					panel.setVisible(false);
					JoinPanel.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "로그인 실패해부렀다");
				}

				id.setText("");
				pwd.setText("");
			}
		});
	}

	public static void main(String[] args) {
		LoginWindow view = new LoginWindow();
		view.frmLoginProgram.setVisible(true);
	}
}
