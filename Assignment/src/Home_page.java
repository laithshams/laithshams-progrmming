import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class Home_page {

	private JFrame frmHomePage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_page window = new Home_page();
					window.frmHomePage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHomePage = new JFrame();
		frmHomePage.setTitle("Home page");
		frmHomePage.getContentPane().setBackground(Color.CYAN);
		frmHomePage.setBounds(100, 100, 450, 300);
		frmHomePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {430};
		gridBagLayout.rowHeights = new int[] {60, 40, 40, 40, 40, 40};
		gridBagLayout.columnWeights = new double[]{1.0};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0};
		frmHomePage.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Ministry of Water and Irrigation");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		frmHomePage.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JButton btnNewButton = new JButton("Building's Portal");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 1;
		frmHomePage.getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		JButton btnEmployeesPortal = new JButton("Employee's Portal");
		btnEmployeesPortal.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		GridBagConstraints gbc_btnEmployeesPortal = new GridBagConstraints();
		gbc_btnEmployeesPortal.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEmployeesPortal.insets = new Insets(0, 0, 5, 0);
		gbc_btnEmployeesPortal.gridx = 0;
		gbc_btnEmployeesPortal.gridy = 2;
		frmHomePage.getContentPane().add(btnEmployeesPortal, gbc_btnEmployeesPortal);
		
		JButton btnWaterCalculator = new JButton("Water Calculator");
		btnWaterCalculator.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		GridBagConstraints gbc_btnWaterCalculator = new GridBagConstraints();
		gbc_btnWaterCalculator.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnWaterCalculator.insets = new Insets(0, 0, 5, 0);
		gbc_btnWaterCalculator.gridx = 0;
		gbc_btnWaterCalculator.gridy = 3;
		frmHomePage.getContentPane().add(btnWaterCalculator, gbc_btnWaterCalculator);
		
		JButton btnCitizenComplaint = new JButton("Citizen Complaint");
		btnCitizenComplaint.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		GridBagConstraints gbc_btnCitizenComplaint = new GridBagConstraints();
		gbc_btnCitizenComplaint.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCitizenComplaint.insets = new Insets(0, 0, 5, 0);
		gbc_btnCitizenComplaint.gridx = 0;
		gbc_btnCitizenComplaint.gridy = 4;
		frmHomePage.getContentPane().add(btnCitizenComplaint, gbc_btnCitizenComplaint);
		
		JButton btnNewButton_1 = new JButton("Cash");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 5;
		frmHomePage.getContentPane().add(btnNewButton_1, gbc_btnNewButton_1);
	}

}
