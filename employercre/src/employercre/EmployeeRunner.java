package employercre;

import java.math.BigDecimal;

public class EmployeeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("Soumare", "Programmer Analyst", "Saraya");
		        employee.setEmail("saraya@gmail.com");
		       employee.setPhoneNumber("123-456-7890");
		        employee.setSalary(new BigDecimal("50000"));
		        System.out.println(employee);

	}

}
