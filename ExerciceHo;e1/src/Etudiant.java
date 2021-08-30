
public class Etudiant {
	private String prenom;
	private String nom;
	private String centre;
	
	public Etudiant(String prenom, String nom, String centre) {
		this.prenom = prenom;
		this.nom = nom;
		this.centre = centre;
	}
	public String getPrenom() {
		return prenom;
		
	}
	public String getNom() {
		return nom;
	}
	public String Centre() {
		return centre;
	}
	public String totring() {
		return prenom+ " "+ nom+ " "+ centre+ " "; 
	}
}
