package mysadrress;

public class Homaddres {

	private String cartier;
	private String street;
	private String city;
	private int doorNumber;
	
	public Homaddres(String cartier, String street, String city, int doorNumber) {
		this.street = street;
		this.city = city;
		this.doorNumber = doorNumber;
		this.cartier = cartier;
	}
	public String toString() {
		return street+ " "+ city+ " "+ doorNumber+ " "+ cartier+ " ";
	}

}
