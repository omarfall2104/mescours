import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = List.of(new Student(100, "Abdou"), new Student(22, "Ali"),
				new Student(25, "Salif"));
		List<Student> newstudent = new ArrayList<>(students);
		//Collections.sort(newstudent);
		Collections.sort(newstudent, new StudentAsc());
		System.out.println(newstudent);
		Collections.sort(newstudent, new StudentDesc());
		System.out.println(newstudent);
		

	}

}
