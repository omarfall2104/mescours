package exercie.exercice;

public class NumberEven {
	private int n;
	
	
	public NumberEven() {
		this.n =n;
	}
	public int getNumberEven() {
		return n;
	}
	public void setNumberEven(int n) {
		this.n = n;
		for(int i=0; i<=n; i++) {
			if(i%2!=0) {
			System.out.println(i+ " a pour carre"+ " "+i*i);
			
		}
	}
	}
		public String toString() {
			return " "+ n;
	}
}
