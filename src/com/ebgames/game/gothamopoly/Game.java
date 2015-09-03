package com.ebgames.game.gothamopoly;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Game {
	
	static Board board = new Board();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		board.createTiles();
		
		List<Player> players = new ArrayList<Player>();
		
		players.add(new Player("Batman"));
		players.add(new Player("Joker"));
		
		
		Die die1 = new Die();
		Die die2 = new Die();
		
		int x = 0;
		do{
		
		for (int i = 0; i < players.size(); i++) {
			
				int numSpaces = (die1.rollDie() + die2.rollDie());
				
				System.out.println(players.get(i).getPlayerName() + " rolled a " + numSpaces);
				
				moveSpaces(numSpaces, players.get(i).getPlayerLocationIndex());
				
				System.out.println(players.get(i).getPlayerName() + " moved " + numSpaces + " to " 
				+ board.getTilByIndex(players.get(i).getPlayerLocationIndex()).getTileName());
				
				//board.getTilByIndex(players.get(i).getPlayerLocationIndex());
				
				System.out.println("Action: " + board.getTilByIndex(players.get(i).getPlayerLocationIndex()).getTileAction());
			
			
		}
		x++;
		}while(x <= 7);
		
		
		
		//right now all moves go to go. we need to fix the iterator and stop using index somehow
	}
	
	public static Tile moveSpaces(int numSpaces, int index){
		int numOfSpaces = numSpaces;
		int currentIndex = index;
		Tile newTile = new Tile();
	
		List<Tile> tiles = board.getTiles();
		Iterator iter = tiles.iterator();
		for(int spaces = numOfSpaces, playerIndex = currentIndex ; spaces > 0; spaces--, playerIndex++){
			if(!tiles.iterator().hasNext()){
			  iter = tiles.iterator();
			}
			newTile = tiles.listIterator(currentIndex).next();
		}
		return newTile;
	}

}
