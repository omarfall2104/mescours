package khombole;

public class Profil {
	private String prenom;
	private String nom;
	private int age;
	private Adresse adress;
	
	public Profil(String prenom, String nom, int age, Adresse adress) {
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.adress = adress;
		
	}
	
	public String toString() {
	return (prenom+ " "+ nom+" "+ age+ " "+ adress);
	}

}

