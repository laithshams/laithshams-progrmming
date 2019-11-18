import java.util.Scanner;
public class Rightriangle {
	public static void main(String[] args) {
		Scanner y = new Scanner(System.in);
		System.out.println("what's the height of your triangle?");
		int n = y.nextInt();
		double n2;
		int nl=0;
		n2=(n+1)*((0.5)*n);
		int n3=2;
		for (int s = 0; s < n2; s++) {
			System.out.print("*");
			if (s == nl  && s!=n2-1) {
				System.out.println();
				nl=nl+n3;
				n3=n3+1;
			}

		}
	}

}
