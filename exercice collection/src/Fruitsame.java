import java.awt.List;
import java.util.ArrayList;

public class Fruitsame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] list = {"Apple", "Orange", "Banana"};
		//String[] list2 = {"Apple", "Orange", "Banana"};
		ArrayList<String> list = new ArrayList();
		//ArrayList list11 = new ArrayList(list2);
		list.add("Apple");
		list.add("Orange");
		list.add("Banana");
		//System.out.println(list);
		ArrayList<String> list1 = new ArrayList();
		//ArrayList list11 = new ArrayList(list2);
		list1.add("Apple");
		list1.add("Orangesteam");
		list1.add("Banana");
		if(list.contains(list)==list1.contains(list1)) {
			System.out.println(list.containsAll(list));
			
		//}
		//else { System.out.println("We have not a same list"+ list1 + "=> "+ list);
		
		}

	}

}
