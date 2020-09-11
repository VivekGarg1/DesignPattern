package com.home.client;

import java.util.Scanner;

import com.home.behavioral.chainofresponsiblty.ATMMachineDispenseChain;
import com.home.behavioral.chainofresponsiblty.Currency;

public class ChinOfResponsibilityClient {

	public static void main(String[] args) {
       
		ATMMachineDispenseChain atmMachineDispenseChain=new ATMMachineDispenseChain();
		Scanner scanner=null;
		while(true) {
			int amount=0;
			try {
				System.out.println("Please enter amount to dispense: ");
				scanner=new Scanner(System.in);
				amount=scanner.nextInt();
				if(amount % 100 !=0) {
					System.out.println("Amount should be multiple of Rs 100");
					return;
				}
				else {
					atmMachineDispenseChain.getMoneyDispenseChain1().dispense(new Currency(amount));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
