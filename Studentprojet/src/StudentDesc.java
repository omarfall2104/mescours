import java.util.Comparator;

public class StudentDesc implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return Integer.compare(s2.getId(), s1.getId());
	}

}
