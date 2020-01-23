import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridLayout;

public class Login_page {

	public JFrame loginsystem;
	public JTextField username;
	public JPasswordField password;
	public JButton login;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_page window = new Login_page();
					window.loginsystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		loginsystem = new JFrame();
		loginsystem.getContentPane().setBackground(new Color(175, 238, 238));
		loginsystem.setTitle("Login System");
		loginsystem.setBounds(100, 100, 450, 300);
		loginsystem.setLocationRelativeTo(null);
		loginsystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginsystem.getContentPane().setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		loginsystem.getContentPane().add(panel);
		
		JLabel lblLoginSystem = new JLabel("Login System");
		lblLoginSystem.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 50));
		panel.add(lblLoginSystem);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 238, 238));
		loginsystem.getContentPane().add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] {150, 150, 95};
		gbl_panel_1.rowHeights = new int[] {70};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0};
		gbl_panel_1.rowWeights = new double[]{1.0};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 33));
		GridBagConstraints gbc_lblUsername = new GridBagConstraints();
		gbc_lblUsername.anchor = GridBagConstraints.EAST;
		gbc_lblUsername.insets = new Insets(0, 0, 0, 5);
		gbc_lblUsername.gridx = 0;
		gbc_lblUsername.gridy = 0;
		panel_1.add(lblUsername, gbc_lblUsername);
		
		username = new JTextField();
		username.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_username = new GridBagConstraints();
		gbc_username.insets = new Insets(5, 0, 0, 0);
		gbc_username.fill = GridBagConstraints.HORIZONTAL;
		gbc_username.gridx = 1;
		gbc_username.gridy = 0;
		panel_1.add(username, gbc_username);
		username.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(175, 238, 238));
		loginsystem.getContentPane().add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] {150, 150, 95};
		gbl_panel_2.rowHeights = new int[] {70};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0};
		gbl_panel_2.rowWeights = new double[]{1.0};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 33));
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.EAST;
		gbc_lblPassword.insets = new Insets(0, 0, 0, 5);
		gbc_lblPassword.gridx = 0;
		gbc_lblPassword.gridy = 0;
		panel_2.add(lblPassword, gbc_lblPassword);
		
		password = new JPasswordField();
		password.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_password = new GridBagConstraints();
		gbc_password.fill = GridBagConstraints.HORIZONTAL;
		gbc_password.gridx = 1;
		gbc_password.gridy = 0;
		panel_2.add(password, gbc_password);
		
		login = new JButton("Login");
		login.setForeground(new Color(255, 250, 250));
		GridBagConstraints gbc_login = new GridBagConstraints();
		gbc_login.anchor = GridBagConstraints.SOUTH;
		gbc_login.gridx = 2;
		gbc_login.gridy = 0;
		panel_2.add(login, gbc_login);
		login.setBackground(new Color(47, 79, 79));
		login.setFont(new Font("Times New Roman", Font.BOLD, 25));
	}

}
