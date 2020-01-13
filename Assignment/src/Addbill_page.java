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
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class Addbill_page {

	public JFrame addbill;
	public JTextField amount;
	public JButton add;
	public JButton back;
	public JLabel success;

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
		gbl_panel_1.columnWidths = new int[] {165, 165, 80, 20};
		gbl_panel_1.rowHeights = new int[] {85};
		gbl_panel_1.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0};
		gbl_panel_1.rowWeights = new double[]{1.0};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("Times New Roman", Font.BOLD, 25));
		GridBagConstraints gbc_lblAmount = new GridBagConstraints();
		gbc_lblAmount.insets = new Insets(0, 0, 0, 5);
		gbc_lblAmount.gridx = 0;
		gbc_lblAmount.gridy = 0;
		panel_1.add(lblAmount, gbc_lblAmount);
		
		amount = new JTextField();
		amount.setColumns(10);
		GridBagConstraints gbc_amount = new GridBagConstraints();
		gbc_amount.fill = GridBagConstraints.HORIZONTAL;
		gbc_amount.insets = new Insets(0, 0, 0, 5);
		gbc_amount.gridx = 1;
		gbc_amount.gridy = 0;
		panel_1.add(amount, gbc_amount);
		
		add = new JButton("Add");
		add.setForeground(new Color(255, 250, 250));
		add.setFont(new Font("Times New Roman", Font.BOLD, 13));
		add.setBackground(new Color(47, 79, 79));
		GridBagConstraints gbc_add = new GridBagConstraints();
		gbc_add.insets = new Insets(0, 0, 0, 5);
		gbc_add.gridx = 2;
		gbc_add.gridy = 0;
		panel_1.add(add, gbc_add);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(47, 79, 79));
		addbill.getContentPane().add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{220, 220, 0};
		gbl_panel_2.rowHeights = new int[]{65, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel label = new JLabel("Status:");
		label.setForeground(new Color(255, 250, 250));
		label.setFont(new Font("Times New Roman", Font.BOLD, 25));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 0, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		panel_2.add(label, gbc_label);
		
		success = DefaultComponentFactory.getInstance().createLabel("Un\\Success");
		success.setForeground(new Color(255, 250, 250));
		success.setFont(new Font("Times New Roman", Font.BOLD, 25));
		GridBagConstraints gbc_success = new GridBagConstraints();
		gbc_success.gridx = 1;
		gbc_success.gridy = 0;
		panel_2.add(success, gbc_success);
		
		back = new JButton("Back");
		back.setForeground(new Color(255, 250, 250));
		back.setBackground(new Color(47, 79, 79));
		back.setFont(new Font("Times New Roman", Font.BOLD, 13));
		GridBagConstraints gbc_back = new GridBagConstraints();
		gbc_back.anchor = GridBagConstraints.SOUTHEAST;
		gbc_back.gridx = 3;
		gbc_back.gridy = 0;
		panel_1.add(back, gbc_back);
		addbill.setBounds(100, 100, 450, 300);
		addbill.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
