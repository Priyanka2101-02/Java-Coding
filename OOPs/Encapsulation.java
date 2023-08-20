package oops;
/*
 * Encapulation is wrapping up the data together within single unit 
 * Data and method is hidden from user
 * Encapulation provide control over the data 
 * it provide security, scalability and realibility
 * it has private data members and setter(write the data) getter(read the data) method 
 * 
 *
 */

public class Encapsulation {
	public String getEmpname() {
		return empname;
	}



	public void setEmpname(String empname) {
		this.empname = empname;
	}



	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	private String empname;
	private int empId;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation obj = new Encapsulation();
		obj.setEmpname("Priyanka");
		obj.setEmpId(101);
		System.out.println("Employee Nmae is "+obj.getEmpId());
		System.out.println("Employee Id is "+obj.getEmpname());
		
	}

}
