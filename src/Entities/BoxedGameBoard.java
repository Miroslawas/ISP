package Entities;

public class BoxedGameBoard {
	private boolean isValid;
	private int[][] gameBoard;
	
	public BoxedGameBoard(boolean isValidValue, int[][] gameBoardValue)
	{
		isValid = isValidValue;
		gameBoard = gameBoardValue;
	}
	
	public boolean isValidValue() { 
		return isValid;
	}
	
	public void setValidValue(boolean isValidValue) {
		this.isValid = isValidValue;
	}
	
	public int[][] getGameBoardValue() {
		return gameBoard;
	}
	
	public void setGameBoardValue(int[][] gameBoardValue) {
		this.gameBoard = gameBoardValue;
	}
}
