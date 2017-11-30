public class ExConstructor {

	int age;
	String name;

	//Default Constructor
	ExConstructor() {
		this.name = "khushi";
		this.age = 34;
	}


	//Parameterized constructor
	ExConstructor(String n, int a) {
		this.name = n;
		this.age = a;
	}


	public static void main(String args[]) {
		ExConstructor obj1 = new ExConstructor();
		ExConstructor obj2 = new ExConstructor("harami", 45);


		System.out.println(obj1.name+" "+obj1.age);
		System.out.println(obj2.name+" "+obj2.age);
	}
}
