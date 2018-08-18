package com.gmail.vsyniakin.patterns.structural.proxy;

public class DemoProxy {
	public static void main(String[] args) {
		SumProxy sumProxy = new SumProxy();
		sumProxy.sum(15, 12);
	}
}
