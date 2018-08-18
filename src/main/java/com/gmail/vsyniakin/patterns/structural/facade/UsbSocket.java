package com.gmail.vsyniakin.patterns.structural.facade;

public class UsbSocket {
	
	private FlashDrive flashDrive;
	
	private boolean status = false;
	
	public void insert (FlashDrive flashDrive) {
		if (flashDrive != null) {
			this.status = true;
			this.flashDrive = flashDrive;
		} else {
			this.status = false;
		}
	}
	
	public void remove () {
		this.flashDrive = null;
		this.status = false;
	}
	
	public boolean checkInfo () {
		if (flashDrive.getInformation().isEmpty()) {
			System.out.println("flash drive is empty");
			return false;
		}
		return true;
	}

	public FlashDrive getFlashDrive() {
		return flashDrive;
	}

	public void setFlashDrive(FlashDrive flashDrive) {
		this.flashDrive = flashDrive;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
}
