package com.gmail.vsyniakin.patterns.behavioral.command.impls;

import com.gmail.vsyniakin.patterns.behavioral.command.Command;
import com.gmail.vsyniakin.patterns.behavioral.command.Stock;

public class BuyCommand implements Command {
	
	private Stock product;
	private int count;
	
	public BuyCommand(Stock product, int count) {
		super();
		this.product = product;
		this.count = count;
	}

	public void execute() {
		product.buy(count);

	}

}
