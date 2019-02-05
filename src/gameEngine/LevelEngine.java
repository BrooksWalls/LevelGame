package gameEngine;
import java.util.ArrayList;

import levelPieces.*;
//authors: Tyler Zudans and Brooks Walls
public class LevelEngine {
	private Drawable[] gameBoard = new Drawable[21];
	public Drawable[] getBoard() {
		return gameBoard;
		
	}
	
	private ArrayList<GamePiece> interactingPieces = new ArrayList<GamePiece>();
	public ArrayList<GamePiece> getInteractingPieces(){
		return interactingPieces;
		
	}
	private ArrayList<Moveable> movingPieces = new ArrayList<Moveable>();
	public ArrayList<Moveable> getMovingPieces(){
		return movingPieces;
		
	}
	//start player in the middle of the location
	private int playerStartLocation = 11;
	public int getPlayerStartLoc() {
		return playerStartLocation;
		
	}
	public void createLevel(int levelNum) {
		// clears game board and pieces lists
		gameBoard = new Drawable[21];
		interactingPieces = new ArrayList<GamePiece>();
		movingPieces = new ArrayList<Moveable>();
		switch(levelNum){
		//loads first level
		case 1:
			Spike spike1 = new Spike(10);
			interactingPieces.add(spike1);
			gameBoard[10] = spike1;
			Spike spike2 = new Spike(12);
			interactingPieces.add(spike2);
			gameBoard[12] = spike2;
			interactingPieces.add(spike1);
			gameBoard[12] = spike1;
			Spike spike3 = new Spike(8);
			interactingPieces.add(spike3);
			gameBoard[8] = spike3;
			Spike spike4 = new Spike(14);
			interactingPieces.add(spike4);
			gameBoard[14] = spike4;
			Spike spike5 = new Spike(6);
			interactingPieces.add(spike5);
			gameBoard[6] = spike5;
			Spike spike6 = new Spike(16);
			interactingPieces.add(spike6);
			gameBoard[16] = spike6;
			Tunnel exit2 = new Tunnel(4);
			interactingPieces.add(exit2);
			gameBoard[4] = exit2;
			//fills both sides with bombs
			for(int i = 0; i<=2; i++ ) {
				Bomb b = new Bomb(i);
				interactingPieces.add(b);
				gameBoard[i]=b;
				
			}
			for(int i = 17; i<=20; i++ ) {
				Bomb b = new Bomb(i);
				interactingPieces.add(b);
				gameBoard[i]=b;
				
			}
			//loads second level
		case 2:
			Spike spike = new Spike(10);
			interactingPieces.add(spike);
			gameBoard[10] = spike;
			Bomb bomb = new Bomb(13);
			interactingPieces.add(bomb);
			gameBoard[13] = bomb;
			Pacman pacman = new Pacman();
			movingPieces.add(pacman);
			interactingPieces.add(pacman);
			gameBoard[0] = pacman;
			Kangaroo kang = new Kangaroo(20);
			movingPieces.add(kang);
			interactingPieces.add(kang);
			gameBoard[20]=(kang);
			Tunnel exit = new Tunnel(15);
			interactingPieces.add(exit);
			gameBoard[15] = exit;
			Painting picasso = new Painting();
			gameBoard[2]=picasso;
			break;
		}
		
	}
	

	
}
