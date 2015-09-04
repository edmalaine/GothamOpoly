package com.ebgames.game.gothamopoly.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ebgames.game.gothamopoly.Bank;
import com.ebgames.game.gothamopoly.Board;
import com.ebgames.game.gothamopoly.Player;
import com.ebgames.game.gothamopoly.Tile;

public class WhenPlayerLandsOnTile {

	Board board = new Board();
	List<Tile> tiles = board.createTiles();
	Player player1 = new Player("Batman");
	Player player2 = new Player("Joker");
	Bank bank = new Bank();
	Map<Tile, Player> owners = new HashMap<Tile, Player>();
	
	@Before
	public void setUp() throws Exception {
		board = new Board();
		board.createTiles();
		// board.createPlayer();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void TilesShouldExist() {
		player1.setPlayerLocationIndex(23);
		assertNotNull(tiles.get(23));
		// getTileName(player1.getPlayerLocationIndex());
	}
	
	@Test
	public void ShouldBeAbleToBuyUnownedTile() {
		int playerBoardSpaceIndex = 23;
		player1.setPlayerLocationIndex(playerBoardSpaceIndex);
		
		if (player1.getPlayerMoney() > tiles.get(playerBoardSpaceIndex).getTilePrice() && 
				tiles.get(playerBoardSpaceIndex).isTileOwned()==false) {
			player1.playerSpend(tiles.get(playerBoardSpaceIndex).getTilePrice());
			bank.payToBank(tiles.get(playerBoardSpaceIndex).getTilePrice());
			player1.setPlayerOwnedTiles(tiles.get(playerBoardSpaceIndex));
			owners.put(tiles.get(playerBoardSpaceIndex), player1);
			tiles.get(playerBoardSpaceIndex).setTileOwned(true);							
			
		}
		
		assertEquals("Batman", owners.get(tiles.get(playerBoardSpaceIndex)).getPlayerName());
	}
	
	@Test
	public void ShouldBeAbleToPayRentOnOwnedTile() {
		int playerBoardSpaceIndex = 23;
		owners.put(tiles.get(playerBoardSpaceIndex), player1);
		
			//player pays to owner of tile
			player2.playerSpend(tiles.get(playerBoardSpaceIndex).getTilePrice());
			owners.get(tiles.get(playerBoardSpaceIndex)).playerCollect(tiles.get(playerBoardSpaceIndex).getTilePrice());
		
		assertEquals(player1.getPlayerMoney(), 2500 + tiles.get(playerBoardSpaceIndex).getTilePrice());
	}

}