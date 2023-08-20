package oops;
/*
 * Runtime Polymorpsim: Dynamic or late binding 
 * Runtime polymorphism can achieve using method overriding 
 * faster in speed
 */
class Sqaure
{
	void draw()
	{
		System.out.println("Square has four sides");
	}
}
class traingle extends Sqaure
{
	@Override
	void draw()
	{
		super.draw();
		System.out.println("Triangle has three sides");
	}
}
class Hexagon extends traingle{
	@Override
	void draw()
	
	{
		super.draw();
		System.out.println("hexagon has six sides");
	}
	
}

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hexagon h1 = new Hexagon();
		h1.draw();

	}

}
