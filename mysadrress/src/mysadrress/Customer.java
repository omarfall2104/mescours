package mysadrress;

public class Customer {
	private String fistName;
	private Homaddres addressh;
	private Workaddress addressw;
	
	public Customer(String fistName, Homaddres addressh, Workaddress addressw) {
		this.fistName = fistName;
		this.addressh = addressh;
		this.addressw = addressw;
	}
	public String toString() {
		return fistName+ " "+ addressh+ " "+ addressw+ " ";
	}

}
