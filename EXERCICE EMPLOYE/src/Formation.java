
public class Formation extends Personnel{
	private String email;
	private String telephone;
	private BitDecimal salaire;
	
	public Formation(String prenom, String nom, String entreprise) {
		super(prenom, nom, entreprise);
	}
		
	public void setEmail(String email) {
		this.email = email;
	}
	public void getEmail() {
		return;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public void getTelephone(String telephone) {
		return;
	}
	//public BitDecimal(BiteDecinal bitDecimal) {
		//this.bitDecimal = bitDecimal
	//}
	public void setSalaire(BitDecimal salaire) {
		this.salaire = salaire;
	}
	//public void getSaliare(double salaire) {
	//return salaire;
	//}
		
		public String toString() {
			return getPrenom()+ " "+ getNom()+ " "+ getEntreprise()+ 
					"\n "+ email+ " "+ telephone+ " "+ 
					"\n "+ salaire+ " ";
		}
}
