
public class Ingredient {
	private String nomAliment, etat;
	private int quatite;
	private String unite;
	
	
	public Ingredient(String nomAliment, String etat, int quatite, String unite) {
		this.nomAliment = nomAliment;
		this.etat = etat;
		this.quatite = quatite;
		this.unite = unite;
	}
	public String getNomAliment() {
		return nomAliment;
	}
	public String getEtat() {
		return etat;
	}
	public int getQuatite() {
		return quatite;
	}
	public String getUnite() {
		return unite;
	}
	public String toString() {
		return "Ingredients sont :"+ nomAliment+ " "+ etat+ " "+ quatite+ " "+ unite+ " ";
	}
}
