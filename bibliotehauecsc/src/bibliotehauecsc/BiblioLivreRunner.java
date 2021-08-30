package bibliotehauecsc;

public class BiblioLivreRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InterfqceBiblioLivre livre = new Roman();
		//livre.genre();
		//livre.titre();
		//livre.auteur();
		InterfqceBiblioLivre[] livre = {new Roman(), new Fiction()};
		for(InterfqceBiblioLivre[] monlivre : livre) {
		livre.genre();
		System.out.println(monlivre);
		
		}
		//System.out.println(livre);

	}

}
