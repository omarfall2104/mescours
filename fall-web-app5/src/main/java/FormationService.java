import java.util.ArrayList;
import java.util.List;

public class FormationService  {
	private static List<Formation> formations = new ArrayList<Formation>();
	static {
		formations.add(new Formation("HTML"));
		formations.add(new Formation("HTML7"));
		formations.add(new Formation("HTML6"));
		formations.add(new Formation("HTML5"));
		formations.add(new Formation("HTML4"));
		formations.add(new Formation("HTML3"));
		formations.add(new Formation("HTML1"));
		
	}
	public List<Formation> getAllFormation() {
		return formations;
	}

}
