import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;

public class Editbuild_page {

	public JFrame editbuild;
	public JButton edit;
	public JButton back;
	public JLabel success;
	public JTextField region;
	public JTextField village;
	public JTextField neighborhood;
	public JTextField tank;
	public JTextField land;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editbuild_page window = new Editbuild_page();
					window.editbuild.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Editbuild_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		editbuild = new JFrame();
		editbuild.setTitle("Edit Building's Information");
		editbuild.getContentPane().setBackground(new Color(175, 238, 238));
		editbuild.getContentPane().setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		editbuild.getContentPane().add(panel);
		
		JLabel lblEditBuildingsInformation = new JLabel("Edit Building's Information");
		lblEditBuildingsInformation.setFont(new Font("Times New Roman", Font.BOLD, 37));
		panel.add(lblEditBuildingsInformation);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 238, 238));
		editbuild.getContentPane().add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{108, 108, 108, 108, 0};
		gbl_panel_1.rowHeights = new int[]{23, 23, 23, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel label = new JLabel("Region No.");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		panel_1.add(label, gbc_label);
		
		region = new JTextField();
		region.setFont(new Font("Times New Roman", Font.BOLD, 12));
		region.setColumns(10);
		GridBagConstraints gbc_region = new GridBagConstraints();
		gbc_region.fill = GridBagConstraints.HORIZONTAL;
		gbc_region.insets = new Insets(0, 0, 5, 5);
		gbc_region.gridx = 1;
		gbc_region.gridy = 0;
		panel_1.add(region, gbc_region);
		
		JLabel label_1 = new JLabel("Village name");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 2;
		gbc_label_1.gridy = 0;
		panel_1.add(label_1, gbc_label_1);
		
		village = new JTextField();
		village.setFont(new Font("Times New Roman", Font.BOLD, 12));
		village.setColumns(10);
		GridBagConstraints gbc_village = new GridBagConstraints();
		gbc_village.fill = GridBagConstraints.HORIZONTAL;
		gbc_village.insets = new Insets(0, 0, 5, 0);
		gbc_village.gridx = 3;
		gbc_village.gridy = 0;
		panel_1.add(village, gbc_village);
		
		JLabel label_2 = new JLabel("Neighborhood No.");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 1;
		panel_1.add(label_2, gbc_label_2);
		
		neighborhood = new JTextField();
		neighborhood.setFont(new Font("Times New Roman", Font.BOLD, 12));
		neighborhood.setColumns(10);
		GridBagConstraints gbc_neighborhood = new GridBagConstraints();
		gbc_neighborhood.fill = GridBagConstraints.HORIZONTAL;
		gbc_neighborhood.insets = new Insets(0, 0, 5, 5);
		gbc_neighborhood.gridx = 1;
		gbc_neighborhood.gridy = 1;
		panel_1.add(neighborhood, gbc_neighborhood);
		
		JLabel label_3 = new JLabel("Tank No.");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.EAST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 2;
		gbc_label_3.gridy = 1;
		panel_1.add(label_3, gbc_label_3);
		
		tank = new JTextField();
		tank.setColumns(10);
		GridBagConstraints gbc_tank = new GridBagConstraints();
		gbc_tank.fill = GridBagConstraints.HORIZONTAL;
		gbc_tank.insets = new Insets(0, 0, 5, 0);
		gbc_tank.gridx = 3;
		gbc_tank.gridy = 1;
		panel_1.add(tank, gbc_tank);
		
		JLabel label_4 = new JLabel("Land No.");
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.EAST;
		gbc_label_4.insets = new Insets(0, 0, 0, 5);
		gbc_label_4.gridx = 1;
		gbc_label_4.gridy = 2;
		panel_1.add(label_4, gbc_label_4);
		
		land = new JTextField();
		land.setFont(new Font("Times New Roman", Font.BOLD, 12));
		land.setColumns(10);
		GridBagConstraints gbc_land = new GridBagConstraints();
		gbc_land.fill = GridBagConstraints.HORIZONTAL;
		gbc_land.insets = new Insets(0, 0, 0, 5);
		gbc_land.gridx = 2;
		gbc_land.gridy = 2;
		panel_1.add(land, gbc_land);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(175, 238, 238));
		editbuild.getContentPane().add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] {390, 50};
		gbl_panel_2.rowHeights = new int[] {35, 35};
		gbl_panel_2.columnWeights = new double[]{1.0, 0.0};
		gbl_panel_2.rowWeights = new double[]{1.0, 1.0};
		panel_2.setLayout(gbl_panel_2);
		
		edit = new JButton("Edit");
		edit.setForeground(new Color(255, 250, 250));
		edit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		edit.setBackground(new Color(47, 79, 79));
		GridBagConstraints gbc_edit = new GridBagConstraints();
		gbc_edit.fill = GridBagConstraints.HORIZONTAL;
		gbc_edit.insets = new Insets(0, 0, 5, 5);
		gbc_edit.gridx = 0;
		gbc_edit.gridy = 0;
		panel_2.add(edit, gbc_edit);
		
		back = new JButton("Back");
		back.setForeground(new Color(255, 250, 250));
		back.setFont(new Font("Times New Roman", Font.BOLD, 20));
		back.setBackground(new Color(47, 79, 79));
		GridBagConstraints gbc_back = new GridBagConstraints();
		gbc_back.insets = new Insets(0, 0, 5, 0);
		gbc_back.fill = GridBagConstraints.HORIZONTAL;
		gbc_back.gridx = 1;
		gbc_back.gridy = 0;
		panel_2.add(back, gbc_back);
		
		success = new JLabel("Un\\Success");
		success.setForeground(new Color(0, 0, 0));
		success.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_success = new GridBagConstraints();
		gbc_success.gridwidth = 2;
		gbc_success.insets = new Insets(0, 0, 0, 5);
		gbc_success.gridx = 0;
		gbc_success.gridy = 1;
		panel_2.add(success, gbc_success);
		editbuild.setBounds(100, 100, 450, 300);
		editbuild.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
