//import java.math.BigDecimal;
public class PersonnelRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formation employee = new Formation("Soumare", "Programmer Analyst", "Saraya");
        employee.setEmail("saraya@gmail.com");
       employee.setTelephone("123-456-7890");
        //employee.setSalaire(new BitDecimal("50000"));
       employee.setSalaire(new BitDecimal("5000"));
        System.out.println(employee);

}

}

