
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
		return ("Formation [name%]" + name);
	}
}
