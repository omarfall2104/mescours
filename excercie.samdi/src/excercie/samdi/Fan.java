package excercie.samdi;

public class Fan {
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;
	
	public Fan(String make, double radius, String color) 
	{
		this.make = make;
		this.radius = radius;
		this.color = color;
		//this.isOn = isOn;
		//sthis.speed = speed;
		
	}
	public String toString() {
		return "Make: "+ make+ 
				"\n Radius: "+ radius+ 
				"\n Color: "+ color+ 
				"\n IsOnn: "+ isOn+ 
				"\n Speed: "+ speed+"";
	}
	public void inOn(boolean isOn) {
		this.isOn = isOn;
	}
		public void switchOn(){
			isOn = true;
			setSpeed((byte)1);			
		}
		public void switchOff() {
	        isOn = false;
	        setSpeed((byte)0);
		}
		public void setSpeed(byte speed) {
	        this.speed = speed;
		}


}
