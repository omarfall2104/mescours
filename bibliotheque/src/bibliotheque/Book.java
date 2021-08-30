package bibliotheque;

import java.util.ArrayList;

public class Book {
	private int nbPage;
	private String kind;
	private String author;
	//private Review review;
	private ArrayList<Review> reviewList = new ArrayList<>();
	
	public Book(int nbPage, String kind, String author) {
		this.nbPage = nbPage;
		this.author = author;
		this.kind = kind;
		//this.reviewList = reviewlist;
	}
	public void addReview(Review review) {
	reviewList.add(review);
	}
	public String toString() {
		return nbPage+ " "+ kind+ " "+ author+" "+ reviewList+ " " + "\n"; 
	}
		// TODO Auto-generated method stub
		

}
