package bibliotheque;

public class Review {
	private int pageOn;
	private String title;
	private int pageOff;
	
	public Review(int pageOn, String title, int pageOff) {
		this.pageOn = pageOn;
		this.pageOff = pageOff;
		this.title = title;
	}
	
	public String toString() {
		return "\n" +pageOn+ " "+ title+ " "+ pageOff+ "";
	}
	
}


