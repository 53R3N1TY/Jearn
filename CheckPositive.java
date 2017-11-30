import java.util.Scanner;
public class CheckPositive {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		int num = sc.nextInt();

		if (num < 0)
			System.out.println("negative");
		else if (num == 0)
			System.out.println("Zero");
		else
			System.out.println("Positive Number");
	}
}
