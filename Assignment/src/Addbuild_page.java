import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Window.Type;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Addbuild_page {

	public JFrame addbuild;
	public JTextField ID;
	public JButton add;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addbuild_page window = new Addbuild_page();
					window.addbuild.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Addbuild_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		addbuild = new JFrame();
		addbuild.setType(Type.UTILITY);
		addbuild.setResizable(false);
		addbuild.getContentPane().setBackground(new Color(175, 238, 238));
		addbuild.getContentPane().setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblOwnerId = new JLabel("Owner ID:");
		addbuild.getContentPane().add(lblOwnerId);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 238, 238));
		addbuild.getContentPane().add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] {130, 65};
		gbl_panel_1.rowHeights = new int[] {35};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0};
		gbl_panel_1.rowWeights = new double[]{0.0};
		panel_1.setLayout(gbl_panel_1);
		
		ID = new JTextField();
		ID.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_ID = new GridBagConstraints();
		gbc_ID.gridwidth = 2;
		gbc_ID.insets = new Insets(0, 0, 0, 5);
		gbc_ID.fill = GridBagConstraints.HORIZONTAL;
		gbc_ID.gridx = 0;
		gbc_ID.gridy = 0;
		panel_1.add(ID, gbc_ID);
		ID.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		addbuild.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {190};
		gbl_panel.rowHeights = new int[] {40};
		gbl_panel.columnWeights = new double[]{0.0};
		gbl_panel.rowWeights = new double[]{0.0};
		panel.setLayout(gbl_panel);
		
		add = new JButton("Add");
		add.setForeground(new Color(255, 250, 250));
		add.setBackground(new Color(47, 79, 79));
		GridBagConstraints gbc_add = new GridBagConstraints();
		gbc_add.fill = GridBagConstraints.HORIZONTAL;
		gbc_add.gridx = 0;
		gbc_add.gridy = 0;
		panel.add(add, gbc_add);
		add.setFont(new Font("Times New Roman", Font.BOLD, 15));
		addbuild.setBounds(100, 100, 200, 150);
		addbuild.setLocationRelativeTo(null);
	}

}
