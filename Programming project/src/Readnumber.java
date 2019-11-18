import java.util.Scanner;
public class Readnumber {
public static int readNumber() {
	Scanner y = new Scanner(System.in);
	System.out.println("enter number?");
	int n = y.nextInt();
	return n;
}
public static void main(String[] args) {
	int n1=readNumber();
	int n2=readNumber();
	int result = n1+ n2;
	System.out.println(n1 + "+" + n2 + "=" + result);
}
}
