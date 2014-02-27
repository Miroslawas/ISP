package Utilities;

import java.util.ArrayList;
import java.util.List;

import com.sun.tools.javac.util.Pair;

import Entities.TokenCluster;

public class GameBoardManager {
	
	
	/**
	 * @param gameBoard
	 * @param player
	 * @return Returns column indexes for possible moves
	 */
	public List<Integer> getPossibleMoves(int[][] gameBoard, int player)
	{
		List<Integer> columns = new ArrayList<Integer>();
		int rowCount = gameBoard[0].length;
		for (int i = 0; i < gameBoard.length; i ++)
		{
			if (gameBoard[i][rowCount] == 0)
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
		
		for(int i = 0; i < gameBoard.length; i++)
		{
			for (int j = 0; j < gameBoard.length; j ++)
			{
				
			}
		}
		
		return tokenClusters;
	}


	public int[][] makeMove(int[][] gameBoard, int columnIndex, int player) 
	{
		int firstEmptyRow = getEmptyRowIndex(gameBoard[columnIndex]);
		gameBoard[columnIndex][firstEmptyRow] = player;
		return gameBoard;
	}


	private int getEmptyRowIndex(int[] column) {
		
		for (int i = column.length; i > 0; i--)
		{
			if (column[i-1] == 0)
			{
				return column.length - i;
			}
		}
		
		return 0;
	}
}
