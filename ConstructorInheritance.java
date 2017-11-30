class parentClass 
{
	parentClass() 
	{
		System.out.println("Constructor of Parent");
	}
}

class ConstructorInheritance
{
	ConstructorInheritance() 
	{

		System.out.println("Constructor of child");
	}

	public static void main(String args[]) 
	{
		new ConstructorInheritance();
	}
}
