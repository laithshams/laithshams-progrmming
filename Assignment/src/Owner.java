import java.util.ArrayList;

public class Owner {

	String fname, sname, tname, lname;
	String add;
	private String ID;
	ArrayList<Building> building = new ArrayList<Building>();
	public void enterID(String s) {
		char[] t = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (i == s.length() - 1 && s.length() == 10 && (t[i] == '0' || t[i] == '1' || t[i] == '2' || t[i] == '3' || t[i] == '4' || t[i] == '5' || t[i] == '6' || t[i] == '7' || t[i] == '8' || t[i] == '9')) {
				ID = s;
			}
		}
	}
	public String readID() {
		return ID;
	}
	
}
