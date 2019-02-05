package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Bomb extends GamePiece {

	public Bomb(int location) {
		super('B', location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		if(Math.abs(playerLocation-super.getLocation())<=1) return InteractionResult.HIT;
		return InteractionResult.NONE;
	}
	

}
