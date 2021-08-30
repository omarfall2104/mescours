package falltestrectangle;

public class Dimension {
	private int length;
	private int width;
	
	public Dimension(int length, int width)
	{
		this.setLength(length);
		this.setWidth(width);
	}
	
	public String toString() {
		return length()+ " "+ getWidth()+ " ";
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}


	
	}

