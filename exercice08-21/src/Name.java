import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name = new ArrayList<String>();
		name.add("Fall");
		name.add("Diop");
		name.add("Camara");
		name.add("Faye");
		ListIterator <String> itname =  name.listIterator();
		//while (itname.hasPrevious()) System.out.print(itname.previous() + " ") ;
		//while(itname.hasNext()) System.out.print(itname.next()+ " ");
		for(int i = name.size(); i < 0; i--) System.out.println(i);
		}
	//}

}
