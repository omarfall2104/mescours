
public class Student extends Person {
	private String collegeName;
	private int year;
	
	
	public Student(String name, String address, String collegeName, int year ) {
		super(name, address);
		this.collegeName = collegeName;
		this.year = year;
	}
	public String toString() {
		//return " Name :"+  getName()+  " "+ "Address :"+ getAddress()+ 
			//	"\n CollegeName :"+ " "+ collegeName +
				//"\n "+ "Year"+ " "+ year+ " ";
		return super.toString()+ 
				"\n College Name : "+ collegeName + 
				"\n Year : "+ year;
	}

}
