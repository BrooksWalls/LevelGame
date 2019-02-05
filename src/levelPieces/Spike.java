package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Spike extends GamePiece {

	public Spike( int location) {
		super('^', location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		if(playerLocation==getLocation()) return InteractionResult.KILL;
		return InteractionResult.NONE;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
	}

	@Override
	public int getLocation() {
		// TODO Auto-generated method stub
		return super.getLocation();
	}

	@Override
	public void setLocation(int newLocation) {
		// TODO Auto-generated method stub
		super.setLocation(newLocation);
	}

}
