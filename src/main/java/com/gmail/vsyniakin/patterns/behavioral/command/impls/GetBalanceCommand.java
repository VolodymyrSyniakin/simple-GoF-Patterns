package com.gmail.vsyniakin.patterns.behavioral.command.impls;

import com.gmail.vsyniakin.patterns.behavioral.command.Command;
import com.gmail.vsyniakin.patterns.behavioral.command.Stock;

public class GetBalanceCommand implements Command {
	
	private Stock product;
	
	public GetBalanceCommand(Stock product) {
		super();
		this.product = product;
	}

	public void execute() {
		product.getCount();
	}
}
