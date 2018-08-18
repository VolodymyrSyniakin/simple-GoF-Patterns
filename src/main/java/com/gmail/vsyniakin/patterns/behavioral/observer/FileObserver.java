package com.gmail.vsyniakin.patterns.behavioral.observer;

import java.time.LocalDateTime;

public class FileObserver implements Observer {

	public void handleEvent(LocalDateTime date, int temperature, int pressure) {
		System.out.println("Write to file --> Weather is: t - " + temperature + " p - " + pressure + " on: " + date);

	}

}
