package interfacegame;

public class GameRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gameboyinterface mario = new Mario();
		Gameboyinterface streetFighter = new StreetFighter();
		Gameboyinterface footgame = new FootGame();
		//Gameboyinterface [] footObjects = {new FootGame(), new StreetFighter()};
		//for(Gameboyinterface omqr : footObjects);
	
		
		mario.up();
		mario.down();
		mario.left();
		streetFighter.up();
		footgame.up();
		footgame.down();
		footgame.left();

	}

}
