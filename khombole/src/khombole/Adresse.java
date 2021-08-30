package khombole;

public class Adresse {
	private int street;
	private String city;
	private int doorNumber;
	private String stall;
	private int zip;
	
	public Adresse(int street, String city, int doorNumber, String stall, int zip) {
		this.street = street;
		this.city = city;
		this.doorNumber = doorNumber;
		this.stall = stall;
		this.zip = zip;
	}
	public String toString() {
		return street+ " "+ city+ " "+ doorNumber+ " "+ stall+ " "+ zip;
	}

}
