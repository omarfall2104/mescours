package khombole;

public class Cartier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adresse omaradress = new Adresse(30, "route des niayes", 2104, "Patte d'oie", 12500);
		Profil ali = new Profil("Serigne abdoul", "Fall", 39, omaradress);
		System.out.println(ali);

	}

}
