package com.gmail.vsyniakin.patterns.behavioral.command;

public class Broker {
	private Command buy;
	private Command sell;
	private Command balance;
	
	public Broker(Command buy, Command sell, Command balance) {
		super();
		this.buy = buy;
		this.sell = sell;
		this.balance = balance;
	}

	public void buy () {
		buy.execute();
	}
	public void sell () {
		sell.execute();
	}
	public void balance () {
		balance.execute();
	}

}
