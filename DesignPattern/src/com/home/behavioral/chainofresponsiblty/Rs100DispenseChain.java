package com.home.behavioral.chainofresponsiblty;

public class Rs100DispenseChain implements MoneyDispenseChain {

	private MoneyDispenseChain moneyDispenseChain;

	@Override
	public void setNextChain(MoneyDispenseChain moneyDispenseChain) {
		this.moneyDispenseChain = moneyDispenseChain;
	}

	@Override
	public void dispense(Currency currency) {
		if (currency.getAmount() >= 100) {
			int noOfNotes = currency.getAmount() / 100;
            int remainder=  currency.getAmount() % 100;
            System.out.println("Dispensing "+noOfNotes+" notes of Rs 100");
            if(remainder !=0)
            	moneyDispenseChain.dispense(new Currency(remainder));
		} else
			moneyDispenseChain.dispense(currency);
	}

}
