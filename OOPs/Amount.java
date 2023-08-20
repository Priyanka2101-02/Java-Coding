package oops;

import java.util.Scanner;

public class Amount extends Hardware {
	public double num;
	

	public double getNum() {
		return num;
	}


	public void setNum(double num) {
		this.num = num;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		System.out.println("************HARDWARE*************");
		System.out.println("1.Laptop");
		System.out.println("2.Speaker");
		System.out.println("3.TV");
		System.out.println("4.Mobile");
		
		
		System.out.println("Enter your Choice!!");
		Scanner sc = new Scanner(System.in);
		ch = sc.nextInt();
		
		Amount a1 = new Amount();
		switch(ch)
		{
		case 1:
			a1.setName("Dell");
			System.out.println(a1.getName());
			a1.setDesc("It is most portable device");
			System.out.println(a1.getDesc());
			a1.setPrice(45000);
			System.out.println(a1.getPrice());
			System.out.println("How many peices you want");
			a1.setQty(sc.nextInt());
			a1.setNum(a1.getPrice()*a1.getQty());
			System.out.println("The amount you have to pay is "+a1.getNum());
			break;
			
		case 2:
			a1.setName("Skull");
			System.out.println(a1.getName());
			a1.setDesc("This speker has dolby audio");
			System.out.println(a1.getDesc());
			a1.setPrice(10000);
			System.out.println(a1.getPrice());
			System.out.println("How many peices you want");
			a1.setQty(sc.nextInt());
			a1.setNum(a1.getPrice()*a1.getQty());
			System.out.println("The amount you have to pay is "+a1.getNum());
			break;
			
		case 3:
			a1.setName("Samsung");
			System.out.println(a1.getName());
			a1.setDesc("Andriod TV");
			System.out.println(a1.getDesc());
			a1.setPrice(65000);
			System.out.println(a1.getPrice());
			System.out.println("How many peices you want");
			a1.setQty(sc.nextInt());
			a1.setNum(a1.getPrice()*a1.getQty());
			System.out.println("The amount you have to pay is "+a1.getNum());
			break;
			
		case 4:
			a1.setName("IPhoone 14");
			System.out.println(a1.getName());
			a1.setDesc("Security is enhaced ");
			System.out.println(a1.getDesc());
			a1.setPrice(100000);
			System.out.println(a1.getPrice());
			System.out.println("How many peices you want");
			a1.setQty(sc.nextInt());
			a1.setNum(a1.getPrice()*a1.getQty());
			System.out.println("The amount you have to pay is "+a1.getNum());
			break;
			
		default:
			System.out.println("Enter valid Choice!!!!!");
			break;
			
		}
		
		
	}
		

	}


