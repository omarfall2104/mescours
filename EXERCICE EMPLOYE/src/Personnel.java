
public class Personnel {
	private String prenom;
	private String nom;
	private String entreprise;
	
	public Personnel(String prenom, String nom, String entreprise) {
		this.prenom = prenom;
		this.nom = nom;
		this.entreprise = entreprise;
	}
	//}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}
	
	public String toString() {
		return prenom+ " "+ nom+ " "+ entreprise+ " "; 
	}

}
