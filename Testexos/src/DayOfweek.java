import java.util.Arrays;

public class DayOfweek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] dayOfweek = 
			{ "Sunday", "Monday", "Tuesday", "Wednesday", "Thuesday", "Friday", "Saturday"};
		System.out.println(Arrays.toString(dayOfweek));
		
	
		String longestDay =" ";
		for (String dayOfweek1 : dayOfweek) {
		System.out.println(dayOfweek1);
		}
		System.out.println("the Days of week are");
		for (int i= 0; i < dayOfweek.length; i++ ) {
			System.out.println(dayOfweek[i]);
		}
		System.out.println();
		for (int i= 0; i < dayOfweek.length; i++ ) {
		if (dayOfweek[i].length() > longestDay.length());
		System.out.println(longestDay = dayOfweek[i]);
		}
		}

}


