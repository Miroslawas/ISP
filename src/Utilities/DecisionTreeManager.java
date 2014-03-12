package Utilities;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Entities.BoxedGameBoard;
import Entities.DecisionTree;
import Entities.GameBoard;
import Entities.Node;
import Entities.TokenCluster;

public class DecisionTreeManager {
	private Map<String, Float> utilitiesCache;
	private GameBoardManager gameBoardManager;

	public DecisionTreeManager()
	{
		utilitiesCache = new HashMap<String, Float>();
		gameBoardManager = new GameBoardManager();
	}
	
	public Map<String, Float> getUtilitiesCache() {
		return utilitiesCache;
	}

	public void setUtilitiesCache(Map<String, Float> utilitiesCache) {
		this.utilitiesCache = utilitiesCache;
	}
	
	public Node createDecisionSubtree(int depth, int[][] gameBoard, int player, boolean isMaximizingState)
	{
		Node node = new Node();
		node.setUtility(getUtility(gameBoard, player));
		node.setGameBoard(gameBoard);
		
		if (depth == 0)
		{
			return node;
		}
		
		List<Integer> possibleMoves = gameBoardManager.getPossibleMoveColumnIndexes(gameBoard, player);
 		for (int moveIndex : possibleMoves)
		{
			BoxedGameBoard newBoard = gameBoardManager.makeMove(gameBoard, moveIndex, player);		
			if (newBoard.isValidValue())
			{
 				Node childrenNode = createDecisionSubtree(depth--, newBoard.getGameBoardValue(), alteratePlayer(player), !isMaximizingState);
				childrenNode.setUtility(getUtility(gameBoard, player));
				node.addChildrenNode(childrenNode);
			}
		}
		
		return node;
	}
	
	public int alteratePlayer(int player) {
		
		if (player == 1)
		{
			return 2;
		}
		
		return 1;
	}

	private float getUtility(int[][] gameBoard, int player)
	{
		String boardString = gameBoardManager.boardToString(gameBoard);
		//if (utilitiesCache.containsKey(boardString))
		//{
		//	return utilitiesCache.get(boardString);
		//}
		
		List<TokenCluster> clusters = gameBoardManager.GetClusters(gameBoard, player);
		
		//TODO: change 0 to real utility value
		utilitiesCache.put(boardString, (float)0);
		return 0;
	}
}