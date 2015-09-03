package com.ebgames.game.gothamopoly.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ebgames.game.gothamopoly.Board;
import com.ebgames.game.gothamopoly.Player;

public class WhenPlayerLandsOnTile {

	Board board;
	Player player1 = new Player();
	
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
	public void testIfTileExists() {
		
		player1.setPlayerLocationIndex(23);
		
		assertNotNull(board.getTileNameByIndex(player1.getPlayerLocationIndex()));
		
		// getTileName(player1.getPlayerLocationIndex());
		
	}

}