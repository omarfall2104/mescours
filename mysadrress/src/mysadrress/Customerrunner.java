package mysadrress;

public class Customerrunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Homaddres homeaddress = new Homaddres("Flat No. 51", "Hiranandani Gardens", "Mumbai", 400076);
		Workaddress workaddress = new Workaddress("Administrative Office", "Western Block", "Mumbai", 4);
		Customer customer = new Customer("Ashwin Tendulkar", homeaddress, workaddress);
		System.out.println(customer);

	}

}
