public class StaticVarTest {
	public static int a;

	public static void main(String args[]){
		System.out.println(a);
		System.out.println(a=2);
		StaticVarTest obj = new StaticVarTest();
		System.out.println(a);
	}
       	




}
