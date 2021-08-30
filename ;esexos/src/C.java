
public abstract class C implements I {
	int i;
	
	public C(int i) {
	this.i = i;
	}
	@Override
	public int getI() {
		System.out.println(i);
		// TODO Auto-generated method stub
		return 0;
	}
	public void getI(int i) {
		return;
	}
	public String toString() {
		return i+ " ";
	}

}
