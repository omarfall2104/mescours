
public class Rect {
	private int width;
	private int length;
	
	 public Rect(int width, int length){
		this.width = width;
		this.length = length;		
		}
	public int getWidth(int width) {
	return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
		public int getLength(int length) {
			return length;
			}
			public void setLength(int length) {
				this.length = length;
			}
	
	public String toString() {
		return ("Rectangle = "+ width+ " "+ length);
		
	}
	
	

}
