package nbcararterphrase;

import java.awt.List;
//import java.awt.List;
import java.util.Arrays;
import java.util.LinkedList;

public class Arraytri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [] num = {1,2,6};
		LinkedList<Integer> nums = new LinkedList(Arrays.asList(num));
		if(nums.getFirst()==6 || nums.getLast()==6) {
			System.out.println("firstLast6: " +nums+ " True");

		}
		else {
			System.out.println("firstLast6: " +nums+ " False");
		}
	Integer [] number = {6,1,2,3};
	LinkedList<Integer> num1 = new LinkedList(Arrays.asList(number));
	if(num1.getFirst()==6 ) {
		System.out.println("firstLast6: " +num1+ " True");
	}
	else if (nums.getLast()==6){
		System.out.println("firstLast6: " +num1+ " True");
	}
	else {
		System.out.println("firstLast6: " +num1+ " False");
	}
	Integer [] numb = {13,6,1,2,3};
	LinkedList<Integer> num2 = new LinkedList(Arrays.asList(numb));
	if(num2.getFirst()==6 ) {
		System.out.println("firstLast6: " +num2+ " True");
	}
	else if (num2.getLast()==6){
		System.out.println("firstLast6: " +num2+ " True");
	}
	else {
		System.out.println("firstLast6: " +num2+ " False");
	}
}
}

