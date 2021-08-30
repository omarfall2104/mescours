
import java.util.ArrayList;
import java.util.List;

public class Fruitrunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Pear");
		fruits.add("Banana");
		fruits.forEach((n) ->  { System.out.println(n);  } );
		List<Integer> number = List.of(21,14,15,16,2,7,19,20);
	}
	public static void fpList(List<Integer> fp) {
		fp.stream().filter(e -> e%2==0).forEach(e -> System.out.println(e));
	}

}
