package com.gmail.vsyniakin.patterns.behavioral.observer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observable {

	private int temperature;
	private int pressure;
	private LocalDateTime date;
	private List<Observer> observers = new ArrayList<Observer>();

	public MeteoStation() {
		super();
	}

	public void setWeather(LocalDateTime date, int temperature, int pressure) {
		this.date = date;
		this.temperature = temperature;
		this.pressure = pressure;
		notifyObserver();
	}

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.handleEvent(this.date, this.temperature, this.pressure);
		}
	}

}
