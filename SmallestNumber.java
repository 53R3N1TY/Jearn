import java.util.Scanner;

public class SmallestNumber {
	public static void main(String args[]) {
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("num1");
		num1 = sc.nextInt();
		System.out.println("num2");
		num2 = sc.nextInt();
		System.out.println("num3");
		num3 = sc.nextInt();
		int result = num3 < (num2 < num1 ? num2 : num1) ? num3 : (num2 < num1 ? num2 : num1);
		System.out.println("Smallest Number is : "+result);
	}
}

