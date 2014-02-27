package Entities;

public class Node {
	
	private boolean isMaxNode;
	private int[][] gameBoard;
	private int selectedColumn;
	private float utility;
	
	public Node(int[][] gameBoardValue, boolean isMaxNodeValue)
	{
		isMaxNode = isMaxNodeValue;
		gameBoard = gameBoardValue;
	}
	
	public void setUtility(float utilityValue)
	{
		utility = utilityValue;
	}
	
	public float getUtility()
	{
		return utility;
	}
		
	public int[][] getGameBoard()
	{
		return gameBoard;
	}
	
	public void setGameBoard(int[][] gameBoardValue)
	{
		gameBoard = gameBoardValue; 
	}
	
	public boolean getMaxNode()
	{
		return isMaxNode;
	}
	
	public void setIsMaxNode(boolean value)
	{
		isMaxNode = value;
	}

	public int getSelectedColumn() {
		return selectedColumn;
	}

	public void setSelectedColumn(int selectedColumn) {
		this.selectedColumn = selectedColumn;
	}
}
