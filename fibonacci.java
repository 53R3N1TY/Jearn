import java.util.Scanner;
public class fibonacci {
	public static void main(String args[]) {
		int count, num1 = 0, num2 = 1;
		Scanner sc =  new Scanner(System.in);
		System.out.println("how many numbers you want in the series");
		count = sc.nextInt();
		sc.close();
		System.out.println("The fibonacci series upto "+count+" numbers are ::");
		int i=1;
		while(i<=count) {
			System.out.println(num1+" ");
			int sumOfPrevTwo = num1 + num2;
			num1 = num2;
			num2 = sumOfPrevTwo;
			i++;
		}
	}
}
