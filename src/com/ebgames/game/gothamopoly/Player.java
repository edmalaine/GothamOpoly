package com.ebgames.game.gothamopoly;

public class Player {

	private String playerName;
	private int playerLocationIndex;
	
	public Player() {
		this.setPlayerName("Player 1");
		setPlayerLocationIndex(0);
	}
	
	public Player(String playerName) {
		this.setPlayerName(playerName);
		setPlayerLocationIndex(0);
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerLocationIndex() {
		return playerLocationIndex;
	}

	public void setPlayerLocationIndex(int playerLocationIndex) {
		this.playerLocationIndex = playerLocationIndex;
	}

}
