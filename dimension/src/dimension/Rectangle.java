package dimension;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleRunner rectangle = new RectangleRunner(12,23);
		System.out.println(rectangle);
		
		rectangle.setWidth(25);
		System.out.println(rectangle);
		
		rectangle.setLength(20);
		System.out.println(rectangle);
	}

}
