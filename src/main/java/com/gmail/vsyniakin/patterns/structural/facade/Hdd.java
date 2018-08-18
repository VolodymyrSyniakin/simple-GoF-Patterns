package com.gmail.vsyniakin.patterns.structural.facade;

public class Hdd {
	
	private String[] memory = new String[10];
	
	public void copy (String information) {
		if (checkMemory()) {
			for (int i = 0; i < memory.length; i++) {
				if (memory[i]==null) {
					memory[i] = information;
				}
			}
		}
		System.out.println("copying completed");
	}
	
	public boolean checkMemory () {
		for (int i = 0; i < memory.length; i++) {
			if (memory[i]==null) {
				return true;
			}
		}
		System.out.println("hdd is full");
		return false;
	}

	public String[] getMemory() {
		return memory;
	}

	public void setMemory(String[] memory) {
		this.memory = memory;
	}
	
	
}
