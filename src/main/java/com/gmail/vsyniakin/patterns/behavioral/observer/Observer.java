package com.gmail.vsyniakin.patterns.behavioral.observer;

import java.time.LocalDateTime;

public interface Observer {
	void handleEvent (LocalDateTime date, int temperature, int pressure);
}
