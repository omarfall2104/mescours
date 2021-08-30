
public class Book {
	private int nbpage;
	private String title;
	private String type;
	private Review review;
	
	public Book(int nbpage, String title, String type, Review review) {
		this.nbpage =nbpage;
		this.title = title;
		this.type = type;
		this.review = review;
	}
	
		
		public int getNbpage() {
		return nbpage;
	}


	public void setNbpage(int nbpage) {
		this.nbpage = nbpage;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Review getReview() {
		return review;
	}


	public void setReview(Review review) {
		this.review = review;
	}


		public String toString() {
		return (nbpage+ " "+ title+ " "+ type+ " "+ review);
	}

}
