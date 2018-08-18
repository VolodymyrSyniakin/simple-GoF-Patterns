package com.gmail.vsyniakin.patterns.behavioral.chainofresponsibility.loggers;

import com.gmail.vsyniakin.patterns.behavioral.chainofresponsibility.AbstractLogger;

public class FileLogger extends AbstractLogger {

	public FileLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("file: " + message);
	}

}
