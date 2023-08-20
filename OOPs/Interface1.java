package oops;
/*
 * ->To define interface method body we need to implement the Interface class
 * -> Implements keyword is used to implement Interface 
 * 
 */

public class Interface1 implements Interface {
	public void show()
	{
		System.out.println("This is show method from Interface Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface1 i1= new Interface1();
		i1.show();
		

	}

}
