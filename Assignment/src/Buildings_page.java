import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.Insets;
import javax.swing.JTextField;

public class Buildings_page {

	public JFrame buildportal;
	public JTextField village;
	public JTextField land;
	public JTextField region;
	public JTextField ref;
	public JTextField neighborhood;
	public JTextField tank;
	public JButton owner;
	public JButton edit;
	public JButton add;
	public JButton pay;
	public JButton addbill;
	public JButton back;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buildings_page window = new Buildings_page();
					window.buildportal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Buildings_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		buildportal = new JFrame();
		buildportal.setTitle("Building's Portal page");
		buildportal.getContentPane().setBackground(new Color(175, 238, 238));
		buildportal.setBounds(100, 100, 450, 300);
		buildportal.setLocationRelativeTo(null);
		buildportal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildportal.getContentPane().setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		buildportal.getContentPane().add(panel);
		
		JLabel lblBuildingsPortal = new JLabel("Building's Portal");
		lblBuildingsPortal.setFont(new Font("Times New Roman", Font.BOLD, 50));
		panel.add(lblBuildingsPortal);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 238, 238));
		buildportal.getContentPane().add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] {108, 108, 108, 108};
		gbl_panel_1.rowHeights = new int[] {23, 23, 23};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0};
		gbl_panel_1.rowWeights = new double[]{1.0, 1.0, 1.0};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel = new JLabel("Region No.");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);
		
		region = new JTextField();
		region.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_region = new GridBagConstraints();
		gbc_region.fill = GridBagConstraints.HORIZONTAL;
		gbc_region.insets = new Insets(0, 0, 5, 5);
		gbc_region.gridx = 1;
		gbc_region.gridy = 0;
		panel_1.add(region, gbc_region);
		region.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Village name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 0;
		panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		village = new JTextField();
		village.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_village = new GridBagConstraints();
		gbc_village.fill = GridBagConstraints.HORIZONTAL;
		gbc_village.insets = new Insets(0, 0, 5, 0);
		gbc_village.gridx = 3;
		gbc_village.gridy = 0;
		panel_1.add(village, gbc_village);
		village.setColumns(10);
		
		JLabel label = new JLabel("Neighborhood No.");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.gridx = 0;
		gbc_label.gridy = 1;
		panel_1.add(label, gbc_label);
		
		neighborhood = new JTextField();
		neighborhood.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_neighborhood = new GridBagConstraints();
		gbc_neighborhood.insets = new Insets(0, 0, 5, 5);
		gbc_neighborhood.fill = GridBagConstraints.HORIZONTAL;
		gbc_neighborhood.gridx = 1;
		gbc_neighborhood.gridy = 1;
		panel_1.add(neighborhood, gbc_neighborhood);
		neighborhood.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Land No.");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 1;
		panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		land = new JTextField();
		GridBagConstraints gbc_land = new GridBagConstraints();
		gbc_land.insets = new Insets(0, 0, 5, 0);
		gbc_land.fill = GridBagConstraints.HORIZONTAL;
		gbc_land.gridx = 3;
		gbc_land.gridy = 1;
		panel_1.add(land, gbc_land);
		land.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Tank No.");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 2;
		panel_1.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		tank = new JTextField();
		tank.setFont(new Font("Times New Roman", Font.BOLD, 12));
		tank.setColumns(10);
		GridBagConstraints gbc_tank = new GridBagConstraints();
		gbc_tank.insets = new Insets(0, 0, 0, 5);
		gbc_tank.fill = GridBagConstraints.HORIZONTAL;
		gbc_tank.gridx = 1;
		gbc_tank.gridy = 2;
		panel_1.add(tank, gbc_tank);
		
		JLabel lblNewLabel_4 = new JLabel("Ref No.(bills only)");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_4.gridx = 2;
		gbc_lblNewLabel_4.gridy = 2;
		panel_1.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		ref = new JTextField();
		ref.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_ref = new GridBagConstraints();
		gbc_ref.fill = GridBagConstraints.HORIZONTAL;
		gbc_ref.gridx = 3;
		gbc_ref.gridy = 2;
		panel_1.add(ref, gbc_ref);
		ref.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(175, 238, 238));
		buildportal.getContentPane().add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] {110, 110, 110, 110};
		gbl_panel_2.rowHeights = new int[] {46, 46};
		gbl_panel_2.columnWeights = new double[]{1.0, 1.0, 0.0, 1.0};
		gbl_panel_2.rowWeights = new double[]{1.0, 1.0};
		panel_2.setLayout(gbl_panel_2);
		
		owner = new JButton("Owner");
		owner.setBackground(new Color(47, 79, 79));
		owner.setForeground(new Color(255, 250, 250));
		owner.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_owner = new GridBagConstraints();
		gbc_owner.fill = GridBagConstraints.HORIZONTAL;
		gbc_owner.insets = new Insets(0, 0, 5, 5);
		gbc_owner.gridx = 0;
		gbc_owner.gridy = 0;
		panel_2.add(owner, gbc_owner);
		
		edit = new JButton("Edit Information");
		edit.setForeground(new Color(255, 250, 250));
		edit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		edit.setBackground(new Color(47, 79, 79));
		GridBagConstraints gbc_edit = new GridBagConstraints();
		gbc_edit.gridwidth = 2;
		gbc_edit.fill = GridBagConstraints.HORIZONTAL;
		gbc_edit.insets = new Insets(0, 0, 5, 5);
		gbc_edit.gridx = 1;
		gbc_edit.gridy = 0;
		panel_2.add(edit, gbc_edit);
		
		add = new JButton("Add");
		add.setForeground(new Color(255, 250, 250));
		add.setFont(new Font("Times New Roman", Font.BOLD, 20));
		add.setBackground(new Color(47, 79, 79));
		GridBagConstraints gbc_add = new GridBagConstraints();
		gbc_add.fill = GridBagConstraints.HORIZONTAL;
		gbc_add.insets = new Insets(0, 0, 5, 0);
		gbc_add.gridx = 3;
		gbc_add.gridy = 0;
		panel_2.add(add, gbc_add);
		
		pay = new JButton("Pay bills");
		pay.setForeground(new Color(255, 250, 250));
		pay.setFont(new Font("Times New Roman", Font.BOLD, 20));
		pay.setBackground(new Color(47, 79, 79));
		GridBagConstraints gbc_pay = new GridBagConstraints();
		gbc_pay.fill = GridBagConstraints.HORIZONTAL;
		gbc_pay.insets = new Insets(0, 0, 0, 5);
		gbc_pay.gridx = 0;
		gbc_pay.gridy = 1;
		panel_2.add(pay, gbc_pay);
		
		addbill = new JButton("Add bills");
		addbill.setForeground(new Color(255, 250, 250));
		addbill.setFont(new Font("Times New Roman", Font.BOLD, 20));
		addbill.setBackground(new Color(47, 79, 79));
		GridBagConstraints gbc_addbill = new GridBagConstraints();
		gbc_addbill.fill = GridBagConstraints.HORIZONTAL;
		gbc_addbill.gridwidth = 2;
		gbc_addbill.insets = new Insets(0, 0, 0, 5);
		gbc_addbill.gridx = 1;
		gbc_addbill.gridy = 1;
		panel_2.add(addbill, gbc_addbill);
		
		back = new JButton("Back");
		back.setForeground(new Color(255, 250, 250));
		back.setFont(new Font("Times New Roman", Font.BOLD, 20));
		back.setBackground(new Color(47, 79, 79));
		GridBagConstraints gbc_back = new GridBagConstraints();
		gbc_back.anchor = GridBagConstraints.SOUTHEAST;
		gbc_back.gridx = 3;
		gbc_back.gridy = 1;
		panel_2.add(back, gbc_back);
	}

}
