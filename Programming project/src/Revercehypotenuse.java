import java.util.Scanner;
public class Revercehypotenuse {
	public static void main(String[] args) {
		Scanner y = new Scanner(System.in);
		System.out.println("what's the Hypotenuse of your triangle?");
		int n = y.nextInt();
		double n2;
		n2 = 2*(n + 1) * ((0.5) * n);
		double nl = n2-n+1;
		int n3 = n-1;
		for (double s = n2; s > 0; s--) {

			System.out.print(" ");
			if (s == nl) {
				System.out.println("*");
				nl = nl - n3;
				n3 = n3 - 1;
			}

		}
}
}
