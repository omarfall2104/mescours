package nbcararterphrase;

import java.util.ArrayList;
import java.util.Iterator;

public class Testarayy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name = new ArrayList<String>();
		name.add("fall");
		name.add("diop");
		name.add("sarr");
		System.out.println(name);
		name.set(1, "camara");
		System.out.println(name);
		name.add("seck");
		name.add("ngom");
		System.out.println(name);
		name.remove(0);
		System.out.println(name);
		System.out.println("*****************");
		for(int i = 0; i<name.size(); i++) {
			System.out.println(name.get(i));}
		Iterator<String> itname = name.iterator();
		System.out.println(itname.next());
		System.out.println(itname.next());
		System.out.println(itname.next());
		while(itname.hasNext()) {
			String hasitname = itname.next();
			if(hasitname.equals("sarr")) {
				itname.remove();
			}
			System.out.println(name);
		}

		}


		

	}

