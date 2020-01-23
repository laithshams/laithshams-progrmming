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
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class Cash_page {

	public JFrame cashpage;
	public JLabel cash;
	public JButton zero;
	public JButton back;
	public JLabel success;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cash_page window = new Cash_page();
					window.cashpage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cash_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		cashpage = new JFrame();
		cashpage.getContentPane().setBackground(new Color(175, 238, 238));
		cashpage.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		cashpage.getContentPane().add(panel);
		
		JLabel lblCash = new JLabel("Cash");
		lblCash.setFont(new Font("Times New Roman", Font.BOLD, 35));
		panel.add(lblCash);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 238, 238));
		cashpage.getContentPane().add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] {145, 145, 73, 73};
		gbl_panel_1.rowHeights = new int[] {45, 45};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0};
		gbl_panel_1.rowWeights = new double[]{0.0, 1.0};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblCitizenId = new JLabel("cash:");
		lblCitizenId.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblCitizenId = new GridBagConstraints();
		gbc_lblCitizenId.insets = new Insets(0, 0, 5, 5);
		gbc_lblCitizenId.gridx = 0;
		gbc_lblCitizenId.gridy = 0;
		panel_1.add(lblCitizenId, gbc_lblCitizenId);
		
		cash = DefaultComponentFactory.getInstance().createLabel("$$");
		cash.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_cash = new GridBagConstraints();
		gbc_cash.insets = new Insets(0, 0, 5, 5);
		gbc_cash.gridx = 1;
		gbc_cash.gridy = 0;
		panel_1.add(cash, gbc_cash);
		
		zero = new JButton("Zero");
		zero.setForeground(new Color(255, 250, 250));
		zero.setFont(new Font("Times New Roman", Font.BOLD, 15));
		zero.setBackground(new Color(47, 79, 79));
		GridBagConstraints gbc_zero = new GridBagConstraints();
		gbc_zero.fill = GridBagConstraints.HORIZONTAL;
		gbc_zero.gridwidth = 3;
		gbc_zero.insets = new Insets(0, 0, 0, 5);
		gbc_zero.gridx = 0;
		gbc_zero.gridy = 1;
		panel_1.add(zero, gbc_zero);
		
		back = new JButton("Back");
		back.setForeground(new Color(255, 250, 250));
		back.setFont(new Font("Times New Roman", Font.BOLD, 15));
		back.setBackground(new Color(47, 79, 79));
		GridBagConstraints gbc_back = new GridBagConstraints();
		gbc_back.anchor = GridBagConstraints.SOUTH;
		gbc_back.fill = GridBagConstraints.HORIZONTAL;
		gbc_back.gridx = 3;
		gbc_back.gridy = 1;
		panel_1.add(back, gbc_back);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(47, 79, 79));
		cashpage.getContentPane().add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{220, 220, 0};
		gbl_panel_2.rowHeights = new int[]{65, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel label_4 = new JLabel("Status:");
		label_4.setForeground(new Color(255, 250, 250));
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 25));
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.insets = new Insets(0, 0, 0, 5);
		gbc_label_4.gridx = 0;
		gbc_label_4.gridy = 0;
		panel_2.add(label_4, gbc_label_4);
		
		success = DefaultComponentFactory.getInstance().createLabel("Un\\Success");
		success.setForeground(new Color(255, 250, 250));
		success.setFont(new Font("Times New Roman", Font.BOLD, 25));
		GridBagConstraints gbc_success = new GridBagConstraints();
		gbc_success.gridx = 1;
		gbc_success.gridy = 0;
		panel_2.add(success, gbc_success);
		cashpage.setBounds(100, 100, 450, 300);
		cashpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
