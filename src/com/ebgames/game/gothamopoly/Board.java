package com.ebgames.game.gothamopoly;

import java.util.LinkedList;
import java.util.List;

public class Board {

	List<Tile> tiles = new LinkedList<Tile>();	
		
	public List<Tile> createTiles() {
		tiles.add(new Tile("GO!", "Gray", "collect", 200));
		tiles.add(new Tile("The Cauldron", "Brown", "buy", 60));
		tiles.add(new Tile("Community Chest", "Gray", "draw_card", 0));
		tiles.add(new Tile("The East End", "Brown", "buy", 60));
		tiles.add(new Tile("Income Tax", "Gray", "pay", 200));
		tiles.add(new Tile("Railroad #1", "Black", "buy", 200));
		tiles.add(new Tile("The Diamond District", "Cyan", "buy", 100));
		tiles.add(new Tile("Chance", "Gray", "draw_card", 0));
		tiles.add(new Tile("Crime Alley", "Cyan", "buy", 100));
		tiles.add(new Tile("Falcone Penthouse", "Cyan", "buy", 120));
		tiles.add(new Tile("Arkham Asylum", "Gray", "Visiting Arkham Asylum", 0));
		tiles.add(new Tile("Gotham Square", "Purples", "buy", 140));
		tiles.add(new Tile("Gotham City Electric Company", "Gray", "buy", 150));
		tiles.add(new Tile("Old Gotham", "Purple", "buy", 140));
		tiles.add(new Tile("The Clocktower", "Purple", "buy", 160));
		tiles.add(new Tile("Railroad #2", "Black", "buy", 200));
		tiles.add(new Tile("GCPD Headquarters", "Orange", "buy", 180));
		tiles.add(new Tile("Community Chest", "Gray", "draw_card", 0));
		tiles.add(new Tile("Statue of Justice", "Orange", "buy", 180));
		tiles.add(new Tile("Gotham Docks", "Orange", "buy", 200));
		tiles.add(new Tile("Free Parking", "Gray", "parking", 0));
		tiles.add(new Tile("Gotham Village", "Red", "buy", 220));
		tiles.add(new Tile("Chance", "Gray", "draw_card", 0));
		tiles.add(new Tile("Robinson Park", "Red", "buy", 220));
		tiles.add(new Tile("Plant Factory", "Red", "buy", 240));
		tiles.add(new Tile("Railroad #3", "Black", "buy", 200));
		tiles.add(new Tile("Fashion District", "Yellow", "buy", 260));
		tiles.add(new Tile("Financial District", "Yellow", "buy", 260));
		tiles.add(new Tile("Gotham Water & Sewage", "Gray", "buy", 150));
		tiles.add(new Tile("New Town", "Yellow", "buy", 220));
		tiles.add(new Tile("Solomon Wayne Courthouse", "Gray", "jail", 0));
		tiles.add(new Tile("Park Row", "Green", "buy", 300));
		tiles.add(new Tile("Grand Avenue", "Green", "buy", 300));
		tiles.add(new Tile("Community Chest", "Gray", "draw_card", 0));
		tiles.add(new Tile("Gotham Heights", "Green", "buy", 320));
		tiles.add(new Tile("Railroad #4", "Black", "buy", 200));
		tiles.add(new Tile("Chance", "Gray", "draw_card", 0));
		tiles.add(new Tile("Wayne Tower", "Blue", "buy", 350));
		tiles.add(new Tile("Luxury Tax", "Gray", "pay", 100));
		tiles.add(new Tile("Wayne Manor", "Blue", "buy", 400));
		
		return tiles;
	}
	
	public String getTileNameByIndex(int index) {
		String name = tiles.get(index).getTileName();
				
		return name;
	}

	public Tile getTileByIndex(int index) {
		Tile tile = tiles.get(index);
				
		return tile;
	}
	
	public int getTilePriceByIndex(int index) {
		int price = tiles.get(index).getTilePrice();
		
		return price;
	}
	
}
