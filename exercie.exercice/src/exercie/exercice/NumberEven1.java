package exercie.exercice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumberEven1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Integer> number = ArrayList<Integer>();
		List<Integer> number = List.of(10,15,17,25,10,17,15,8,4);
		//number.add(12);
		//number.add(12);
		Integer sum = number.stream().reduce(0,(agg, next) -> agg +next);
		
		//System.out.println(number);
		//number.stream().sorted().filter(e -> e%2==0);
		//Integer[] nums = stream.toArray(Integer[] :: new);
		//.collect(Collectors.toList());
		number.stream().filter(e -> e%2==0).map(e -> e*e).sorted().forEach(e -> System.out.println(e));
		//number.stream().reduce((agg , next) e -> agg+next).forEach(e -> System.out.println(e));

	}

}
