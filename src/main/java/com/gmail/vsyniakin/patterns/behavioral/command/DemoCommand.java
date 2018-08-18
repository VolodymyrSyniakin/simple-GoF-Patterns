package com.gmail.vsyniakin.patterns.behavioral.command;

import com.gmail.vsyniakin.patterns.behavioral.command.impls.BuyCommand;
import com.gmail.vsyniakin.patterns.behavioral.command.impls.GetBalanceCommand;
import com.gmail.vsyniakin.patterns.behavioral.command.impls.SellCommand;

public class DemoCommand {

	public static void main(String[] args) {
		
		Stock bike = new Stock("bike", 10);
		
		Broker broker = new Broker(new BuyCommand(bike, 1), new SellCommand(bike, 1), new GetBalanceCommand(bike));
		
		broker.buy();
		broker.sell();
		broker.sell();
		broker.balance();
	}

}
