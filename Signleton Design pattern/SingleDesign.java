package singletone;
/*
 * Singletone design is used to reduce memory 
 * Need not to create the object on each request
 * how to create 
 * 1. static memmor
 * 2. private constructor
 * 3. static factory method
 * 
 * 
 * 
 */

class singleobj
{
	static singleobj inst=new singleobj();// static data member
	private singleobj()// private constrctor
	{
	}
	public static singleobj getinst()// create the method using static i.e static factory method
	{
		return inst;
	}
	
	public void show()
	{
		System.out.println("Singletone class!!!");
		
	}
}

public class SingleDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//singleobj so=new singleobj(); it will throw an error because constrcutor is private
		singleobj obj=singleobj.getinst();
		obj.show();

	}

}
