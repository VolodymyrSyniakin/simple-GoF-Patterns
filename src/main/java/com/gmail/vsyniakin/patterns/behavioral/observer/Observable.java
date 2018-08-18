package com.gmail.vsyniakin.patterns.behavioral.observer;

public interface Observable {
	void addObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObserver();
}
