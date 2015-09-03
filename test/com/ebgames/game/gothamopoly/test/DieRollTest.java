package com.ebgames.game.gothamopoly.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ebgames.game.gothamopoly.Die;
import com.ebgames.game.gothamopoly.RequiredMinDieFacesException;

public class DieRollTest {

	Die die;

	@Before
	public void setUp() throws Exception {
		die = new Die();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testDieRollNotNull() {
		assertNotNull(die.rollDie());
	}

	@Test
	public final void testDieRollBetwen1And6() {
		int testValue = -1;

		for (long i = 0; i < 100000000L; i++) {
			testValue = die.rollDie();

			if (testValue < 1) {
				System.out.println("INVALID Die value less than 1");
			} else if (testValue > 6) {
				System.out.println("INVALID Die value more than 6");
			}
		}
	}

	@Test
	public final void testDieRollLessThan1() {
		int testValue = -1;
		
		for (long i = 0; i < 100000000L; i++) {
			testValue = die.rollDie();
			
			if (testValue < 1 ) {
				System.out.println("INVALID Die value less than 1");
			}
		}

	}
	
	@Test
	public void testCanRollDie() throws RequiredMinDieFacesException {
		assertNotNull("Die did not roll", die.rollDie());
		
		/*
		try {
			assertNotNull("Die did not roll", die.rollDie());
		} catch (RequiredMinDieFacesException rmdf) {
			fail(rmdf.getLocalizedMessage());
		}
		*/
	}

}
