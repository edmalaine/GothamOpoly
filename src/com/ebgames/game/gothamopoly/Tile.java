package com.ebgames.game.gothamopoly;

public class Tile {

	private String tileName;
	private String tileColor;
	private String tileAction;
	private double tilePrice;

	public Tile() {
		setTileName("");
		tileColor = "";
		setTileAction("");
		tilePrice = 0;
	}
	
	public Tile(String tileName, String tileColor, String tileAction, double tilePrice) {
		this.setTileName(tileName);
		this.tileColor = tileColor;
		this.setTileAction(tileAction);
		this.tilePrice = tilePrice;
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
	
}