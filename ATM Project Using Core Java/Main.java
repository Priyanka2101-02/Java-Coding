package myPack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//creating constructor for ATMimplent 
		ATMImplent ap= new ATMImplent();
		int atmno=123456789;
		int atmpin=1234;
		int ch;
		Scanner ip=new Scanner(System.in);
		System.out.println("Welcome to ATM Machine!!");
		
		System.out.println("Enter ATM Number");
		int atmnum=ip.nextInt();
		
		System.out.println("Enter ATM Pin");
		int pin=ip.nextInt();
		
		if(atmno==atmnum && atmpin==pin)
		{
			while(true)
			{
				System.out.println("1. View Balance\n 2. Withdraw Amount \n 3. Deposit Amount \n 4. MiniStatement \n 5. Exit");
				System.out.println("Enter Your Choice");
				ch=ip.nextInt();
				switch(ch)
				{
				case 1: ap.viewbal();
				break;
				
				case 2: 
					System.out.println("Enter the amount to withdraw");
					double amt= ip.nextDouble();
					ap.withdrawamt(amt);
					break;
					
				case 3: 
					System.out.println("Enter the amount to deposit");
					double depoamt=ip.nextDouble();
					ap.depositamt(depoamt);
					break;
					
				case 4: 
					ap.viewMiniStatement();
					break;
					
				
				case 5: 
					System.out.println("Reove your ATM Card \n THANK YOU FOR VISITING!!!");
					break;
					
				default:
					System.out.println("Enter valid choice");
	
				
				}
			}
		}
		else
		{
			System.out.println("Enter valid Credentials!!");
		}

	}

}
