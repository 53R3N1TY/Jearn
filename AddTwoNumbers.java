import java.util.Scanner;
public class AddTwoNumbers {

	public static void main(String args[]) {
		int num1, num2, sum;
		Scanner scan = new Scanner(System.in);

		System.out.println("first");
		num1 = scan.nextInt();
		System.out.println("Second");
		num2 = scan.nextInt();

		scan.close();


		sum = num1 + num2;

		System.out.println("Sum is = "+sum);
	}
}
