package factory;

import java.util.Scanner;

abstract class plan
{
	double rate;
	abstract void getrate();
	public void calcBill(int unit)
	{
		System.out.println(unit*rate);
	}
}
class commercial extends plan
{
	void getrate() {
		rate=11;
	}
}
class domestic extends plan
{
	void getrate()
	{
		rate=9.56;
	}
}
class education extends plan
{
	void getrate()
	{
		rate=8.23;
	}
}
class getfactoryplan
{
	public plan getplan(String plantype)
	{
		if(plantype.equalsIgnoreCase("domestic"))
		{
			return new domestic();
		}
		else if(plantype.equalsIgnoreCase("commercial"))
		{
			return new commercial();
		}
		else if(plantype.equalsIgnoreCase("education"))
		{
			return new education();
		}
		return null;
	}
	
}
public class Billgenerate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getfactoryplan f1= new getfactoryplan();
		System.out.println("Enter the plan name");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println("Enter the no of units");
		int unit = sc.nextInt();
		plan p1=f1.getplan(str);
		System.out.println("Generated bill is");
		p1.getrate();
		p1.calcBill(unit);
	}

}
