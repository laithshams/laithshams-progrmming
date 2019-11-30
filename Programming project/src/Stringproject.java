import java.util.Scanner;

public class Stringproject {
	private static Scanner read;
	private static Scanner read2;

	private static char readChar() {
		read2 = new Scanner(System.in);
		System.out.print("enter the letter: ");
		char readchar = read2.next().charAt(0);
		return readchar;
	}

	public static String readString() {
		read = new Scanner(System.in);
		String readstr = read.nextLine();
		return readstr;
	}

	public static String caseS(String str) {
		String sym = " symmetric";
		char strc[] = str.toCharArray();
		int strl = str.length() - 1;
		for (int i = 0; i < strl; i++) {
			if (strc[i] != strc[strl]) {
				sym = "n't symmetric";
				break;
			}
			strl--;
		}
		return sym;
	}

	public static String[] splitStr(String str) {
		String strs[] = str.split(",");
		return strs;
	}

	public static int[] convertStr(String[] strs) {
		int[] intstr = new int[strs.length];
		for (int i = 0; i < strs.length; i++) {
			intstr[i] = Integer.parseInt(strs[i]);
		}
		return intstr;
	}

	public static int caseMax(int[] intstr) {
		int max = intstr[intstr.length - 1];
		for (int i = 0; i < intstr.length - 1; i++) {
			if (intstr[i] > intstr[i + 1] && max < intstr[i]) {
				max = intstr[i];
			}
		}
		return max;
	}

	public static int caseMin(int[] intstr) {
		int min = intstr[intstr.length - 1];
		for (int i = 0; i < intstr.length - 1; i++) {
			if (intstr[i] < intstr[i + 1] && min > intstr[i]) {
				min = intstr[i];
			}
		}
		return min;
	}

	public static int[] findArea(int[] intstr) {
		int[] area = new int[intstr.length - 1];
		for (int i = 0; i < intstr.length - 1; i++) {
			if (intstr[i] <= intstr[i + 1]) {
				area[i] = intstr[i] * 2;
			} else {
				area[i] = intstr[i + 1] * 2;
			}
		}
		return area;
	}

	public static String thanksMessage() {
		String thanks = "thank you for using our program\nif you want to try again choose one of the functions, else choose exit.";
		return thanks;
	}

	public static void main(String[] args) {
		String str;
		String[] strs;
		int max, min, maxarea, minarea;
		System.out.println(
				"welcome to our program\nthis program has 3 functions choose one of them to continue or choose exit to exit:");
		while (true) {
			System.out.println("s-symmetric\nm-minimum and maximum\nc-chart\ne-exit");
			char func = readChar();
			String thanks = thanksMessage();
			switch (func) {
			case 's':
				System.out.print("you chose s-symmetric let's start:\nenter the word: ");
				str = readString();
				String sym = caseS(str); // sym = symmetric or no n't symmetric.
				System.out.println(str + " is" + sym + "\n\n" + thanks);

				break;
			case 'm':
				System.out.println("enter the numbers with ',' between them:");
				str = readString();
				strs = splitStr(str);
				int[] intstrm = new int[strs.length];
				try {
					intstrm = convertStr(strs);
					max = caseMax(intstrm);
					System.out.println("Maximum = " + max);
					min = caseMin(intstrm);
					System.out.println("Minimum = " + min);
					if (max == min) {
						System.out.println("The numbers are constant");
					}
					System.out.println("\n" + thanks);
				} catch (Exception e) {
					System.out
							.println("Something went wrong...it could be your entry\n    please check and try again.");
				}
				break;
			case 'c':
				System.out.println("enter the chart numbers with ',' between them:");
				str = readString();
				strs = splitStr(str);
				int[] intstrc = new int[strs.length];
				try {
					intstrc = convertStr(strs);
					int[] area = findArea(intstrc);
					max = caseMax(intstrc);
					System.out.println("Maximum = " + max);
					min = caseMin(intstrc);
					System.out.println("Minimum = " + min);
					if (max == min) {
						System.out.println("chart has constant data");
					}
					if (area.length != 0) {
						System.out.print("areas in the chart = [");
						for (int i = 0; i < area.length; i++) {
							if (i != area.length - 1) {
								System.out.print(area[i] + ", ");
							} else {
								System.out.println(area[i] + "]");
							}
						}
						maxarea = caseMax(area);
						System.out.println("Maximum area = " + maxarea);
						minarea = caseMin(area);
						System.out.println("Minimum area = " + minarea);
						if (maxarea == minarea) {
							System.out.println("chart has constant area");
						}
						System.out.println("\n" + thanks);
					} else {
						System.out.println(
								"We can't calculate the area...\nyou need to enter more than one number\nplease try again\n");
					}
				} catch (Exception e) {
					System.out
							.println("Something went wrong...it could be your entry\n    please check and try again.");
				}
				break;
			case 'e':
				System.out.println("good bye (:");
				return;
			default:
				System.out.println("Wrong entry please try again");
				break;
			}
		}
	}
}
