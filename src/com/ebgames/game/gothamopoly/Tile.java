package com.ebgames.game.gothamopoly;

public class Tile {

	private String tileName;
	private String tileColor;
	private String tileAction;
	private int tilePrice;
	private boolean tileOwned;
	Player owner = new Player();

	public Tile() {
		setTileName("");
		setTileColor("");
		setTileAction("");
		setTilePrice(0);
		setTileOwned(false);
	}
	
	public Tile(String tileName, String tileColor, String tileAction, int tilePrice) {
		this.setTileName(tileName);
		this.setTileColor(tileColor);
		this.setTileAction(tileAction);
		this.setTilePrice(tilePrice);
		setTileOwned(false);
	}

	public String getTileName() {
		return tileName;
	}

	public void setTileName(String tileName) {
		this.tileName = tileName;
	}

	public String getTileAction() {
		return tileAction;
	}

	public void setTileAction(String tileAction) {
		this.tileAction = tileAction;
	}

	public int getTilePrice() {
		return tilePrice;
	}

	public void setTilePrice(int tilePrice) {
		this.tilePrice = tilePrice;
	}

	public String getTileColor() {
		return tileColor;
	}

	public void setTileColor(String tileColor) {
		this.tileColor = tileColor;
	}

	public boolean isTileOwned() {
		return tileOwned;
	}

	public void setTileOwned(boolean tileOwned) {
		this.tileOwned = tileOwned;
	}
	
}