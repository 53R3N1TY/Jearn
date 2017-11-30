class Teacher {

	String designation = "Teacher";
	String collegeName = "BeginnersBook";


	void does() {

		System.out.println("Teaching");
	}

}


public class ExInheritance extends Teacher {

	String mainSubject = "Physics";
	public static void main(String args[]) {

		ExInheritance obj = new ExInheritance();
		System.out.println(obj.collegeName);
		System.out.println(obj.designation);
		System.out.println(obj.mainSubject);
		obj.does();
	}
}
