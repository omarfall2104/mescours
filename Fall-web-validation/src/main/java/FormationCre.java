import java.util.ArrayList;
import java.util.List;

public class FormationCre {
	
	private static List<Formation> formations = new ArrayList<Formation>();
	static {
	formations.add(new Formation("Informatique"));
	formations.add(new Formation("Programmation"));
	formations.add(new Formation("Developpement"));
	formations.add(new Formation("Data base"));
	formations.add(new Formation("Gestion"));
	formations.add(new Formation("Markting"));
	formations.add(new Formation("Bureautique"));
	
}
public List<Formation> getAllFormation() {
	return formations;
}
}



