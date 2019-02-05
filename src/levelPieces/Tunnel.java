package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Tunnel extends GamePiece {

	public Tunnel( int location) {
		super('O', location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		if(super.getLocation()-playerLocation == 1 || super.getLocation()-playerLocation == -1) {
			return InteractionResult.ADVANCE;
		}
		return InteractionResult.NONE;
	}

}
