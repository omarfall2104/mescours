package classcre;

public class Student {
	private String name;
	private String email;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString() {
		return name+ " "+ email+ " ";
		
	}
}
