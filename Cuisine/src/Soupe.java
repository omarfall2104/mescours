
public class Soupe extends Ingredient implements PlatCree {

	public Soupe(String nomAliment, String etat, int quatite, String unite) {
		super(nomAliment, etat, quatite, unite);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void nom() {
		System.out.println("Nom du plat :" +"Soupes");
		// TODO Auto-generated method stub

	}
	public String ToString() {
		return  "Ingredients sont :"+
				"\n"+ getNomAliment()+ " "+ getEtat()+ " "+ getUnite()+ " "+ getQuatite()+ " ";
	}

}
