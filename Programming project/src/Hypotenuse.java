import java.util.Scanner;
public class Hypotenuse {
	public static void main(String[] args) {
		Scanner y = new Scanner(System.in);
		System.out.println("what's the Hypotenuse of your triangle?");
		int n = y.nextInt();
		double n2;
		int nl = n;
		n2 = (n + 1) * ((0.5) * n);
		int n3 = 1;
		for (int s = 0; s < n2; s++) {

			System.out.print(" ");
			if (s == nl) {
				System.out.println("*");
				nl = nl - n3;
				n3 = n3 + 1;
			}

		}
	}

}
