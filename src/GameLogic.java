import Utilities.DecisionTreeManager;
import Utilities.GameBoardManager;
import Entities.DecisionTree;

public class GameLogic implements IGameLogic {
    private int x = 0;
    private int y = 0;
    private int playerID;
    private int[][] gameBoard;
    private DecisionTreeManager dTManager;
    private GameBoardManager gameBoardManager;
    
    public GameLogic() {
        //TODO Write your implementation for this method
    	dTManager = new DecisionTreeManager();
    	gameBoardManager = new GameBoardManager();
    }
	
    public void initializeGame(int x, int y, int playerID) {
        this.x = x;
        this.y = y;
        this.gameBoard = MathUtils.Helpers.rotateMatrix(new int[x][y]);
        this.playerID = setPlayerID(playerID);
    }
	
    private int setPlayerID(int playerIDValue) {
		// TODO Auto-generated method stub
    	if (playerIDValue == 0)
    	{
    		return 1;
    	}
		return 2;
	}

	public Winner gameFinished() {
        return Winner.NOT_FINISHED;
    }

    public void insertCoin(int column, int playerID) {
    	gameBoard = gameBoardManager
    			.makeMove(gameBoard, column, playerID)
    			.getGameBoardValue();
    }

    public int decideNextMove() {
    	
    	DecisionTree dTree = new DecisionTree();
    	int[][] tempGameBoard = gameBoard;
    	dTree.rootNode = dTManager.createDecisionSubtree(10, tempGameBoard, dTManager.alteratePlayer(playerID), true);
    	return dTree.rootNode.getSelectedColumn();
    }
}
