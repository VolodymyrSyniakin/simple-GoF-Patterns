package com.gmail.vsyniakin.patterns.behavioral.chainofresponsibility;

public abstract class AbstractLogger {
	public static final int INFO = 1;
	public static final int DEBUG = 2;
	public static final int ERROR = 3;

	protected int level;
	protected AbstractLogger nextLogger;

	public AbstractLogger setNext(AbstractLogger logger) {
		nextLogger = logger;
		return logger;
	}
	
	public void logMessage (String msg, int lvl) {
		if (this.level<=lvl) {
			write(msg);
		}
		if (this.nextLogger != null) {
			nextLogger.logMessage(msg, lvl);
		}
	}
	
	abstract protected void write (String message);

}
