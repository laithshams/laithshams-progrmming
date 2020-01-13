import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JButton;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class Owner_page {

	public JFrame owner;
	public JLabel fname;
	public JLabel sname;
	public JLabel tname;
	public JLabel lname;
	public JLabel ID;
	public JLabel address;
	public JButton back;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Owner_page window = new Owner_page();
					window.owner.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Owner_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		owner = new JFrame();
		owner.setTitle("Owner");
		owner.getContentPane().setBackground(new Color(175, 238, 238));
		owner.setBounds(100, 100, 450, 300);
		owner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		owner.getContentPane().setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		owner.getContentPane().add(panel);
		
		JLabel lblOwner = new JLabel("Owner");
		lblOwner.setFont(new Font("Times New Roman", Font.BOLD, 40));
		panel.add(lblOwner);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(47, 79, 79));
		owner.getContentPane().add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{86, 87, 87, 87, 87, 0};
		gbl_panel_2.rowHeights = new int[]{30, 30, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel label = new JLabel("Name:");
		label.setForeground(new Color(255, 250, 250));
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		panel_2.add(label, gbc_label);
		
		fname = DefaultComponentFactory.getInstance().createLabel("fname");
		fname.setForeground(new Color(255, 250, 250));
		fname.setFont(new Font("Times New Roman", Font.BOLD, 15));
		GridBagConstraints gbc_fname = new GridBagConstraints();
		gbc_fname.insets = new Insets(0, 0, 5, 5);
		gbc_fname.gridx = 1;
		gbc_fname.gridy = 0;
		panel_2.add(fname, gbc_fname);
		
		sname = DefaultComponentFactory.getInstance().createLabel("sname");
		sname.setFont(new Font("Times New Roman", Font.BOLD, 15));
		sname.setForeground(new Color(255, 250, 250));
		GridBagConstraints gbc_sname = new GridBagConstraints();
		gbc_sname.insets = new Insets(0, 0, 5, 5);
		gbc_sname.gridx = 2;
		gbc_sname.gridy = 0;
		panel_2.add(sname, gbc_sname);
		
		tname = DefaultComponentFactory.getInstance().createLabel("tname");
		tname.setForeground(new Color(255, 250, 250));
		tname.setFont(new Font("Times New Roman", Font.BOLD, 15));
		GridBagConstraints gbc_tname = new GridBagConstraints();
		gbc_tname.insets = new Insets(0, 0, 5, 5);
		gbc_tname.gridx = 3;
		gbc_tname.gridy = 0;
		panel_2.add(tname, gbc_tname);
		
		lname = DefaultComponentFactory.getInstance().createLabel("lname");
		lname.setForeground(new Color(255, 250, 250));
		lname.setFont(new Font("Times New Roman", Font.BOLD, 15));
		GridBagConstraints gbc_lname = new GridBagConstraints();
		gbc_lname.insets = new Insets(0, 0, 5, 0);
		gbc_lname.gridx = 4;
		gbc_lname.gridy = 0;
		panel_2.add(lname, gbc_lname);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setForeground(new Color(255, 250, 250));
		lblId.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.insets = new Insets(0, 0, 0, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 1;
		panel_2.add(lblId, gbc_lblId);
		
		ID = DefaultComponentFactory.getInstance().createLabel("1234567890");
		ID.setForeground(new Color(255, 250, 250));
		ID.setFont(new Font("Times New Roman", Font.BOLD, 15));
		GridBagConstraints gbc_ID = new GridBagConstraints();
		gbc_ID.insets = new Insets(0, 0, 0, 5);
		gbc_ID.gridx = 1;
		gbc_ID.gridy = 1;
		panel_2.add(ID, gbc_ID);
		
		JLabel lblHomeAddress = new JLabel("Home address:");
		lblHomeAddress.setForeground(new Color(255, 250, 250));
		lblHomeAddress.setFont(new Font("Times New Roman", Font.BOLD, 13));
		GridBagConstraints gbc_lblHomeAddress = new GridBagConstraints();
		gbc_lblHomeAddress.anchor = GridBagConstraints.EAST;
		gbc_lblHomeAddress.insets = new Insets(0, 0, 0, 5);
		gbc_lblHomeAddress.gridx = 2;
		gbc_lblHomeAddress.gridy = 1;
		panel_2.add(lblHomeAddress, gbc_lblHomeAddress);
		
		address = DefaultComponentFactory.getInstance().createLabel("ADD");
		address.setForeground(new Color(255, 250, 250));
		address.setFont(new Font("Times New Roman", Font.BOLD, 15));
		GridBagConstraints gbc_address = new GridBagConstraints();
		gbc_address.gridwidth = 2;
		gbc_address.insets = new Insets(0, 0, 0, 5);
		gbc_address.gridx = 3;
		gbc_address.gridy = 1;
		panel_2.add(address, gbc_address);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 238, 238));
		owner.getContentPane().add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] {440};
		gbl_panel_1.rowHeights = new int[] {90};
		gbl_panel_1.columnWeights = new double[]{1.0};
		gbl_panel_1.rowWeights = new double[]{1.0};
		panel_1.setLayout(gbl_panel_1);
		
		back = new JButton("Back");
		back.setForeground(new Color(255, 250, 250));
		back.setBackground(new Color(47, 79, 79));
		back.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_back = new GridBagConstraints();
		gbc_back.fill = GridBagConstraints.HORIZONTAL;
		gbc_back.anchor = GridBagConstraints.SOUTH;
		gbc_back.gridx = 0;
		gbc_back.gridy = 0;
		panel_1.add(back, gbc_back);
	}

}
