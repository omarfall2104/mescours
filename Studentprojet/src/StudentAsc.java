import java.util.Comparator;

public class StudentAsc implements Comparator<Student>{
	



@Override
public int compare(Student s1, Student s2) {
	// TODO Auto-generated method stub
	return Integer.compare(s1.getId(), s2.getId());
}
}
