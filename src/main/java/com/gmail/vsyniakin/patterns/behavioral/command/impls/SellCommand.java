package com.gmail.vsyniakin.patterns.behavioral.command.impls;

import com.gmail.vsyniakin.patterns.behavioral.command.Command;
import com.gmail.vsyniakin.patterns.behavioral.command.Stock;

public class SellCommand implements Command {
	
	private Stock product;
	private int count;
	
	public SellCommand(Stock product, int count) {
		super();
		this.product = product;
		this.count = count;
	}

	public void execute() {
		product.sell(count);

	}

}
