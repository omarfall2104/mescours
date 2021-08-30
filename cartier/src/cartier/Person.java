package cartier;

public class Person {
	private String fistName;
	private String name;
	private int age;
	private Adress adress;
	
	public Person (String fistName, String name, int age, Adress adress) {
		this.fistName=fistName;
		this.name =name;
		this.age = age;
		this.adress = adress;
	}

	//public String getFistName() {
		//return fistName;
	//}

	//public void setFistName(String fistName) {
		//this.fistName = fistName;
	//}

	//public String getName() {
		//return name;
	//}

	//public void setName(String name) {
		//this.name = name;
	//}

	//public int getAge() {
		//return age;
	//}

	//public void setAge(int age) {
		//this.age = age;
	//}

	//public Adress getAdress() {
		//return adress;
	//}

	//public void setAdress(Adress adress) {
		//this.adress = adress;
	//}
	public String toString() {
		return fistName + " " + name+ " "+ " "+ age+ " "+ " "+ adress;
	}
}



