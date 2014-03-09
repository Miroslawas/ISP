package Entities;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {
	private List<BoardColumn> boardColumns;
	
	public GameBoard()
	{
		boardColumns = new ArrayList<BoardColumn>();
	}
	
	public GameBoard(int[][] gameBoard){
		boardColumns = boardToGameBoard(gameBoard).getBoardColumns();
	}
	
	public GameBoard(List<BoardColumn> boardColumnsValue)
	{
		boardColumns = boardColumnsValue;
	}
	
	public List<BoardColumn> getBoardColumns(){
		return boardColumns;
	}
	
	public void setBoardColumns(List<BoardColumn> boardColumnsValue)
	{
		boardColumns = boardColumnsValue;
	}
	
	public void addBoardColumn(BoardColumn newBoardColumn)
	{
		boardColumns.add(newBoardColumn);
	}
	
	public static GameBoard boardToGameBoard(int[][] gameBoard)
	{
		GameBoard returnValue = new GameBoard();
		
		for(int i = 0; i < gameBoard.length; i++)
		{
			BoardColumn boardColumn = new BoardColumn();
			for (int j = 0; j < gameBoard[0].length; j++)
			{
				Cell newCell = new Cell(i, j, gameBoard[i][j]);
				boardColumn.AddCell(newCell);
			}
			returnValue.addBoardColumn(boardColumn);
		}
		
		return returnValue;
	}
}
