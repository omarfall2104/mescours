
public class TestChien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public class TestChien {
			//public static void main ( String [] args ){
			Chien [] meute = new Chien [3];
			meute [0] = new Chien ();
			meute [1] = new Chien ();
			meute [2] = new Chien ();
			meute [0]. nom = " Beethoven ";
			meute [1]. nom = " M?dor ";
			meute [2]. nom = " Mirza ";
			int i = 0;
			while ( i < meute . length ) {
			meute [i]. aboyer ();
			i = i + 1;
			}

	}

}
