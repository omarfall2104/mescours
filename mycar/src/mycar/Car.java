package mycar;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fancar fan = new Fancar("Saraya", "ked", "pink", 2.5);
		fan.switchOff();
		fan.setSpeed1((byte)3);
		fan.switchOff();
		fan.setIson(false);
		System.out.println(fan);
		
		
		
		
		

	}

}
