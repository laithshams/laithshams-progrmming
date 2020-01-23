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
import java.awt.FlowLayout;

public class Addbill_page {

	public JFrame addbill;
	public JTextField amount;
	public JButton add;
	public JButton back;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addbill_page window = new Addbill_page();
					window.addbill.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Addbill_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		addbill = new JFrame();
		addbill.setTitle("Add bill");
		addbill.getContentPane().setBackground(new Color(175, 238, 238));
		addbill.getContentPane().setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		addbill.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblAddBills = new JLabel("Add bill");
		lblAddBills.setFont(new Font("Times New Roman", Font.BOLD, 50));
		panel.add(lblAddBills);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 238, 238));
		addbill.getContentPane().add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] {150, 150, 150};
		gbl_panel_1.rowHeights = new int[] {85};
		gbl_panel_1.columnWeights = new double[]{1.0, 0.0, 1.0};
		gbl_panel_1.rowWeights = new double[]{1.0};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("Times New Roman", Font.BOLD, 25));
		GridBagConstraints gbc_lblAmount = new GridBagConstraints();
		gbc_lblAmount.gridwidth = 2;
		gbc_lblAmount.insets = new Insets(0, 0, 0, 5);
		gbc_lblAmount.gridx = 0;
		gbc_lblAmount.gridy = 0;
		panel_1.add(lblAmount, gbc_lblAmount);
		
		amount = new JTextField();
		amount.setFont(new Font("Times New Roman", Font.BOLD, 12));
		amount.setColumns(10);
		GridBagConstraints gbc_amount = new GridBagConstraints();
		gbc_amount.fill = GridBagConstraints.HORIZONTAL;
		gbc_amount.gridx = 2;
		gbc_amount.gridy = 0;
		panel_1.add(amount, gbc_amount);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(175, 238, 238));
		addbill.getContentPane().add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] {340, 100};
		gbl_panel_2.rowHeights = new int[] {65};
		gbl_panel_2.columnWeights = new double[]{1.0, 0.0};
		gbl_panel_2.rowWeights = new double[]{1.0};
		panel_2.setLayout(gbl_panel_2);
		
		add = new JButton("Add");
		GridBagConstraints gbc_add = new GridBagConstraints();
		gbc_add.fill = GridBagConstraints.HORIZONTAL;
		gbc_add.insets = new Insets(0, 0, 0, 5);
		gbc_add.gridx = 0;
		gbc_add.gridy = 0;
		panel_2.add(add, gbc_add);
		add.setForeground(new Color(255, 250, 250));
		add.setFont(new Font("Times New Roman", Font.BOLD, 13));
		add.setBackground(new Color(47, 79, 79));
		
		back = new JButton("Back");
		GridBagConstraints gbc_back = new GridBagConstraints();
		gbc_back.fill = GridBagConstraints.HORIZONTAL;
		gbc_back.anchor = GridBagConstraints.SOUTH;
		gbc_back.gridx = 1;
		gbc_back.gridy = 0;
		panel_2.add(back, gbc_back);
		back.setForeground(new Color(255, 250, 250));
		back.setBackground(new Color(47, 79, 79));
		back.setFont(new Font("Times New Roman", Font.BOLD, 13));
		addbill.setBounds(100, 100, 450, 300);
		addbill.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
