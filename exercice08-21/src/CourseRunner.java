import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CourseRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Course> name = new ArrayList<Course>();
		LinkedList<Course> name = new LinkedList<>();
		name.add(new Course("ForLoop"));
		name.add(new Course("Thread"));
		name.add(new Course("Collection"));
		name.add(new Course("Stream"));
		name.add(new Course("Fonctionna Programming"));
		
		Iterator<Course> itname = name.iterator();
		while(itname.hasNext()) System.out.print(itname.next()+ " ");

	}

}
