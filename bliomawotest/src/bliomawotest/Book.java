package bliomawotest;

public class Book {
	private String auteur;
	private String genre;
	private int nbpage;
	private Review review;
	
	public Book(String auteur, String genre, int nbpage) {
		this.auteur = auteur;
		this.genre = genre;
		this.nbpage = nbpage;
		//this.review = review;
	}
	public String toString() {
	return "Auteur :"+ auteur+ 
			"%n Genre :"+ genre+ 
			"%n Nompbre de page :"+ nbpage+" ";
}
}
