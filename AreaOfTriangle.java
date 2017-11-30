import java.util.Scanner;

class AreaOfTriangle {

	public static void main(String agrs[]) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Width");
		double W = scan.nextDouble();

		System.out.println("Height");
		double H = scan.nextDouble();

		double Area = W*H/2;
		System.out.println("Area is "+Area);
	}
}
