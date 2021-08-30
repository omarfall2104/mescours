
public class Personne extends Etudiant {
	private String matiere;
	private int annee;
	
	public Personne(String prenom, String nom, String centre) {
		super(prenom, nom, centre);
		
	}
	public void set.Matiere(String matiere) {
		this.matiere = matiere;
	}
	public void set.Annee(int annee) {
		this.annee = annee;
	}
	

	public String toSting() {
		return 
				matiere+ " "+ annee+ " ";
	}
}
