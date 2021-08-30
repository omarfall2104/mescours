package creanimal;

public class Master {
	private String fistName;
	private String name;
	private int age;
	
	public Master(String fistName, String name, int age) {
		this.fistName = fistName;
		this.name = name;
		this.age = age;
	}
	
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	
	public String getFistName() {
		return fistName;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public String toString() {
		return fistName+ " "+ name+ " "+ age+ " ";
	}
	
}
