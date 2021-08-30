package constracttest;

public abstract class Recette {
	public void execute() {
		preparation();
		achat();
		nettoiement();
	}
	abstract void achat();
	abstract void preparation();
	abstract void nettoiement();
		
		
}

