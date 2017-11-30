import java.util.Scanner;

class Encapsulation {

	private int empId;
	private String empName;
	private int empAge;

	//Getter methods
	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpAge() {
		return empAge;
	}


	//Setter methods
	public void setEmpId(int newValue) {
		empId = newValue;
	}

	public void setEmpName(String newValue) {
		empName = newValue;
	}

	public void setEmpAge(int newValue) {
		empAge = newValue;
	}
}


class EncapsulationDemo {

	public static void main(String args[]) {

		Encapsulation obj = new Encapsulation();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID");
		obj.setEmpId(sc.nextInt());

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Name");
		obj.setEmpName(sc1.nextLine());

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter Age");
		obj.setEmpAge(sc.nextInt());



		System.out.println("Employee ID is "+obj.getEmpId()+" Name is "+obj.getEmpName()+" and age is "+obj.getEmpAge());
	
	}
}
