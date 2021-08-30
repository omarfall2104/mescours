package interfacegame;

public class Mario implements  Gameboyinterface{

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Jump up");
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Bent down");
		
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Move backward");
	}

}
