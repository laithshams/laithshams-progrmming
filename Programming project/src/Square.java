import java.util.Scanner;
public class Square {
	public static void main(String[] args) {
		Scanner y = new Scanner(System.in);
		System.out.println("what's the side of your square?");
		int n = y.nextInt();
		int n2 = n*n;
		for (int s = 0; s < n2; s++) {
			System.out.print("*");
			int nl = (s+1) % n;
			if (nl == 0) {
				System.out.println();
			}

		}

	}
}
