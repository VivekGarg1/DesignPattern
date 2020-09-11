package com.home.behavioral.chainofresponsiblty;

public class Rs2000DispenseChain implements MoneyDispenseChain {

	private MoneyDispenseChain moneyDispenseChain;

	@Override
	public void setNextChain(MoneyDispenseChain moneyDispenseChain) {
		this.moneyDispenseChain = moneyDispenseChain;
	}

	@Override
	public void dispense(Currency currency) {
		if (currency.getAmount() >= 2000) {
			int noOfNotes = currency.getAmount() / 2000;
            int remainder=  currency.getAmount() % 2000;
            System.out.println("Dispensing "+noOfNotes+" notes of Rs 2000");
            if(remainder !=0)
            	moneyDispenseChain.dispense(new Currency(remainder));
		} else
			moneyDispenseChain.dispense(currency);
	}

}
