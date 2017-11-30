class ParentClass 
{
	ParentClass() 
	{
		System.out.println("Parent Constructor");
	}

	void disp()
       	{
		System.out.println("Parent Method");
	}
}

class ConstructorOverriding extends ParentClass 
{
	ConstructorOverriding() 
	{
		System.out.println("Child Constructor");
	}

	void disp() 
	{
		System.out.println("child Method");
		super.disp();
	}

	public static void main(String args[])
	{
		ConstructorOverriding obj = new ConstructorOverriding();
		obj.disp();
	}
}
