package studentData;

import java.util.Scanner;

class stud{
	int roll_no;
	String name;
	String std;
	String grade;
	double percentage;
	int res;
	
	void getdata() {
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("How many student data you want to add!!");
		// res = sc.nextInt();
		System.out.println("Enter the Student deatails in format of Roll number, Name, Std,Grade and Percentage");
			roll_no = sc.nextInt();
			name =sc.next();
			std= sc.next();
			grade = sc.next();
			percentage = sc.nextDouble();
		
	}
		 void display()
		{
			System.out.println(roll_no+"\t"+name+"\t"+std+"\t"+grade+"\t"+percentage);
			//int percentage = 0;
			  if(percentage>=75)
			  {
				System.out.println(name+" passed with distinction!!!!");
			}
			else if(percentage>=60)
			{
				System.out.println(name+" passed with First Class");
			}
			else if(percentage>=35) {
				System.out.println(name+" Passed!!!!");
			}
			else {
				System.out.println(name+" Failed");
			}
		}
			
	}


public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stud s1[] =new stud[10];
		for(int i =0; i<s1.length;i++)
		{
			s1[i]=new stud();	
		}
		System.out.println("How many student data you want to add!!");
		
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		for(int i= 0; i<n;i++)
		{
			s1[i].getdata();
		}
		
		System.out.println("*************STUDENT DEATILS***************");
		System.out.println("ROLLNO"+"\t"+"NAME"+"\t"+"STD"+"\t"+"GRADE"+"\t"+"PERCENTAGE");
		System.out.println("****************************************************************");
		for(int i= 0; i<n;i++)
		{
			s1[i].display();
		}
		
	
		
	}

}
 