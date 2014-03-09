package Utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.sun.tools.javac.util.Pair;

import Entities.BoxedGameBoard;
import Entities.GameBoard;
import Entities.TokenCluster;

public class GameBoardManager {
	
	private Map<String, GameBoard> gameBoards;
	
	/**
	 * @param gameBoard
	 * @param player
	 * @return Returns column indexes for possible moves
	 */
	public List<Integer> getPossibleMoveColumnIndexes(int[][] gameBoard, int player)
	{
		List<Integer> columns = new ArrayList<Integer>();
		int rowCount = gameBoard[0].length;
		for (int i = 0; i < gameBoard[0].length; i ++)
		{
			if (gameBoard[i][0] == 0)
			{
				columns.add(i);
			}
		}
		
		return columns;
	}
	
	
	/**
	 * @param gameBoard
	 * @return String representation of gameBoard object
	 *  so it can be used later in caching terminal values
	 *   for given board state (i.e. Dynamic programming)
	 */
	public static String boardToString(int[][] gameBoard)
	{
		String values = "";
		
		for(int i = 0; i < gameBoard.length; i++)
		{
			for (int j = 0; j < gameBoard[0].length; j++)
			{
				values += gameBoard[i][j];
			}
		}
	
		return values;
	}
	
	/**
	 * @param gameBoard
	 * @param player
	 * @return Returns list of player token clusters. Will be used as main criteria for  heuristics
	 */
	public List<TokenCluster> GetClusters(int[][] gameBoard, int player)
	{
 		List<Pair<Integer, Integer>> visitedCells = new ArrayList<Pair<Integer, Integer>>();
		List<TokenCluster> tokenClusters = new ArrayList<TokenCluster>();
		GameBoard gameBoardWrapper = new GameBoard(gameBoard);
		
		for(int i = 0; i < gameBoard.length; i++)
		{
			for (int j = 0; j < gameBoard.length; j ++)
			{
				
			}
		}
		
		return tokenClusters;
	}


	public BoxedGameBoard makeMove(int[][] gameBoard, int columnIndex, int player) 
	{
		int firstEmptyRow = getEmptyRowIndex(MathUtils.Helpers.getMatrixColumn(gameBoard, columnIndex));
		boolean validRow = firstEmptyRow != -1;
		if (validRow){
			gameBoard[MathUtils.Helpers.getColumnCount(gameBoard) - firstEmptyRow - 1][columnIndex] = player;
		}
		return new BoxedGameBoard(firstEmptyRow != -1, gameBoard);
	}


	private int getEmptyRowIndex(int[] column) {
		
		for (int i = 0; i < column.length; i++)
		{
			if (column[i] == 0)
			{
				return i;
			}
		}
		
		return -1;
	}


	public Map<String, GameBoard> getGameBoards() {
		return gameBoards;
	}

	public void setGameBoards(Map<String, GameBoard> gameBoards) {
		this.gameBoards = gameBoards;
	}
	
	public void addGameBoardToMap(GameBoard gameBoard)
	{
	}
}
