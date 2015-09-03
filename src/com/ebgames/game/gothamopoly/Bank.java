package com.ebgames.game.gothamopoly;

public class Bank {
	
	private int bankTotal;
	

	public Bank() {
		bankTotal = 15000;		
	}
	
	public int payToBank(int deposit){
		bankTotal += deposit;
		
		return bankTotal;
	}
	
	public void getFromBank(int withdraw) {
		bankTotal -= withdraw;
	}

	public int getBankTotal() {
		return bankTotal;
	}

	public void setBankTotal(int bankTotal) {
		this.bankTotal = bankTotal;
	}
	
}