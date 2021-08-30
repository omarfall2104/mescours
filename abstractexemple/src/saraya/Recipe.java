package saraya;

public abstract class Recipe {
	public void execute(){
		shopping();
		prepare();
		cleanUp();
	}
	abstract void shopping();
	abstract void prepare();
	abstract void cleanUp();

}
