package creanimal;

public class Student extends Master {
	private String classe;
	
	public Student(String fistName, String name, int age, String classe) {
		super(fistName, name, age);
		this.classe = classe;
	}
	public String toString() {
	return "Name :" +super.getFistName() +
			"\n Name :" + super.getName() +
			"\n "+ super.getAge() + " "+ classe+ " ";
	//return super.toString() +" "+ classe;

	}
	

}
