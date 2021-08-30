package lamdaexercice;

import java.util.List;
import java.util.stream.IntStream;

public class Oddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Integer> num = List.of(1,2,4,7);
		//num.stream().forEach(e -> System.out.println(e));
		IntStream.range(0, 64).filter(e -> e%2!=0).forEach(e -> System.out.println(e));
		
	}

}
