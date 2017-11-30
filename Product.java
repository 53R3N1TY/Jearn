import java.util.Scanner;

public class Product {

	public static void main(String args[]) {
		/*This reads the input provided by the user
		 * using keyboard
		 */
		Scanner scan = new Scanner(System.in);

		//first ask for "First Number" on console then read the provided input by 'scan' object
		System.out.println("First number");
		int num1 = scan.nextInt();

		//first ask for "Second number" on console then read the provided input by 'scan' object of Scanner class
		System.out.println("Second number");
		int num2 = scan.nextInt();

		//closing the Scanner after the use
		scan.close();


		//product
		int product = num1*num2;


		System.out.println("Output : "+product);
	}
}
