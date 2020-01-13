import java.util.ArrayList;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<String>();
		s.add("1");
		s.add("5");
		s.add("6");
		System.out.println(s.get(1));
		Employee emp = new Employee();
		Scanner y = new Scanner(System.in);
		System.out.println("enter number?");
		String i = y.next();
		emp.enterID(i);
		System.out.println(emp.readID());
		Home_page home = new Home_page();
		home.homepage.setVisible(true);
	}
}
