import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class Bills_page {

	public JFrame bills;
	public JLabel amount;
	public JButton pay;
	public JButton back;
	public JLabel success;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bills_page window = new Bills_page();
					window.bills.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bills_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		bills = new JFrame();
		bills.setTitle("Pay bills");
		bills.getContentPane().setBackground(new Color(175, 238, 238));
		bills.setBounds(100, 100, 450, 300);
		bills.setLocationRelativeTo(null);
		bills.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bills.getContentPane().setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		bills.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Pay bills");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 50));
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(47, 79, 79));
		bills.getContentPane().add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] {220, 220};
		gbl_panel_2.rowHeights = new int[] {65};
		gbl_panel_2.columnWeights = new double[]{1.0, 1.0};
		gbl_panel_2.rowWeights = new double[]{1.0};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblBilljd = new JLabel("Bill(JD):");
		lblBilljd.setForeground(new Color(255, 250, 250));
		lblBilljd.setFont(new Font("Times New Roman", Font.BOLD, 25));
		GridBagConstraints gbc_lblBilljd = new GridBagConstraints();
		gbc_lblBilljd.insets = new Insets(0, 0, 0, 5);
		gbc_lblBilljd.gridx = 0;
		gbc_lblBilljd.gridy = 0;
		panel_2.add(lblBilljd, gbc_lblBilljd);
		
		amount = DefaultComponentFactory.getInstance().createLabel("$$");
		amount.setForeground(new Color(255, 250, 250));
		amount.setFont(new Font("Times New Roman", Font.BOLD, 25));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.gridx = 1;
		gbc_label.gridy = 0;
		panel_2.add(amount, gbc_label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 238, 238));
		bills.getContentPane().add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] {390, 50};
		gbl_panel_1.rowHeights = new int[] {65};
		gbl_panel_1.columnWeights = new double[]{1.0, 0.0};
		gbl_panel_1.rowWeights = new double[]{1.0};
		panel_1.setLayout(gbl_panel_1);
		
		pay = new JButton("Pay");
		pay.setForeground(new Color(255, 250, 250));
		pay.setFont(new Font("Times New Roman", Font.BOLD, 20));
		pay.setBackground(new Color(47, 79, 79));
		GridBagConstraints gbc_pay = new GridBagConstraints();
		gbc_pay.fill = GridBagConstraints.HORIZONTAL;
		gbc_pay.insets = new Insets(0, 0, 0, 5);
		gbc_pay.gridx = 0;
		gbc_pay.gridy = 0;
		panel_1.add(pay, gbc_pay);
		
		back = new JButton("Back");
		back.setForeground(new Color(255, 250, 250));
		back.setFont(new Font("Times New Roman", Font.BOLD, 20));
		back.setBackground(new Color(47, 79, 79));
		GridBagConstraints gbc_back = new GridBagConstraints();
		gbc_back.fill = GridBagConstraints.HORIZONTAL;
		gbc_back.gridx = 1;
		gbc_back.gridy = 0;
		panel_1.add(back, gbc_back);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(47, 79, 79));
		bills.getContentPane().add(panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] {220, 220};
		gbl_panel_3.rowHeights = new int[] {65};
		gbl_panel_3.columnWeights = new double[]{1.0, 1.0};
		gbl_panel_3.rowWeights = new double[]{1.0};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setForeground(new Color(255, 250, 250));
		lblStatus.setFont(new Font("Times New Roman", Font.BOLD, 25));
		GridBagConstraints gbc_lblStatus = new GridBagConstraints();
		gbc_lblStatus.insets = new Insets(0, 0, 0, 5);
		gbc_lblStatus.gridx = 0;
		gbc_lblStatus.gridy = 0;
		panel_3.add(lblStatus, gbc_lblStatus);
		
		success = DefaultComponentFactory.getInstance().createLabel("Un\\Success");
		success.setForeground(new Color(255, 250, 250));
		success.setFont(new Font("Times New Roman", Font.BOLD, 25));
		GridBagConstraints gbc_lblUnsuccess = new GridBagConstraints();
		gbc_lblUnsuccess.gridx = 1;
		gbc_lblUnsuccess.gridy = 0;
		panel_3.add(success, gbc_lblUnsuccess);
	}

}
