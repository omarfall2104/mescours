import java.util.List;
import java.util.stream.Collectors;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> grade = List.of(12, 21, 15, 14, 1, 16, 14, 17, 3);
		//grade.stream().filter(e -> 2 * (e%2==0)).forEach(e -> System.out.println(e));
		System.out.println("The even numbers list multiply by 2:");
		for(int i =0; i<grade.size(); i++) {
			if(grade.get(i)%2==0) {
				System.out.print(grade.get(i)*2+ " ");
			}
		}
		System.out.println("\n"+ "The odd numbers list multiply by 2:");
		for(int i = 0; i<grade.size(); i++) {
			if(grade.get(i)%2!=0) {
				//System.out.print(grade.get(i)*2+ " ");
		 grade.stream().max((y,x) -> y.compareTo(x)).get();
		System.out.println(maxvalue);
	}
}
	}
}

