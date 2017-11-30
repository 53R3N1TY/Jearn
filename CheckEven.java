import java.util.Scanner;

public class CheckEven {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter");
		int num = scan.nextInt();

		if (num%2 == 0) {
			System.out.println("Even");
		}
		else System.out.println("Odd");
	}
}
