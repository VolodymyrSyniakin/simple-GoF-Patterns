package com.gmail.vsyniakin.patterns.behavioral.chainofresponsibility.loggers;

import com.gmail.vsyniakin.patterns.behavioral.chainofresponsibility.AbstractLogger;

public class ErrorLogger extends AbstractLogger {
	
	public ErrorLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("error: " + message);

	}

}
