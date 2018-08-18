package com.gmail.vsyniakin.patterns.behavioral.observer;

import java.time.LocalDateTime;

public class DemoObserver {

	public static void main(String[] args) {
		MeteoStation station = new MeteoStation();
		Observer console = new ConsoleObserver();
		Observer file = new FileObserver();
		
		station.addObserver(console);
		station.addObserver(file);
		
		station.setWeather(LocalDateTime.now(), 15, 750);
		station.setWeather(LocalDateTime.now(), 25, 770);
	}
}
