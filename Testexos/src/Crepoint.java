
public class Crepoint {

	public static void main(String[] args) {
		
		int[]elevemarks= {10, 100, 100, 100} ;
		// TODO Auto-generated method stub
		//@SuppressWarnings("unused")
		Elevecre eleve = new Elevecre (2104, "Serigne Omar", "Fall", 39, "formateur", elevemarks);
		System.out.println(eleve);
		int somm = eleve.sommes();
		//int number=.getstudentsMarks();
		System.out.println("La somme des note est:" + eleve.sommes());
		

	}

}
