package mycar;

public class Fancar {
	private String make;
	private String model;
	private String color;
	private byte speed;
	private double radius;
	private boolean ison;
	
	public Fancar(String make, String model, String color, double radius) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.radius = radius;
	}
	public void setSpeed1(byte speed) {
		
	}
	public void SwitchOn() {
		this.setIson(true);
		return;
	}
	public void switchOff() {
		this.setIson(false);
			setSpeed1((byte) 0);
			return;
	}
	
	public String toString() {
		return make + " " + model+ " "+ " "+ color+ " "+ " "+ radius;
	}
	public byte getSpeed() {
		return speed;
	}
	public void setSpeed(byte speed) {
		this.speed = speed;
	}
	public boolean isIson() {
		return ison;
	}
	public void setIson(boolean ison) {
		this.ison = ison;
		return;
	}
	
	

}
