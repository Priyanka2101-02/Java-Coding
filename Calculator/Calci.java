package calculator;

import java.util.Scanner;

public class Calci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, ch, ip;
	do {
		System.out.println("Enter your choice:");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modolus");
		System.out.println("6. Exit");
		System.out.println("***********************");
		Scanner sc = new Scanner(System.in);
		 ch = sc.nextInt();
		if(ch!=6) {
		System.out.println("Enter two values : ");
		num1 = sc.nextInt();
		 num2 = sc.nextInt();
		}
		else {
			break;
		}
	  switch(ch)
	 { 
	  case 1: 
		  	System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
	  			break;
	  case 2: 
		  	System.out.println("Substraction of "+num1+" and "+num2+" is "+(num1-num2));
		  		break;
	  case 3: System.out.println("Multiplication of "+num1+" and "+num2+" is "+(num1*num2));
				break;
	  case 4: if(num1!=0)
	  			{
		          System.out.println("Division of  "+num1+" and "+num2+" is "+(num1/num2));
	  			}
	           else	{
	        	   System.out.println("Cannot divided by 0!!!");
	           }
				break;
	  case 5: System.out.println("Modolus of "+num1+" and "+num2+" is "+(num1%num2));
				break;
	  case 6:  break;
	  default:
		  	System.out.println("Enter valid choice!!");
		  	break;
	 }
	  System.out.println("*******************************");
	  System.out.println("Do you want to continue!!");
	  System.out.println("1. Yes"+"\n"+"2. No");
	  ip = sc.nextInt();
	  /*if(ip==2)
	  {
		  break;
	  }
	 */
	  
	}while(ip!=2);
}
}