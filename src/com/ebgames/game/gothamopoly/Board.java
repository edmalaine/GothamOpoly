package com.ebgames.game.gothamopoly;

import java.util.LinkedList;
import java.util.List;

public class Board {

	public Board() {
		// TODO Auto-generated constructor stub
	}

		List<Tile> tiles = new LinkedList<Tile>();	
		
	public void createTiles() {
		
		tiles.add(new Tile("GO!", "Gray", "Collect $200", 0));
		tiles.add(new Tile("The Cauldron", "Brown", "Buy/Sell", 60));
		tiles.add(new Tile("Community Chest", "Gray", "Draw Card", 0));
		tiles.add(new Tile("The East End", "Brown", "Buy/Sell", 60));
		tiles.add(new Tile("Income Tax", "Gray", "Pay $200", 0));
		tiles.add(new Tile("Railroad #1", "Black", "Buy/Sell", 200));
		tiles.add(new Tile("The Diamond District", "Cyan", "Buy/Sell", 100));
		tiles.add(new Tile("Chance", "Gray", "Draw Card", 0));
		tiles.add(new Tile("Crime Alley", "Cyan", "Buy/Sell", 100));
		tiles.add(new Tile("Falcone Penthouse", "Cyan", "Buy/Sell", 120));
		tiles.add(new Tile("Arkham Asylum", "Gray", "You're in Jail OR Visiting", 0));
		tiles.add(new Tile("Gotham Square", "Purple", "Buy/Sell", 140));
		tiles.add(new Tile("Gotham City Electric Company", "Gray", "Buy/Sell", 150));
		tiles.add(new Tile("Old Gotham", "Purple", "Buy/Sell", 140));
		tiles.add(new Tile("The Clocktower", "Purple", "Buy/Sell", 160));
		tiles.add(new Tile("Railroad #2", "Black", "Buy/Sell", 200));
		tiles.add(new Tile("GCPD Headquarters", "Orange", "Buy/Sell", 180));
		tiles.add(new Tile("Community Chest", "Gray", "Draw Card", 0));
		tiles.add(new Tile("Statue of Justice", "Orange", "Buy/Sell", 180));
		tiles.add(new Tile("Gotham Docks", "Orange", "Buy/Sell", 200));
		tiles.add(new Tile("Free Parking", "Gray", "JACKPOT", 0));
		tiles.add(new Tile("Gotham Village", "Red", "Buy/Sell", 220));
		tiles.add(new Tile("Chance", "Gray", "Draw Card", 0));
		tiles.add(new Tile("Robinson Park", "Red", "Buy/Sell", 220));
		tiles.add(new Tile("Plant Factory", "Red", "Buy/Sell", 240));
		tiles.add(new Tile("Railroad #3", "Black", "Buy/Sell", 200));
		tiles.add(new Tile("Fashion District", "Yellow", "Buy/Sell", 260));
		tiles.add(new Tile("Financial District", "Yellow", "Buy/Sell", 260));
		tiles.add(new Tile("Gotham Water & Sewage", "Gray", "Buy/Sell", 150));
		tiles.add(new Tile("New Town", "Yellow", "Buy/Sell", 220));
		tiles.add(new Tile("Solomon Wayne Courthouse", "Gray", "Go to Jail!", 0));
		tiles.add(new Tile("Park Row", "Green", "Buy/Sell", 300));
		tiles.add(new Tile("Grand Avenue", "Green", "Buy/Sell", 300));
		tiles.add(new Tile("Community Chest", "Gray", "Draw Card", 0));
		tiles.add(new Tile("Gotham Heights", "Green", "Buy/Sell", 320));
		tiles.add(new Tile("Railroad #4", "Black", "Buy/Sell", 200));
		tiles.add(new Tile("Chance", "Gray", "Draw Card", 0));
		tiles.add(new Tile("Wayne Tower", "Blue", "Buy/Sell", 350));
		tiles.add(new Tile("Luxury Tax", "Gray", "Pay $100", 0));
		tiles.add(new Tile("Wayne Manor", "Blue", "Buy/Sell", 400));
		
	}
	
	public String getTileNameByIndex(int index) {
		String name = tiles.get(index).getTileName();
				
		return name;
	}

	public Tile getTilByIndex(int index) {
		Tile tile = tiles.get(index);
				
		return tile;
	}
	
	public List<Tile> getTiles(){
		
		return tiles;
	}
}
