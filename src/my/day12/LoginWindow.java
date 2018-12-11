package my.day12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class User {

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

	JTextField id;
	JPasswordField pwd;
	Vector<User> list = new Vector<>();

	public LoginWindow() {
		setTitle("login window");
		setSize(300, 150);

		JPanel panel = new JPanel();
		add(panel);

		panel.add(new JLabel("아이디     "));
		panel.add(id = new JTextField(20));
		panel.add(new JLabel("비밀번호"));
		panel.add(pwd = new JPasswordField(20));

		JButton login = new JButton("login");
		panel.add(login);
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String _id = id.getText().toString();
				String _pwd = pwd.getText().toString();

				if (_id.equals("admin") && _pwd.equals("1234")) {
					JOptionPane.showMessageDialog(null, "로그인 성공!");
				} else if(list.isEmpty() != true) {
					for (User u : list) {
						if (_id.equals(u.getId()) && _pwd.equals(u.getPwd())) {
							JOptionPane.showMessageDialog(null, "로그인 성공!");
						} else {
							JOptionPane.showMessageDialog(null, "로그인 실패!");
						}
					}
				} else {
					JOptionPane.showMessageDialog(null, "실패~");
				}
			}
		});

		JButton cancel = new JButton("cancel");
		panel.add(cancel);
		cancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				id.setText("");
				pwd.setText("");
			}
		});

		JButton signup = new JButton("sing up");
		panel.add(signup);
		signup.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String _id = id.getText().toString();
				String _pwd = pwd.getText().toString();

				User user = new User(_id, _pwd);
				list.add(user);

				for (User u : list) {
					System.out.println(u.getId() + u.getPwd());
				}

			}
		});

		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LoginWindow();
	}
}
