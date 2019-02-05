package levelPieces;

import java.util.Random;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Kangaroo extends GamePiece implements Moveable {

	public Kangaroo(int location) {
		super('k', location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int dist = rand.nextInt(10)+5;

		gameBoard[dist]=gameBoard[super.getLocation()];
		gameBoard[super.getLocation()]=null;
		super.setLocation(dist);


	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		if(this.getLocation()==playerLocation) {
			return InteractionResult.GET_POINT;
		}
		return InteractionResult.NONE;
	}

}
