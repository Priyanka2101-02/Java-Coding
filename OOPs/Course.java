package oops;

import java.util.Scanner;

public class Course extends  Student {

	private int crid;
	 String crname;
	
	public int getCrid() {
		return crid;
	}

	public void setCrid(int crid) {
		this.crid = crid;
	}

	public String getCrname() {
		return crname;
	}

	public void setCrname(String crname) {
		this.crname = crname;
	}
	@Override
	
	
	public String toString()
	{
		
		return "CourseID: "+getCrid()+" CourseName: "+getCrname()+" Student Id: "+getId()+" Student Name: "+getName()+" Student Dept: "+getDept();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		Course[] a= new Course[1];
		for(int i=0;i<a.length;i++)
		{
			a[i] =new Course();
			System.out.println("Enter Corse id:");
			a[i].setCrid(sc.nextInt());
			System.out.println("Enter Corse name:");
			a[i].setCrname(sc.next());
			System.out.println("Enter Student name:");
			a[i].setName(sc.next());
			System.out.println("Enter Student id:");
			a[i].setId(sc.nextInt());
			System.out.println("Enter Student Dept:");
			a[i].setDept(sc.next());
			System.out.println(a[i]+" ");
			
		}
	}
}
