package dimension;

public class RectangleRunner {
	private int length;
	private int width;
	
	public RectangleRunner(int length, int width) {
		this.length = length;
		this.width = width;
		
	}
	public String toString() {
		return "Lemgth ="+ length+ "\n Witdth = "+ width;
	}
	public void setLength(int length) {
		//length = length;
		this.length = length;
		
		
	}
	public void setWidth(int width) {
		this.width = width;
	}
}
