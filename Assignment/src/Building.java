
public class Building {

	String region, village, neighborhood, land, tank;
	private String ID;

	public void enterID(String s) {
		char[] t = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (t[i] == '0' || t[i] == '1' || t[i] == '2' || t[i] == '3' || t[i] == '4' || t[i] == '5' || t[i] == '6'
					|| t[i] == '7' || t[i] == '8' || t[i] == '9') {
				if (i == s.length() - 1 && s.length() == 10) {

					ID = s;
				}
			}
			if (t[i] != '0' && t[i] != '1' && t[i] != '2' && t[i] != '3' && t[i] != '4' && t[i] != '5' && t[i] != '6'
					&& t[i] != '7' && t[i] != '8' && t[i] != '9' || s.length() != 10) {
				ID = "";
				i = s.length();
			}
		}
	}

	public String readID() {
		return ID;
	}
}
