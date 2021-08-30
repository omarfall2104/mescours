package cartier;

public class Adress {
		private int street;
		private String city;
		private String stall;
		private int doorNumber;
		private int zip;
		
		public Adress (int street, String city, String stall, int doorNumber,int zip) {
			this.street =street;
			this.city =city;
			this.stall =stall;
			this.doorNumber =doorNumber;
			this.zip =zip;
		}

		public int getStreet() {
			return street;
		}

		public void setStreet(int street) {
			this.street = street;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getStall() {
			return stall;
		}

		public void setStall(String stall) {
			this.stall = stall;
		}

		public int getDoorNumber() {
			return doorNumber;
		}

		public void setDoorNumber(int doorNumber) {
			this.doorNumber = doorNumber;
		}

		public int getZip() {
			return zip;
		}

		public void setZip(int zip) {
			this.zip = zip;
		}
		public String toString() {
			return street+ " "+ city+ " "+ stall+ " "+ doorNumber+ " "+ zip;
		}

}
