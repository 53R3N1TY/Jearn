public class VariableExample {
	//instance variable
	public String myVar="hi babe";

	public void myMethod(){
		//local Variable
		String myVar="Hi dude";
		System.out.println(myVar);
	}

	public static void main(String args[]){
		//creating object
		VariableExample obj = new VariableExample();
		//calling method
		obj.myMethod();
		System.out.println(obj.myVar);
	}
}
