package com.gmail.vsyniakin.patterns.structural.adapter;

import java.util.List;

public class AdapterWriteList implements WriteList {

	private Console console;
	
	public AdapterWriteList(Console console) {
		super();
		this.console = console;
	}

	public void print(List<String> list) {
		for (String text: list) {
			console.print(text);
		}
	}

	public Console getConsole() {
		return console;
	}

	public void setConsole(Console console) {
		this.console = console;
	}
	
}
