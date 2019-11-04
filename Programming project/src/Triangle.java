import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner y = new Scanner(System.in);
		System.out.println("what's the height of your triangle?");
		int n = y.nextInt();
		int n2;
		n2 = ((3 * (n*n) - n) / 2);
		int ns=n-1;
		int nl=n;
		int q=2;
		for (int s = n2; s > 0; s--) {
			if (ns != 0) {
				System.out.print(" ");
				ns=ns-1;
				nl=nl-1;
			} else {
				System.out.print("*");
				nl=nl-1;
			}
			if (nl == 0) {
				System.out.println();
				ns=ns+n-q;
				q=q-1;
				nl=nl+n+q;
				q=q+2;
				
			}
		}

	}
}
