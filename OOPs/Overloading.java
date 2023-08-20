package oops;
/*
 * Compile time polymorphism : Static and early binding
 * We can achieve compile time polymorphism using method or function or operator overloading 
 * The private,final and abstract method are overload at the compile time.
 * slower speed. 
 */
class Add
{ int a, b;
	void show(int a, int b)
	{
		System.out.println("Addtion of two number is "+(a+b));

	}
	
}
class Circle extends Add
{
	double r;
	void show(double r)
	{
		System.out.println("Area of Circle is "+(3.17*r*r));
	}
}
class Rect extends Circle 
{
	double len; int bre;
	void show(double len, int bre)
	{
		System.out.println("Area of Rectangle "+(len*bre));
	}
}



public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r1 = new Rect();
		r1.show(2.3, 10);//rectangle class
		r1.show(6.5);//circle class
		r1.show(10,20);// add class
	}

}
