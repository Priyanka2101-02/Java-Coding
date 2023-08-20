package oops;
/*
 * -> Abstraction is process of hiding unwanted things and show only essential things
 * -> abstraction can be acieved using two tyes
 * 	1. Abstract Class
  * 2. Interface
  *->  Abstract class contains two method abstract method and normal method 
  *-> we cannot create the object of abstract class to create object we need to extends absttract class and create
  * 	object of that class 
  * -> Abstract method doen't contain body 
 */
abstract class Animal// abstract class 
{
	abstract void run();// abstract method
	
	void sleep()// normal mmethod
	{
		System.out.println("Animal Sleeps");
	}
}
class Leoperd extends Animal{
	@Override
	 void run()// Abstract method body implementation
	{
		System.out.println("Leopord run very fast!!");
		
	}
	void eat()
	{
		System.out.println("It is carnivorous animal");
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Leoperd l1 =new Leoperd();
	l1.eat();
	l1.sleep();
	l1.run();

	}

}
