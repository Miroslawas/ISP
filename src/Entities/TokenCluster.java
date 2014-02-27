package Entities;

import java.util.List;

import com.sun.tools.javac.util.Pair;

public class TokenCluster {
	private int player;
	private int tokenCount;
	List<Pair<Integer, Integer>> clusterBounds;
	
	public int getTokenCount() {
		return tokenCount;
	}
	
	public void setTokenCount(int tokenCount) {
		this.tokenCount = tokenCount;
	}
	
	public int getPlayer() {
		return player;
	}
	
	public void setPlayer(int player) {
		this.player = player;
	} 
}
