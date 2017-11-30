public class Website {

	//field(instance variable)
	String webName;
	int webAge;

	//constructor
	Website(String name, int age) {
		this.webName = name;
		this.webAge = age;
	}

	public static void main(String args[]) {
		//creating objects
		Website obj1 = new Website("beginners book", 5);
		Website obj2 = new Website("google", 18);


		//Accessing object data through reference
		System.out.println(obj1.webName+" "+obj1.webAge);
		System.out.println(obj2.webName+" "+obj2.webAge);
	}
}
