import java.util.ArrayList;
import java.util.List;

public class FormationService {
	
	private  static List<Formation> formations = new ArrayList<Formation>();
		static {
		formations.add(new Formation("HTML"));
		formations.add(new Formation("Maintenance"));
		formations.add(new Formation("Reseau"));
		formations.add(new Formation("Bureautique"));
		formations.add(new Formation("Infographie"));
		formations.add(new Formation("Base de donnee"));
		formations.add(new Formation("Progammation"));
	
	}
		
		public List getAllFormation() {
		return formations;
		}
}
