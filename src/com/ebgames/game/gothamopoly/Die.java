/**
 * 
 */
package com.ebgames.game.gothamopoly;

import java.util.Random;

/**
 * @author ehedrick
 *
 */
public class Die {
	
	
	public int MAX_NUMBER_OF_DIE_FACES = 6;
	public int MIN_NUMBER_FOR_DIE = 1;
	public int REQUIRED_MIN_NUMBER_OF_FACES = 2;
	private int dieRoll;

	
	public int rollDie() {
		
		//Instantiates random object
		Random rand = new Random();
		
		int dieRoll = rand.nextInt((MAX_NUMBER_OF_DIE_FACES - MIN_NUMBER_FOR_DIE) + 1) + MIN_NUMBER_FOR_DIE;
		
		return dieRoll;
	}

	public int getDieRoll() {
		return dieRoll;
	}

	public void setDieRoll(int dieRoll) {
		this.dieRoll = dieRoll;
	}
	
	
	
	
	
	
	
	
	
	/*
	public DieRoll() throws RequiredMinDieFacesException {
		setNumberOfFaces(MAX_NUMBER_OF_DIE_FACES);
	}
	
	public DieRoll(int numberOfFaces) throws RequiredMinDieFacesException {
		setNumberOfFaces(numberOfFaces);
	}
	
	public void setNumberOfFaces(int numberOfFaces) throws RequiredMinDieFacesException {
		
		if (numberOfFaces < REQUIRED_MIN_DIE_FACES )
			throw new RequiredMinDieFacesException("WARNING: Required minimum of faces is" + REQUIRED_MIN_DIE_FACES);
		
		this.numberOfFaces = numberOfFaces;
	} */
	
}