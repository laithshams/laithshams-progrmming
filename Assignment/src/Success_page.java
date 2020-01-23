import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;

public class Success_page {

	public JFrame message;
	public JLabel success;
	public JButton ok;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Success_page window = new Success_page();
					window.message.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Success_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		message = new JFrame();
		message.setTitle("Message");
		message.setType(Type.UTILITY);
		message.setResizable(false);
		message.setBounds(100, 100, 400, 150);
		message.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		message.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		message.getContentPane().add(panel);
		
		success = new JLabel("");
		success.setFont(new Font("Times New Roman", Font.BOLD, 25));
		panel.add(success);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 238, 238));
		message.getContentPane().add(panel_1);
		
		ok = new JButton("Ok");
		ok.setForeground(new Color(255, 250, 250));
		ok.setFont(new Font("Times New Roman", Font.BOLD, 12));
		ok.setBackground(new Color(47, 79, 79));
		panel_1.add(ok);
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				message.setVisible(false);
			}
		});
	}

}
