package lamdaexercice;

import java.util.stream.IntStream;

public class Sumnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream.range(0,151).reduce((n1 n2) e -> 0, n1+n2).forEach(e -> System.out.println(e));
//reduce(0,(n1,n2) -> n1+n2
	}

}
