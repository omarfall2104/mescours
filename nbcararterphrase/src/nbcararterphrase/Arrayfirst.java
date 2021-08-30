package nbcararterphrase;

public class Arrayfirst {
	/*ArrayList<Integer> num = new ArrayList<Integer>();
	num.add(1);
	num.add(2);
	num.add(3);
	num.add(6);*/
	int num[] = {1,2,3,6};
		
public static boolean firstlast(int[] num) {
	if(num[0]==6 || num.length -1 ==6) {
		return true;
		//System.out.println(num);
	}
	return false;
}


}
