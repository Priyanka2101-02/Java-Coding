package oops;
/*
 * To String method is used to representing object as string 
 * 
 */
class Emp{
	int id; 
	String name;
	double sal;
	Emp(int id, String name, double sal)
	{
		this.id = id;
		this.name =name;
		this.sal=sal;
		
	}
	public String toString(){
		return id+" "+name+" "+sal;
	}
}

public class ToSring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp(101,"Harry",65000);
		Emp e2 = new Emp(102,"Ron",42000);
		//System.out.println(e1);// it is not shoeing proper output like this oops.Emp@15db9742
		System.out.println(e1);

	}

}
