import java.util.Iterator;
import java.util.LinkedList;

public class ElementCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> course = new LinkedList<>();
		course.add("ForLoop");
		course.add("Thread");
		course.add("Collection");
		course.add("Stream");
		course.add("Fonctionna Programming");
		
		Iterator<String> itCourse = course.iterator();
		while(itCourse.hasNext()) System.out.println(itCourse.next());
		//System.out.println(itCourse.hasNext());
	}

}
