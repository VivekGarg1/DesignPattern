package com.home.behavioral.chainofresponsiblty;

public class Rs200DispenseChain implements MoneyDispenseChain {

	private MoneyDispenseChain moneyDispenseChain;

	@Override
	public void setNextChain(MoneyDispenseChain moneyDispenseChain) {
		this.moneyDispenseChain = moneyDispenseChain;
	}

	@Override
	public void dispense(Currency currency) {
		if (currency.getAmount() >= 200) {
			int noOfNotes = currency.getAmount() / 200;
            int remainder=  currency.getAmount() % 200;
            System.out.println("Dispensing "+noOfNotes+" notes of Rs 200");
            if(remainder !=0)
            	moneyDispenseChain.dispense(new Currency(remainder));
		} else
			moneyDispenseChain.dispense(currency);
	}

}
