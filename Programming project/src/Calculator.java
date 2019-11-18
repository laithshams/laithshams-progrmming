import java.util.Scanner;

public class Calculator {
	public static char readOperation() {
		Scanner y = new Scanner(System.in);
		System.out.println("choose operator");
		char operator = y.next().charAt(0);
		return operator;
	}
	public static char status() {
		Scanner y = new Scanner(System.in);
		System.out.println("if you want to continue press 's', if you don't press 'q'");
		char operator = y.next().charAt(0);
		return operator;
	}

	public static int readNumber() {
		Scanner y = new Scanner(System.in);
		System.out.println("enter number?");
		int n = y.nextInt();
		return n;
	}

	public static int addition(int n, int n1) {
		int sum = n + n1;
		return sum;
	}

	public static int subtract(int n, int n1) {
		int sum = n - n1;
		return sum;
	}

	public static int multible(int n, int n1) {
		int sum = n * n1;
		return sum;
	}

	public static int divide(int n, int n1) {
		int sum = n / n1;
		return sum;
	}

	public static void main(String[] args) {
		while (true) {
			char status = status();
			switch (status) {
			case 'q':
				return ;
			}
			System.out.println("operators: addition '+', subtract '-', multible '*', divide '/'");
			int n = readNumber();
			char q = readOperation();
			int n1 = readNumber();
			switch (q) {
			case '+':
				int sum = addition(n, n1);
				System.out.println(n + "+" + n1 + "=" + sum);
				break;
			case '-':
				int sub = subtract(n, n1);
				System.out.println(n + "-" + n1 + "=" + sub);
				break;
			case '*':
				int multi = multible(n, n1);
				System.out.println(n + "*" + n1 + "=" + multi);
				break;
			case '/':
				int div = divide(n, n1);
				System.out.println(n + "/" + n1 + "=" + div);
				break;
			}
		}
	}
}
