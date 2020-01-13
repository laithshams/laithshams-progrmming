
public class Employee {
	String fname, sname, tname, lname;
	String date, position;
	private int salary;
	private int yinc;
	private String ID;

	public void entersalary(int s) {
			if (s > 100) {
				salary = s;
			} else {
				salary = 0;
			}
		}

	public int readsalary() {
		return salary;
	}

	public void enteryinc(int s) {
			if (s > 0) {
				yinc = s;
			} else {
				yinc = 000;
			}
		}

	public int readyinc() {
		return yinc;
	}

	public void enterID(String s) {
		char[] t = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (i == s.length() - 1 && s.length() == 9 && (t[i] == '0' || t[i] == '1' || t[i] == '2' || t[i] == '3'
					|| t[i] == '4' || t[i] == '5' || t[i] == '6' || t[i] == '7' || t[i] == '8' || t[i] == '9')) {
				ID = s;
			} else {
				ID = "000000000";
			}
		}
	}

	public String readID() {
		return ID;
	}
}
