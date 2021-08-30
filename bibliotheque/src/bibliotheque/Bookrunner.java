package bibliotheque;

public class Bookrunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Review book.addReview(new Review(10, "Great Book", 4);
		//Review bookaddreview = new Review(10, "Great Book", 4);
		//Review bookaddReview = new Review(101, "Awesome", 5);
		
		Book book = new Book(123, "Object Oriented Programming With Java", "Ranga");
		book.addReview(new Review(10, "Great Book", 4));
		book.addReview(new Review(100, "Great Book", 10));
		book.addReview(new Review(150, "Great Book", 14));
		book.addReview(new Review(160, "Great Book", 21));
		
		System.out.println(book);


	}

}
