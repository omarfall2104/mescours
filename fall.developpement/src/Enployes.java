
public class Enployes {
	private String nom;
	private String prenom; 
	private Phone phone;
	//private Adresse adresse;
	
	public Enployes(String nom, String prenom, Phone phone) {
		this.nom = nom;
		this.prenom =prenom;
		this.phone = phone;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
		
	}
	public void getPrenom(String prenom) {
		return;
	}
	public void setnom(String nom) {
		this.prenom = nom;
	}
	public void getnom(String nom) {
		return;
	}
	public String toString() {
		return prenom+ " "+ nom+ " ";
	}
	
}
