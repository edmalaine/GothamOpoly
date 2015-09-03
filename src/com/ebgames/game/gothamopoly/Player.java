package com.ebgames.game.gothamopoly;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private String playerName;
	private int playerLocationIndex;
	private final int PLAYER_MONEY_TO_START = 2500;
	private int playerMoney;
	private List<Tile> playerOwnedTiles = new ArrayList<Tile>();
	
	public Player() {
		this.setPlayerName("Player 1");
		setPlayerLocationIndex(0);
		setPlayerMoney(PLAYER_MONEY_TO_START);
		
	}
	
	public Player(String playerName) {
		this.setPlayerName(playerName);
		setPlayerLocationIndex(0);
		setPlayerMoney(PLAYER_MONEY_TO_START);
		
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

	public int getPlayerMoney() {
		return playerMoney;
	}

	public void setPlayerMoney(int playerMoney) {
		this.playerMoney = playerMoney;
	}
	
	public void playerCollect(int money){
		playerMoney += money;
	}
	
	public void playerSpend(int money){
		playerMoney -= money;
	}

	public List<Tile> getPlayerOwnedTiles() {
		return playerOwnedTiles;
	}

	public void setPlayerOwnedTiles(Tile playerOwnedTile) {
		playerOwnedTiles.add(playerOwnedTile);
	}
	
}
