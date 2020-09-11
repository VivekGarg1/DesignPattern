package com.home.behavioral.chainofresponsiblty;

public class ATMMachineDispenseChain {
	
	private MoneyDispenseChain moneyDispenseChain1;

	public ATMMachineDispenseChain() {
		moneyDispenseChain1=new Rs2000DispenseChain();
		MoneyDispenseChain moneyDispenseChain2=new Rs500DispenseChain();
		MoneyDispenseChain moneyDispenseChain3=new Rs200DispenseChain();
		MoneyDispenseChain moneyDispenseChain4=new Rs100DispenseChain();
		
		moneyDispenseChain1.setNextChain(moneyDispenseChain2);
		moneyDispenseChain2.setNextChain(moneyDispenseChain3);
		moneyDispenseChain3.setNextChain(moneyDispenseChain4);
	}

	public MoneyDispenseChain getMoneyDispenseChain1() {
		return moneyDispenseChain1;
	}

}
