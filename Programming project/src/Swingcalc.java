import java.awt.*;
import javax.swing.*;

public class Swingcalc {
	public static JButton btn(String str) {
		JButton btn = new JButton(str);
		return btn;
	}

	public static JPanel pnl() {
		JPanel pnl = new JPanel();
		return pnl;
	}

	public static void main(String[] args) {
		JFrame frm = new JFrame("Calculator");
		frm.setLayout(new GridLayout(5, 1));
		frm.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		frm.setSize(400, 400);
		JTextField txt = new JTextField();
		frm.add(txt);
		JPanel pnl1 = pnl();
		pnl1.add(btn("7"));
		pnl1.add(btn("8"));
		pnl1.add(btn("9"));
		pnl1.add(btn("/"));
		frm.add(pnl1);
		JPanel pnl2 = pnl();
		pnl2.add(btn("4"));
		pnl2.add(btn("5"));
		pnl2.add(btn("6"));
		pnl2.add(btn("*"));
		frm.add(pnl2);
		JPanel pnl3 = pnl();
		pnl3.add(btn("1"));
		pnl3.add(btn("2"));
		pnl3.add(btn("3"));
		pnl3.add(btn("+"));
		frm.add(pnl3);
		JPanel pnl4 = pnl();
		pnl4.add(btn("0"));
		pnl4.add(btn("-"));
		pnl4.add(btn("="));
		frm.add(pnl4);
		frm.setLocationRelativeTo(null);
		frm.setVisible(true);
	}
}
