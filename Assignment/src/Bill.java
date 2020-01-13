
public class Bill {

	private String ref;
	private int amount;
	
	public void enterref(String s) {
		char[] t = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (i == s.length() - 1 && s.length() == 7 && (t[i] == '0' || t[i] == '1' || t[i] == '2' || t[i] == '3'
					|| t[i] == '4' || t[i] == '5' || t[i] == '6' || t[i] == '7' || t[i] == '8' || t[i] == '9')) {
				ref = s;
			} else {
				ref = "0000000";
			}
		}
	}

	public String readref() {
		return ref;
	}

	public void enteramount(int s) {
			if (s >= 0) {
				amount = s;
			}
		}

	public int readamount() {
		return amount;
	}
}
