package employercre;

import java.math.BigDecimal;

public class Employee extends Person {
	private String phoneNumber;
	private String email;
	private BigDecimal salary ;
	
	public Employee(String fistName, String nameJob, String nameOffice) {
		super(fistName, nameJob, nameOffice);
		//this.phoneNumber = phoneNumber;
		//this.email = email;
		//this.salary = salary;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public String toString() {
		return getFistName()+ " "+ getNameJob()+ " "+ getNameOffice()+ 
				"\n "+ email+ 
				"\n "+ phoneNumber+  
				"\n "+  salary+ " ";
	}
	}

