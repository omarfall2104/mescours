
public class Formation {
	private String name;
	
	public Formation(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
			return String.format("Formation [name=%s]", name);
		}
	

}
