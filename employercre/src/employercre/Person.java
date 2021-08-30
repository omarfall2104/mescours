package employercre;

public class Person {
	private String fistName;
	private String nameJob;
	private String nameOffice;
	
	public Person(String fistName, String nameJob, String nameOffice) {
		this.setFistName(fistName);
		this.setNameJob(nameJob);
		this.setNameOffice(nameOffice);
	}
	public String toString() {
		return getFistName()+ " "+ getNameJob()+ " "+ getNameOffice()+ " ";
		
	}
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getNameJob() {
		return nameJob;
	}
	public void setNameJob(String nameJob) {
		this.nameJob = nameJob;
	}
	public String getNameOffice() {
		return nameOffice;
	}
	public void setNameOffice(String nameOffice) {
		this.nameOffice = nameOffice;
	}

}
