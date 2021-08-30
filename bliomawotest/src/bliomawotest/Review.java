package bliomawotest;

public class Review extends Book {
	private int pageup;
	private int pageend;
	private String titre;
	
	
	public Review(String auteur, String genre, int nbpage, int pageup, int pageend, String titre) {
		super(auteur, genre, nbpage);
		this.pageup = pageup;
		this.pageend = pageend;
		this.titre = titre;
	}
	public String toString() {
		return pageup+ " "+ pageend+ " "+ titre+ " ";
	}
	

}
