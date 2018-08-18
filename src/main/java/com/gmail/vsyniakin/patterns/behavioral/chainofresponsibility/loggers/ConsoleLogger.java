package com.gmail.vsyniakin.patterns.behavioral.chainofresponsibility.loggers;

import com.gmail.vsyniakin.patterns.behavioral.chainofresponsibility.AbstractLogger;

public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("console: " + message);
	}

}
