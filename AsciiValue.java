public class AsciiValue {

	public static void main(String args[]){
		char num = 'A';
		int asciiCode = num;
		System.out.println(num);
		//type casting
		int asciiValue = (int)num;

		System.out.println("ASCII value of "+num+" is : "+asciiCode);
		System.out.println("ASCII value of "+num+" is : "+asciiValue);
	}
}
