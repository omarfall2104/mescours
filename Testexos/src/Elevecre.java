
import java.util.Arrays;

public class Elevecre {
private int id;
private String firstname;
private String name;
private int age;
private String grade;
private int[] marks;

public Elevecre (int id,String firstname,String name,int age,String grade,int[] marks) {
	this.id = id;
	this.firstname = firstname;
	this.name = name;
	this.age = age;
	this.grade = grade;
	this.marks = marks;
	
}
	int []elevemarks= {10, 100, 100, 100};

@Override
	public String toString() {
	return id +" "+ firstname +" "+ name +" "+ age +" "+ grade +" "+ Arrays.toString(marks);
}
	public void geteleveMarks() {
	}
	//return marks.length;
	public int  sommes( ) {
		int somme = 0;
		for (int i:elevemarks) {
		somme += i;
	}
	return somme;
	}
		
}
	

