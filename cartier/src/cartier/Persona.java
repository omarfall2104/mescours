package cartier;

public class Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adress omarAdress = new Adress(30, "Route des niaye", "Pâtte d'oie", 03, 12500 );
		Person omar = new Person("Serigne", "fall", 39, omarAdress);
		System.out.println(omar);
		//System.out.println(omarAdress);

	}

}
