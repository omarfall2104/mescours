package nbcararterphrase;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name = new ArrayList<>();
		name.add("fall");
		name.add("SY");
		name.add("Soumare");
		name.add("Diop");
		name.add("Ndiaye");
		name.add("Cisse");
		System.out.println("Voici la liste des membres :" +name);
		System.out.println("***************************");
		name.set(2, "Seck");
		System.out.println("Soumare vient d'etre remplcer par Seck :" +name);
		System.out.println("***************************");
		name.remove(2);
		System.out.println(name);
		System.out.println("***************************");
		for(int i=0; i<name.size(); i++) {
			System.out.println(name.get(i));
		}
		System.out.println("***************************");
		Iterator<String> myname =  name.iterator();
		//myname.next();
		/*System.out.println(myname.next());
		System.out.println(myname.next());
		System.out.println(myname.next());*/
		/*while(mname.hasNext()) {
			System.out.println(name);*/
		}
		

	}

