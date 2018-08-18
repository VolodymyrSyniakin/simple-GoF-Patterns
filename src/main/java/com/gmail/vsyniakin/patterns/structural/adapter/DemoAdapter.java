package com.gmail.vsyniakin.patterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class DemoAdapter {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		
		WriteList writer = new AdapterWriteList(new Console());
		
		writer.print(list);
	}
	
	
}
