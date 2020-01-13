import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class Employees_page {

	public JFrame Empportal;
	public JTextField ID;
	public JButton search;
	public JLabel fname;
	public JLabel sname;
	public JLabel tname;
	public JLabel lname;
	public JLabel date;
	public JLabel pos;
	public JLabel salary;
	public JLabel yinc;
	public JButton edit;
	public JButton add;
	public JButton back;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employees_page window = new Employees_page();
					window.Empportal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Employees_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Empportal = new JFrame();
		Empportal.setTitle("Employee's Portal");
		Empportal.getContentPane().setBackground(new Color(175, 238, 238));
		Empportal.setBounds(100, 100, 450, 300);
		Empportal.setLocationRelativeTo(null);
		Empportal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Empportal.getContentPane().setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		Empportal.getContentPane().add(panel);
		
		JLabel lblEmployeesPortal = new JLabel("Employee's Portal");
		lblEmployeesPortal.setFont(new Font("Times New Roman", Font.BOLD, 50));
		panel.add(lblEmployeesPortal);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 238, 238));
		Empportal.getContentPane().add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] {165, 165, 100};
		gbl_panel_1.rowHeights = new int[] {85};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0};
		gbl_panel_1.rowWeights = new double[]{1.0};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblEmpId = new JLabel("Emp ID");
		lblEmpId.setFont(new Font("Times New Roman", Font.BOLD, 25));
		GridBagConstraints gbc_lblEmpId = new GridBagConstraints();
		gbc_lblEmpId.anchor = GridBagConstraints.EAST;
		gbc_lblEmpId.insets = new Insets(0, 0, 0, 5);
		gbc_lblEmpId.gridx = 0;
		gbc_lblEmpId.gridy = 0;
		panel_1.add(lblEmpId, gbc_lblEmpId);
		
		ID = new JTextField();
		GridBagConstraints gbc_ID = new GridBagConstraints();
		gbc_ID.insets = new Insets(0, 0, 0, 5);
		gbc_ID.fill = GridBagConstraints.HORIZONTAL;
		gbc_ID.gridx = 1;
		gbc_ID.gridy = 0;
		panel_1.add(ID, gbc_ID);
		ID.setColumns(10);
		
		search = new JButton("Search");
		search.setForeground(new Color(255, 250, 250));
		search.setFont(new Font("Times New Roman", Font.BOLD, 15));
		search.setBackground(new Color(47, 79, 79));
		GridBagConstraints gbc_search = new GridBagConstraints();
		gbc_search.fill = GridBagConstraints.HORIZONTAL;
		gbc_search.gridx = 2;
		gbc_search.gridy = 0;
		panel_1.add(search, gbc_search);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(47, 79, 79));
		Empportal.getContentPane().add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] {86, 87, 87, 87, 87};
		gbl_panel_2.rowHeights = new int[] {30, 30, 30};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0};
		gbl_panel_2.rowWeights = new double[]{1.0, 1.0, 1.0};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setForeground(new Color(255, 250, 250));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_2.add(lblNewLabel, gbc_lblNewLabel);
		
		fname = DefaultComponentFactory.getInstance().createLabel("fname");
		fname.setFont(new Font("Times New Roman", Font.BOLD, 15));
		fname.setForeground(new Color(255, 250, 250));
		GridBagConstraints gbc_fname = new GridBagConstraints();
		gbc_fname.anchor = GridBagConstraints.NORTH;
		gbc_fname.insets = new Insets(0, 0, 5, 5);
		gbc_fname.gridx = 1;
		gbc_fname.gridy = 0;
		panel_2.add(fname, gbc_fname);
		
		sname = DefaultComponentFactory.getInstance().createLabel("sname");
		sname.setForeground(new Color(255, 250, 250));
		sname.setFont(new Font("Times New Roman", Font.BOLD, 15));
		GridBagConstraints gbc_sname = new GridBagConstraints();
		gbc_sname.anchor = GridBagConstraints.NORTH;
		gbc_sname.insets = new Insets(0, 0, 5, 5);
		gbc_sname.gridx = 2;
		gbc_sname.gridy = 0;
		panel_2.add(sname, gbc_sname);
		
		tname = DefaultComponentFactory.getInstance().createLabel("tname");
		tname.setForeground(new Color(255, 250, 250));
		tname.setFont(new Font("Times New Roman", Font.BOLD, 15));
		GridBagConstraints gbc_tname = new GridBagConstraints();
		gbc_tname.anchor = GridBagConstraints.NORTH;
		gbc_tname.insets = new Insets(0, 0, 5, 5);
		gbc_tname.gridx = 3;
		gbc_tname.gridy = 0;
		panel_2.add(tname, gbc_tname);
		
		lname = DefaultComponentFactory.getInstance().createLabel("lname");
		lname.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lname.setForeground(new Color(255, 250, 250));
		GridBagConstraints gbc_lname = new GridBagConstraints();
		gbc_lname.anchor = GridBagConstraints.NORTH;
		gbc_lname.insets = new Insets(0, 0, 5, 0);
		gbc_lname.gridx = 4;
		gbc_lname.gridy = 0;
		panel_2.add(lname, gbc_lname);
		
		JLabel lblHireDate = new JLabel("Hire date:");
		lblHireDate.setForeground(new Color(255, 250, 250));
		lblHireDate.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblHireDate = new GridBagConstraints();
		gbc_lblHireDate.gridwidth = 2;
		gbc_lblHireDate.anchor = GridBagConstraints.EAST;
		gbc_lblHireDate.insets = new Insets(0, 0, 5, 5);
		gbc_lblHireDate.gridx = 0;
		gbc_lblHireDate.gridy = 1;
		panel_2.add(lblHireDate, gbc_lblHireDate);
		
		date = DefaultComponentFactory.getInstance().createLabel("DD\\MM\\YY");
		date.setForeground(new Color(255, 250, 250));
		date.setFont(new Font("Times New Roman", Font.BOLD, 15));
		GridBagConstraints gbc_date = new GridBagConstraints();
		gbc_date.insets = new Insets(0, 0, 5, 5);
		gbc_date.gridx = 2;
		gbc_date.gridy = 1;
		panel_2.add(date, gbc_date);
		
		JLabel lblPosition = new JLabel("Position:");
		lblPosition.setForeground(new Color(255, 250, 250));
		lblPosition.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblPosition = new GridBagConstraints();
		gbc_lblPosition.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosition.gridx = 3;
		gbc_lblPosition.gridy = 1;
		panel_2.add(lblPosition, gbc_lblPosition);
		
		pos = DefaultComponentFactory.getInstance().createLabel("POS");
		pos.setFont(new Font("Times New Roman", Font.BOLD, 15));
		pos.setForeground(new Color(255, 250, 250));
		GridBagConstraints gbc_pos = new GridBagConstraints();
		gbc_pos.insets = new Insets(0, 0, 5, 0);
		gbc_pos.gridx = 4;
		gbc_pos.gridy = 1;
		panel_2.add(pos, gbc_pos);
		
		JLabel lblSalary = new JLabel("Salary:");
		lblSalary.setForeground(new Color(255, 250, 250));
		lblSalary.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblSalary = new GridBagConstraints();
		gbc_lblSalary.anchor = GridBagConstraints.SOUTH;
		gbc_lblSalary.insets = new Insets(0, 0, 0, 5);
		gbc_lblSalary.gridx = 0;
		gbc_lblSalary.gridy = 2;
		panel_2.add(lblSalary, gbc_lblSalary);
		
		salary = DefaultComponentFactory.getInstance().createLabel("$$");
		salary.setForeground(new Color(255, 250, 250));
		salary.setFont(new Font("Times New Roman", Font.BOLD, 15));
		GridBagConstraints gbc_salary = new GridBagConstraints();
		gbc_salary.anchor = GridBagConstraints.SOUTH;
		gbc_salary.insets = new Insets(0, 0, 0, 5);
		gbc_salary.gridx = 1;
		gbc_salary.gridy = 2;
		panel_2.add(salary, gbc_salary);
		
		JLabel lblYearlyIncreases = new JLabel("Yearly increases:");
		lblYearlyIncreases.setForeground(new Color(255, 250, 250));
		lblYearlyIncreases.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblYearlyIncreases = new GridBagConstraints();
		gbc_lblYearlyIncreases.anchor = GridBagConstraints.SOUTH;
		gbc_lblYearlyIncreases.gridwidth = 2;
		gbc_lblYearlyIncreases.insets = new Insets(0, 0, 0, 5);
		gbc_lblYearlyIncreases.gridx = 2;
		gbc_lblYearlyIncreases.gridy = 2;
		panel_2.add(lblYearlyIncreases, gbc_lblYearlyIncreases);
		
		yinc = DefaultComponentFactory.getInstance().createLabel("$$");
		yinc.setForeground(new Color(255, 250, 250));
		yinc.setFont(new Font("Times New Roman", Font.BOLD, 15));
		GridBagConstraints gbc_yinc = new GridBagConstraints();
		gbc_yinc.anchor = GridBagConstraints.SOUTH;
		gbc_yinc.gridx = 4;
		gbc_yinc.gridy = 2;
		panel_2.add(yinc, gbc_yinc);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(175, 238, 238));
		Empportal.getContentPane().add(panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] {390, 50};
		gbl_panel_3.rowHeights = new int[] {30, 30};
		gbl_panel_3.columnWeights = new double[]{1.0, 0.0};
		gbl_panel_3.rowWeights = new double[]{1.0, 1.0};
		panel_3.setLayout(gbl_panel_3);
		
		edit = new JButton("Edit Information");
		edit.setForeground(new Color(255, 250, 250));
		edit.setBackground(new Color(47, 79, 79));
		edit.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		GridBagConstraints gbc_edit = new GridBagConstraints();
		gbc_edit.gridwidth = 2;
		gbc_edit.insets = new Insets(0, 0, 5, 0);
		gbc_edit.fill = GridBagConstraints.HORIZONTAL;
		gbc_edit.gridx = 0;
		gbc_edit.gridy = 0;
		panel_3.add(edit, gbc_edit);
		
		add = new JButton("Add Emp");
		add.setForeground(new Color(255, 250, 250));
		add.setBackground(new Color(47, 79, 79));
		add.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		GridBagConstraints gbc_add = new GridBagConstraints();
		gbc_add.fill = GridBagConstraints.HORIZONTAL;
		gbc_add.insets = new Insets(0, 0, 0, 5);
		gbc_add.gridx = 0;
		gbc_add.gridy = 1;
		panel_3.add(add, gbc_add);
		
		back = new JButton("Back");
		back.setForeground(new Color(255, 250, 250));
		back.setBackground(new Color(47, 79, 79));
		back.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_back = new GridBagConstraints();
		gbc_back.anchor = GridBagConstraints.EAST;
		gbc_back.gridx = 1;
		gbc_back.gridy = 1;
		panel_3.add(back, gbc_back);
	}

}
