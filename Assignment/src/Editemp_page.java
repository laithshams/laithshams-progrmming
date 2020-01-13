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
import javax.swing.JTextField;
import javax.swing.JButton;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class Editemp_page {

	public JFrame editemp;
	public JTextField position;
	public JTextField salary;
	public JTextField yinc;
	public JButton edit;
	public JButton back;
	public JLabel success;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editemp_page window = new Editemp_page();
					window.editemp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Editemp_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		editemp = new JFrame();
		editemp.getContentPane().setBackground(new Color(175, 238, 238));
		editemp.getContentPane().setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		editemp.getContentPane().add(panel);
		
		JLabel lblEditEmployeesInformation = new JLabel("Edit Employee's Information");
		lblEditEmployeesInformation.setFont(new Font("Times New Roman", Font.BOLD, 35));
		panel.add(lblEditEmployeesInformation);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 238, 238));
		editemp.getContentPane().add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] {145, 145, 145};
		gbl_panel_1.rowHeights = new int[] {30, 30, 30};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0};
		gbl_panel_1.rowWeights = new double[]{0.0};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblPosition = new JLabel("Position");
		lblPosition.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblPosition = new GridBagConstraints();
		gbc_lblPosition.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosition.gridx = 0;
		gbc_lblPosition.gridy = 0;
		panel_1.add(lblPosition, gbc_lblPosition);
		
		position = new JTextField();
		GridBagConstraints gbc_position = new GridBagConstraints();
		gbc_position.insets = new Insets(0, 0, 5, 5);
		gbc_position.fill = GridBagConstraints.HORIZONTAL;
		gbc_position.gridx = 1;
		gbc_position.gridy = 0;
		panel_1.add(position, gbc_position);
		position.setColumns(10);
		
		JLabel lblSallary = new JLabel("Salary");
		lblSallary.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblSallary = new GridBagConstraints();
		gbc_lblSallary.insets = new Insets(0, 0, 5, 5);
		gbc_lblSallary.gridx = 0;
		gbc_lblSallary.gridy = 1;
		panel_1.add(lblSallary, gbc_lblSallary);
		
		salary = new JTextField();
		GridBagConstraints gbc_sallary = new GridBagConstraints();
		gbc_sallary.insets = new Insets(0, 0, 5, 5);
		gbc_sallary.fill = GridBagConstraints.HORIZONTAL;
		gbc_sallary.gridx = 1;
		gbc_sallary.gridy = 1;
		panel_1.add(salary, gbc_sallary);
		salary.setColumns(10);
		
		edit = new JButton("Edit");
		edit.setFont(new Font("Times New Roman", Font.BOLD, 15));
		edit.setForeground(new Color(255, 250, 250));
		edit.setBackground(new Color(47, 79, 79));
		GridBagConstraints gbc_edit = new GridBagConstraints();
		gbc_edit.insets = new Insets(0, 0, 5, 0);
		gbc_edit.gridx = 2;
		gbc_edit.gridy = 1;
		panel_1.add(edit, gbc_edit);
		
		JLabel lblYearlyIncreases = new JLabel("Yearly increases");
		lblYearlyIncreases.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblYearlyIncreases = new GridBagConstraints();
		gbc_lblYearlyIncreases.insets = new Insets(0, 0, 0, 5);
		gbc_lblYearlyIncreases.gridx = 0;
		gbc_lblYearlyIncreases.gridy = 2;
		panel_1.add(lblYearlyIncreases, gbc_lblYearlyIncreases);
		
		yinc = new JTextField();
		GridBagConstraints gbc_yinc = new GridBagConstraints();
		gbc_yinc.insets = new Insets(0, 0, 0, 5);
		gbc_yinc.fill = GridBagConstraints.HORIZONTAL;
		gbc_yinc.gridx = 1;
		gbc_yinc.gridy = 2;
		panel_1.add(yinc, gbc_yinc);
		yinc.setColumns(10);
		
		back = new JButton("Back");
		back.setForeground(new Color(255, 250, 250));
		back.setFont(new Font("Times New Roman", Font.BOLD, 15));
		back.setBackground(new Color(47, 79, 79));
		GridBagConstraints gbc_back = new GridBagConstraints();
		gbc_back.anchor = GridBagConstraints.SOUTHEAST;
		gbc_back.gridx = 2;
		gbc_back.gridy = 2;
		panel_1.add(back, gbc_back);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(47, 79, 79));
		editemp.getContentPane().add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{220, 220, 0};
		gbl_panel_2.rowHeights = new int[]{65, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel label_1 = new JLabel("Status:");
		label_1.setForeground(new Color(255, 250, 250));
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 0, 5);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 0;
		panel_2.add(label_1, gbc_label_1);
		
		success = DefaultComponentFactory.getInstance().createLabel("Un\\Success");
		success.setForeground(new Color(255, 250, 250));
		success.setFont(new Font("Times New Roman", Font.BOLD, 25));
		GridBagConstraints gbc_success = new GridBagConstraints();
		gbc_success.gridx = 1;
		gbc_success.gridy = 0;
		panel_2.add(success, gbc_success);
		editemp.setBounds(100, 100, 450, 300);
		editemp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
