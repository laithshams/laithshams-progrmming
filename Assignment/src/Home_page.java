import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class Home_page {

	public JFrame homepage;
	public JButton bportal;
	public JButton eportal;
	public JButton calc;
	public JButton complaint;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_page window = new Home_page();
					window.homepage.setVisible(true);
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
		homepage = new JFrame();
		homepage.setTitle("Home page");
		homepage.getContentPane().setBackground(new Color(175, 238, 238));
		homepage.setBounds(100, 100, 450, 300);
		homepage.setLocationRelativeTo(null);
		homepage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		homepage.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		homepage.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Ministry of Water and Irrigation");
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 31));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 238, 238));
		homepage.getContentPane().add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] {450};
		gbl_panel_1.rowHeights = new int[] {45};
		gbl_panel_1.columnWeights = new double[]{1.0};
		gbl_panel_1.rowWeights = new double[]{0.0};
		panel_1.setLayout(gbl_panel_1);
		
		bportal = new JButton("Building's Portal");
		bportal.setForeground(new Color(255, 250, 250));
		bportal.setBackground(new Color(47, 79, 79));
		bportal.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		GridBagConstraints gbc_bportal = new GridBagConstraints();
		gbc_bportal.fill = GridBagConstraints.HORIZONTAL;
		gbc_bportal.gridx = 0;
		gbc_bportal.gridy = 0;
		panel_1.add(bportal, gbc_bportal);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(175, 238, 238));
		homepage.getContentPane().add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] {450};
		gbl_panel_2.rowHeights = new int[] {45};
		gbl_panel_2.columnWeights = new double[]{1.0};
		gbl_panel_2.rowWeights = new double[]{0.0};
		panel_2.setLayout(gbl_panel_2);
		
		eportal = new JButton("Employee's Portal");
		eportal.setBackground(new Color(47, 79, 79));
		eportal.setForeground(new Color(255, 250, 250));
		eportal.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		GridBagConstraints gbc_eportal = new GridBagConstraints();
		gbc_eportal.fill = GridBagConstraints.HORIZONTAL;
		gbc_eportal.gridx = 0;
		gbc_eportal.gridy = 0;
		panel_2.add(eportal, gbc_eportal);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(175, 238, 238));
		homepage.getContentPane().add(panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] {450};
		gbl_panel_3.rowHeights = new int[] {45};
		gbl_panel_3.columnWeights = new double[]{1.0};
		gbl_panel_3.rowWeights = new double[]{0.0};
		panel_3.setLayout(gbl_panel_3);
		
		calc = new JButton("Water Calculator");
		calc.setForeground(new Color(255, 250, 250));
		calc.setBackground(new Color(47, 79, 79));
		calc.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		GridBagConstraints gbc_calc = new GridBagConstraints();
		gbc_calc.fill = GridBagConstraints.HORIZONTAL;
		gbc_calc.gridx = 0;
		gbc_calc.gridy = 0;
		panel_3.add(calc, gbc_calc);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(175, 238, 238));
		homepage.getContentPane().add(panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[] {450};
		gbl_panel_4.rowHeights = new int[] {45};
		gbl_panel_4.columnWeights = new double[]{1.0};
		gbl_panel_4.rowWeights = new double[]{0.0};
		panel_4.setLayout(gbl_panel_4);
		
		complaint = new JButton("Citizen Complaint");
		complaint.setBackground(new Color(47, 79, 79));
		complaint.setForeground(new Color(255, 250, 250));
		GridBagConstraints gbc_complaint = new GridBagConstraints();
		gbc_complaint.fill = GridBagConstraints.HORIZONTAL;
		gbc_complaint.gridx = 0;
		gbc_complaint.gridy = 0;
		panel_4.add(complaint, gbc_complaint);
		complaint.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
	}

}
