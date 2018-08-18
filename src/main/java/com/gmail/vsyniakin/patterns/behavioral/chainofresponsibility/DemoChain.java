package com.gmail.vsyniakin.patterns.behavioral.chainofresponsibility;

import com.gmail.vsyniakin.patterns.behavioral.chainofresponsibility.loggers.FileLogger;
import com.gmail.vsyniakin.patterns.behavioral.chainofresponsibility.loggers.ErrorLogger;
import com.gmail.vsyniakin.patterns.behavioral.chainofresponsibility.loggers.ConsoleLogger;

public class DemoChain {

	public static AbstractLogger getChainOfLoggers() {
		AbstractLogger chain = new ErrorLogger(AbstractLogger.ERROR);
		
		chain.setNext(new FileLogger(AbstractLogger.DEBUG))
				.setNext(new ConsoleLogger(AbstractLogger.INFO));

		return chain;
	}
	
	public static void main(String[] args) {
		AbstractLogger loggers = getChainOfLoggers();
		
		loggers.logMessage("info msg", AbstractLogger.INFO);
		loggers.logMessage("debug msg", AbstractLogger.DEBUG);
		loggers.logMessage("error msg", AbstractLogger.ERROR);
		
	}
	
}
