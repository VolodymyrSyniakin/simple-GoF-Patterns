package com.gmail.vsyniakin.patterns.structural.facade;

public class DemoFacade {

	public static void main(String[] args) {
		FlashDrive fl = new FlashDrive("information");

		CopyFacade facade = new CopyFacade();

		facade.copy(fl);
	}
}
