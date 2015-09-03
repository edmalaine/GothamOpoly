package com.ebgames.game.gothamopoly;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {

	static Board board = new Board();
	static Bank bank = new Bank();
	
	public static void main(String[] args) {
		
		Map<Tile, Player> owners = new HashMap<Tile, Player>(); 

		List<Tile> tiles = board.createTiles();

		List<Player> players = new ArrayList<Player>();

		players.add(new Player("Batman"));
		players.add(new Player("Joker"));
		players.add(new Player("Catwoman"));
		players.add(new Player("Poison Ivy"));

		Die rollDie1 = new Die();
		Die rollDie2 = new Die();

		int x = 0;
		int playerBoardSpaceIndex = 0;
		int dieDoubles;
		int dieDoublesTrigger;
		
		int numTilesOwned = 0;
		
		boolean gameContinues = true;
		
		do {
			
			System.out.println("\n\n.............................");
			System.out.println("\tRound # " + (x + 1));
			System.out.println(".............................");
			
			for (int i = 0; i < players.size(); i++) {
				do {
					int die1 = rollDie1.rollDie();
					int die2 = rollDie2.rollDie();
					int numOfSpacesToMove = (die1 + die2);
					
					String turnPlayerName = players.get(i).getPlayerName();
					playerBoardSpaceIndex = players.get(i).getPlayerLocationIndex();
					
					String doubles = "";
					dieDoublesTrigger = 0;
					dieDoubles = 0;
					
					if ((die1 == die2) && (players.get(i).getPlayerMoney() > 0)) {
						doubles = " (doubles) ";
						dieDoubles++;
						dieDoublesTrigger++;
							if (dieDoubles > 3)
								System.out.println("You have been caught rigging the dice at a gambling joint,"
										+ " you were sent to the Arkham Asylym to get counseling for your addiction.");
					}
					
					System.out.println("\n\n" + turnPlayerName + "'s Turn");
					System.out.println("-------------------------------------------");
					System.out.println("Currently at " + board.getTileByIndex(playerBoardSpaceIndex).getTileName());
					System.out.println("Currently have $" + players.get(i).getPlayerMoney());
					System.out.println("Rolled the dice for a " + die1 + " and " + die2 + " to equal " + numOfSpacesToMove + doubles);
					
					int tileCounter = numOfSpacesToMove;
					for (int counter = 0; tileCounter > 0; counter ++, tileCounter--) {
						playerBoardSpaceIndex++;
						// System.out.println("Counter Turn #: " + counter);
						// System.out.println("Index: " + playerBoardSpaceIndex);
						// System.out.println("numSpaces: " + tileCounter);
						// System.out.println("\n");
						
						//Passing GO
						if (playerBoardSpaceIndex > 39) {
							playerBoardSpaceIndex = 0;
							players.get(i).setPlayerLocationIndex(playerBoardSpaceIndex);
						}
					}
					
					players.get(i).setPlayerLocationIndex(playerBoardSpaceIndex);
					
					System.out.println("Moved " + numOfSpacesToMove + " spaces to stop at "
							+ tiles.get(playerBoardSpaceIndex).getTileName());
	
					System.out.println("Options: "
							+ tiles.get(playerBoardSpaceIndex).getTileAction()
							);
					
					if(tiles.get(playerBoardSpaceIndex).getTileAction().equalsIgnoreCase("buy"))
					{
						//player spends money, bank gains money
						if (players.get(i).getPlayerMoney() > tiles.get(playerBoardSpaceIndex).getTilePrice() && 
								tiles.get(playerBoardSpaceIndex).isTileOwned()==false) {
							players.get(i).playerSpend(tiles.get(playerBoardSpaceIndex).getTilePrice());
							bank.payToBank(tiles.get(playerBoardSpaceIndex).getTilePrice());
							players.get(i).setPlayerOwnedTiles(tiles.get(playerBoardSpaceIndex));
							owners.put(tiles.get(playerBoardSpaceIndex), players.get(i));
							tiles.get(playerBoardSpaceIndex).setTileOwned(true);							
							System.out.println(turnPlayerName + " pays $" + tiles.get(playerBoardSpaceIndex).getTilePrice()
							+ " and now owns " + tiles.get(playerBoardSpaceIndex).getTileName());
						}
						else if(tiles.get(playerBoardSpaceIndex).isTileOwned() == true)
						{
							//player pays to owner of tile
							System.out.println(players.get(i).getPlayerName() + " must pay " 
							+ tiles.get(playerBoardSpaceIndex).getTilePrice() + " to " + owners.get(tiles.get(playerBoardSpaceIndex)).getPlayerName());
							players.get(i).playerSpend(tiles.get(playerBoardSpaceIndex).getTilePrice());
							owners.get(tiles.get(playerBoardSpaceIndex)).playerCollect(tiles.get(playerBoardSpaceIndex).getTilePrice());
						}
					
					}
					if(tiles.get(playerBoardSpaceIndex).getTileAction().equalsIgnoreCase("draw_card"))
					{
						//player draws card
					}
					if(tiles.get(playerBoardSpaceIndex).getTileAction().equalsIgnoreCase("pay"))
					{
						//player loses money, bank gains money
						System.out.println(players.get(i).getPlayerName() + " must pay " 
								+ tiles.get(playerBoardSpaceIndex).getTilePrice() + " to the bank.");
								players.get(i).playerSpend(tiles.get(playerBoardSpaceIndex).getTilePrice());
								bank.payToBank(tiles.get(playerBoardSpaceIndex).getTilePrice());
					}
					if(tiles.get(playerBoardSpaceIndex).getTileAction().equalsIgnoreCase("collect"))
					{
						System.out.println("\n" + turnPlayerName + " has passed GO! Collect $200. \n");
						
						int passGoMoney = 200;
						bank.getFromBank(passGoMoney);
						players.get(i).playerCollect(passGoMoney);
						
						System.out.println("The bank now has $" + bank.getBankTotal());
						System.out.println(turnPlayerName + " now has $" + players.get(i).getPlayerMoney());
					}
					if(tiles.get(playerBoardSpaceIndex).getTileAction().equalsIgnoreCase("jail"))
					{
						//player gets trapped in jail
					}
					
					StringBuilder sb = new StringBuilder();
					sb.append(turnPlayerName + " owns: ");
					
					for (Tile t : players.get(i).getPlayerOwnedTiles() ){
						sb.append(" | " + t.getTileName() + " | ");
					}
					System.out.println(sb);
					// System.out.println("\n\n");
					
				} while ((dieDoubles > 0) && (dieDoubles < 4) && (dieDoublesTrigger > 0));
				
				if(players.get(i).getPlayerMoney() <= 0){
					
					System.out.println(players.get(i).getPlayerName() + " declared bankruptcy and is out of the game!");
					players.remove(i);
				}
			}
			x++;
			
			
			for(Tile t : tiles)
			{
				if(t.isTileOwned()==true){
					numTilesOwned ++;
				}
			}

			System.out.println("\n\n" + numTilesOwned + " tiles owned.");
			
			if(players.size() < 2)
			{
				gameContinues = false;
			}
			
			numTilesOwned = 0;
			
		} while (gameContinues);
		
		System.out.println("\n\n" + players.get(0).getPlayerName() + " has won the game!");
		System.out.println("\n\nGame ran for " + x + " rounds.");

		// right now all moves go to go. we need to fix the iterator and stop
		// using index somehow
	}

}
