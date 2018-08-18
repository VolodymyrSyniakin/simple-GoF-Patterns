package com.gmail.vsyniakin.patterns.structural.facade;

public class CopyFacade {
	private UsbSocket usbSocket = new UsbSocket();
	private Hdd hdd = new Hdd();
	
	public void copy(FlashDrive flashDrive) {
		usbSocket.insert(flashDrive);
		
		if (usbSocket.checkInfo()&&usbSocket.isStatus()&&hdd.checkMemory()) {
			hdd.copy(usbSocket.getFlashDrive().getInformation());
		}
	}
	
}
