package com.gmail.vsyniakin.patterns.structural.proxy;

public class SumProxy implements SumInterface {
	
	private Sum sum;

	public int sum(int a, int b) {
		if (sum == null) {
			sum = new Sum();
		}
		return sum.sum(a, b);
	}
	
	
	
}
