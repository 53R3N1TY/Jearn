class X
{
	public void method()
	{
		System.out.println("Class X method");
	}
}

class Y extends class X 
{
	public void methodY()
	{
		System.out.println("class Y method");
	}
}

class Z extends Y 
{
	public void methodZ()
	{
		System.out.println("class Z method");
	}
}

class MultilevelInheritance
{
	public static void main(String args[])
       	{
		Z obj = new Z();
		obj.method();
		obj.methodY();
		obj.methodZ();
	}
}
