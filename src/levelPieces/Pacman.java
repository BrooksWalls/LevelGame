package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Pacman extends GamePiece implements Moveable {

	public Pacman() {
		super('C', 0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		Pacman tempP =  (Pacman) gameBoard[super.getLocation()];
		int tempLocation= super.getLocation();
		
		super.setLocation(super.getLocation()+1);
		while(gameBoard[super.getLocation()] == null&&super.getLocation()<20) {
			if(super.getLocation()<20) {
			super.setLocation(super.getLocation()+1);
			}
		}
		if(super.getLocation()>=20) {
			super.setLocation(0);
		}
		gameBoard[tempLocation]=gameBoard[super.getLocation()];
		gameBoard[super.getLocation()]= tempP;
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		if(playerLocation == super.getLocation()) {
			//practically impossible but if a player is able to they will advance to the next level
			return InteractionResult.ADVANCE;
		}
		return InteractionResult.NONE;
	}

}
