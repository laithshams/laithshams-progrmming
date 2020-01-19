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
	public JButton cash;

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
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(175, 238, 238));
		homepage.getContentPane().add(panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[] {450};
		gbl_panel_4.rowHeights = new int[] {45};
		gbl_panel_4.columnWeights = new double[]{1.0};
		gbl_panel_4.rowWeights = new double[]{0.0};
		panel_4.setLayout(gbl_panel_4);
		
		cash = new JButton("Cash");
		cash.setBackground(new Color(47, 79, 79));
		cash.setForeground(new Color(255, 250, 250));
		GridBagConstraints gbc_cash = new GridBagConstraints();
		gbc_cash.fill = GridBagConstraints.HORIZONTAL;
		gbc_cash.gridx = 0;
		gbc_cash.gridy = 0;
		panel_4.add(cash, gbc_cash);
		cash.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
	}

}
