import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Addemp_page {

	public JFrame addemp;
	public JTextField fname;
	public JTextField sname;
	public JTextField tname;
	public JTextField lname;
	public JTextField date;
	public JTextField position;
	public JTextField salary;
	public JTextField yinc;
	public JButton add;
	public JButton back;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addemp_page window = new Addemp_page();
					window.addemp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Addemp_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		addemp = new JFrame();
		addemp.getContentPane().setBackground(new Color(175, 238, 238));
		addemp.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		addemp.getContentPane().add(panel);
		
		JLabel lblAddEmployee = new JLabel("Add Employee");
		lblAddEmployee.setFont(new Font("Times New Roman", Font.BOLD, 50));
		panel.add(lblAddEmployee);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 238, 238));
		addemp.getContentPane().add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{86, 87, 87, 87, 87, 0};
		gbl_panel_1.rowHeights = new int[]{30, 30, 30, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel label_1 = new JLabel("Name:");
		label_1.setForeground(new Color(0, 0, 0));
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 0;
		panel_1.add(label_1, gbc_label_1);
		
		fname = new JTextField();
		fname.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_fname = new GridBagConstraints();
		gbc_fname.insets = new Insets(0, 0, 5, 5);
		gbc_fname.fill = GridBagConstraints.HORIZONTAL;
		gbc_fname.gridx = 1;
		gbc_fname.gridy = 0;
		panel_1.add(fname, gbc_fname);
		fname.setColumns(10);
		
		sname = new JTextField();
		sname.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_sname = new GridBagConstraints();
		gbc_sname.insets = new Insets(0, 0, 5, 5);
		gbc_sname.fill = GridBagConstraints.HORIZONTAL;
		gbc_sname.gridx = 2;
		gbc_sname.gridy = 0;
		panel_1.add(sname, gbc_sname);
		sname.setColumns(10);
		
		tname = new JTextField();
		tname.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_tname = new GridBagConstraints();
		gbc_tname.insets = new Insets(0, 0, 5, 5);
		gbc_tname.fill = GridBagConstraints.HORIZONTAL;
		gbc_tname.gridx = 3;
		gbc_tname.gridy = 0;
		panel_1.add(tname, gbc_tname);
		tname.setColumns(10);
		
		lname = new JTextField();
		lname.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lname = new GridBagConstraints();
		gbc_lname.insets = new Insets(0, 0, 5, 0);
		gbc_lname.fill = GridBagConstraints.HORIZONTAL;
		gbc_lname.gridx = 4;
		gbc_lname.gridy = 0;
		panel_1.add(lname, gbc_lname);
		lname.setColumns(10);
		
		JLabel label_6 = new JLabel("Hire date:");
		label_6.setForeground(new Color(0, 0, 0));
		label_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.anchor = GridBagConstraints.EAST;
		gbc_label_6.gridwidth = 2;
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 0;
		gbc_label_6.gridy = 1;
		panel_1.add(label_6, gbc_label_6);
		
		date = new JTextField();
		date.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_date = new GridBagConstraints();
		gbc_date.insets = new Insets(0, 0, 5, 5);
		gbc_date.fill = GridBagConstraints.HORIZONTAL;
		gbc_date.gridx = 2;
		gbc_date.gridy = 1;
		panel_1.add(date, gbc_date);
		date.setColumns(10);
		
		JLabel label_8 = new JLabel("Position:");
		label_8.setForeground(new Color(0, 0, 0));
		label_8.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.anchor = GridBagConstraints.EAST;
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 3;
		gbc_label_8.gridy = 1;
		panel_1.add(label_8, gbc_label_8);
		
		position = new JTextField();
		position.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_position = new GridBagConstraints();
		gbc_position.insets = new Insets(0, 0, 5, 0);
		gbc_position.fill = GridBagConstraints.HORIZONTAL;
		gbc_position.gridx = 4;
		gbc_position.gridy = 1;
		panel_1.add(position, gbc_position);
		position.setColumns(10);
		
		JLabel label_10 = new JLabel("Salary:");
		label_10.setForeground(new Color(0, 0, 0));
		label_10.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.anchor = GridBagConstraints.EAST;
		gbc_label_10.insets = new Insets(0, 0, 0, 5);
		gbc_label_10.gridx = 0;
		gbc_label_10.gridy = 2;
		panel_1.add(label_10, gbc_label_10);
		
		salary = new JTextField();
		salary.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_salary = new GridBagConstraints();
		gbc_salary.insets = new Insets(0, 0, 0, 5);
		gbc_salary.fill = GridBagConstraints.HORIZONTAL;
		gbc_salary.gridx = 1;
		gbc_salary.gridy = 2;
		panel_1.add(salary, gbc_salary);
		salary.setColumns(10);
		
		JLabel label_12 = new JLabel("Yearly increases:");
		label_12.setForeground(new Color(0, 0, 0));
		label_12.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.anchor = GridBagConstraints.EAST;
		gbc_label_12.gridwidth = 2;
		gbc_label_12.insets = new Insets(0, 0, 0, 5);
		gbc_label_12.gridx = 2;
		gbc_label_12.gridy = 2;
		panel_1.add(label_12, gbc_label_12);
		
		yinc = new JTextField();
		yinc.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_yinc = new GridBagConstraints();
		gbc_yinc.fill = GridBagConstraints.HORIZONTAL;
		gbc_yinc.gridx = 4;
		gbc_yinc.gridy = 2;
		panel_1.add(yinc, gbc_yinc);
		yinc.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(175, 238, 238));
		addemp.getContentPane().add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] {390, 50};
		gbl_panel_2.rowHeights = new int[] {60};
		gbl_panel_2.columnWeights = new double[]{1.0, 0.0};
		gbl_panel_2.rowWeights = new double[]{1.0};
		panel_2.setLayout(gbl_panel_2);
		
		add = new JButton("Add");
		add.setForeground(new Color(255, 250, 250));
		add.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		add.setBackground(new Color(47, 79, 79));
		GridBagConstraints gbc_add = new GridBagConstraints();
		gbc_add.fill = GridBagConstraints.HORIZONTAL;
		gbc_add.insets = new Insets(0, 0, 5, 5);
		gbc_add.gridx = 0;
		gbc_add.gridy = 0;
		panel_2.add(add, gbc_add);
		
		back = new JButton("Back");
		back.setForeground(new Color(255, 250, 250));
		back.setFont(new Font("Times New Roman", Font.BOLD, 20));
		back.setBackground(new Color(47, 79, 79));
		GridBagConstraints gbc_back = new GridBagConstraints();
		gbc_back.anchor = GridBagConstraints.SOUTH;
		gbc_back.fill = GridBagConstraints.HORIZONTAL;
		gbc_back.insets = new Insets(0, 0, 5, 0);
		gbc_back.gridx = 1;
		gbc_back.gridy = 0;
		panel_2.add(back, gbc_back);
		addemp.setBounds(100, 100, 450, 300);
		addemp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
