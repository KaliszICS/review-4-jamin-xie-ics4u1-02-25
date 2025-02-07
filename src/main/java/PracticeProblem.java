import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		Scanner input = new Scanner(System.in);

		String word;
		System.out.print("Input an integer: ");
		word = 5 + input.nextLine();
		System.out.println(Integer.parseInt(word) + 5);
	}

	public static void q2() {
		Scanner input = new Scanner(System.in);

		String word;
		System.out.print("Input a number: ");
		word = 4 + input.nextLine() + 3;
		System.out.println(Double.parseDouble(word) + 3.4);
	}

	public static void q3() {
		Scanner input = new Scanner(System.in);

		String word;
		System.out.print("Input a boolean: ");
		word = input.nextLine();
		System.out.println(!Boolean.parseBoolean(word));
	}

	public static void q4() {
		Scanner input = new Scanner(System.in);

		String word;
		System.out.print("Input an integer: ");
		word = input.nextLine() + 3;
		System.out.println((char)(Integer.parseInt(word) + 2));
	}

	public static void q5() {
		Scanner input = new Scanner(System.in);

		String word;
		System.out.print("Input an integer: ");
		word = input.nextLine() + 1;
		System.out.println((double)(Integer.parseInt(word) / 2));
	}

	public static void q6() {
		Scanner input = new Scanner(System.in);

		String word;
		System.out.print("Input a number: ");
		word = 1 + input.nextLine();
		System.out.println((int)(Double.parseDouble(word)));
	}

}
