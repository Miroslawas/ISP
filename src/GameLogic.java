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
        this.gameBoard = new int[x][y];
        this.playerID = playerID;
    }
	
    public Winner gameFinished() {
        return Winner.NOT_FINISHED;
    }


    public void insertCoin(int column, int playerID) {
    	gameBoard = gameBoardManager.makeMove(gameBoard, column, playerID);
    }

    public int decideNextMove() {
    	DecisionTree dTree = dTManager.GenerateDecisionTree(0, gameBoard, playerID);
    	
        return 0;
    }

}
