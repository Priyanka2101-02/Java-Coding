package myPack;

import java.util.*;

public class ATMImplent implements ATMoper{

	ATMProj atm =new ATMProj();
	Map<Double, String>ministate=new HashMap<Double,String>();
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewbal() {
		// TODO Auto-generated method stub
		System.out.println("Available Balanace is "+atm.getBal());
		
	}

	@Override
	public void withdrawamt(double withdrawAmt) {
		// TODO Auto-generated method stub
		if(withdrawAmt%500==0 || withdrawAmt%100==0)
		{
			if(withdrawAmt<=atm.getBal())
			{
				ministate.put(withdrawAmt, "Amount Withdrawn!!");
				System.out.println("collect the cash :" +withdrawAmt);
				atm.setBal(atm.getBal()-withdrawAmt);
				viewbal();
			}
			else
			{
				System.out.println("Insufficient Balance!!");

			}
		}
		else
		{
			System.out.println("Please enter the amount multiple of 500 or 100");

		}
	}

	@Override
	public void depositamt(double depositAmt) {
		// TODO Auto-generated method stub
		ministate.put(depositAmt, "Amount Deposited");
		System.out.println(depositAmt+ "Deposited Successfully!!");
		atm.setBal(atm.getBal()+depositAmt);
		viewbal();
		
	}

	@Override
	public void viewMiniStatement() {
		// TODO Auto-generated method stub
		
		for(Map.Entry<Double, String>m:ministate.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());

		}
	}

}
