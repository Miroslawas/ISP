package Entities;

import java.util.ArrayList;
import java.util.List;

public class Node {
	
	private boolean isMaxNode;
	private int[][] gameBoard;
	private List<Node> childrenNodes;
	private int selectedColumn;
	private float utility;
	
	public Node()
	{
		childrenNodes = new ArrayList<Node>();
	}
	
	public Node(int[][] gameBoardValue, boolean isMaxNodeValue, int utilityValue, int selectedColumnValue)
	{
		isMaxNode = isMaxNodeValue;
		gameBoard = gameBoardValue;
		utility = utilityValue;
		selectedColumn = selectedColumnValue;
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

	public void addChildrenNode(Node childrenNode)
	{
		this.childrenNodes.add(childrenNode);
	}
	
	public List<Node> getChildrenNodes() {
		return childrenNodes;
	}

	public void setChildrenNodes(List<Node> childrenNodes) {
		this.childrenNodes = childrenNodes;
	}
}
