package nbcararterphrase;

import java.util.Arrays;
import java.util.LinkedList;

public class Samefirstlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] num = {1,2,6};
		LinkedList<Integer> num1 = new LinkedList(Arrays.asList(num));
		//for(Integer n : num1) {
		if(num1.getFirst()== 6 || num1.getLast() == 6 ) {
			System.out.println("sameFirstLast: " +num1+ " True");
		}
		else {
			System.out.println("sameFirstLast: " +num1+ " False");
		}
		
		Integer[] nums = {1,2,3,6};
		LinkedList<Integer> num11 = new LinkedList(Arrays.asList(nums));
		//for(Integer n : num11) {
		if(num11.getFirst()== 6 || num11.getLast() == 6 ) {
			System.out.println("sameFirstLast: " +num11+ " True");
		}
		else {
			System.out.println("sameFirstLast: " +num11+ " False");
		}
		Integer[] nums1 = {1,2,1};
		LinkedList<Integer> nums11 = new LinkedList(Arrays.asList(nums1));
		//for(Integer n : nums11) {
		if(nums11.getFirst()==6 || nums11.getLast() == 6 ) {
			System.out.println("sameFirstLast: " +nums11+ " True");
		}
		else {
			System.out.println("sameFirstLast: " +nums11+ " False");
		}
			
	}
		

	}

