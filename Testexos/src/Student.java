import java.util.Arrays;

public class Student {
        private int id;
		private String firstName;
	    private String lastName;
	    private int age;
	    private String grade;
	    private int[] marks;

public Student (int id,String firstName,String lastName,int age,String grade,int[] marks) {
			
			this.id=id;
			this.firstName=firstName;
	        this.lastName=lastName;
	        this.age=age;
	        this.grade=grade;
	        this.marks=marks;

}
int[]studentmarks= {98,95,100,97};

@Override
public String toString() {
	
	return id +" "+ firstName +" "+ lastName +" "+ age +" "+ grade +" "+ Arrays.toString(marks);
}
public int getstudentsMarks() {
	return marks.length;
	}
}

