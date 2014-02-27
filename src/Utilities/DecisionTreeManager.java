package Utilities;
import java.util.List;
import java.util.Map;

import Entities.DecisionTree;

public class DecisionTreeManager {
	private Map<String, Float> utilitiesCache;
	private GameBoardManager gameBoardManager;

	public DecisionTreeManager()
	{
		gameBoardManager = new GameBoardManager();
	}
	
	public Map<String, Float> getUtilitiesCache() {
		return utilitiesCache;
	}

	public void setUtilitiesCache(Map<String, Float> utilitiesCache) {
		this.utilitiesCache = utilitiesCache;
	}
	
	public DecisionTree GenerateDecisionTree(int depth, int[][] gameBoard, int player)
	{
		
		return null;
	}
	
	private int MiniMaxDecision(int depth, int[][] gameBoard, int player)
	{
		List<Integer> moveIndexes = gameBoardManager.getPossibleMoves(gameBoard, player);
		
		for(int index : moveIndexes){
			int[][] newGameBoard = gameBoardManager.makeMove(gameBoard, index, player);
		}
		
		return 0;
	}
}