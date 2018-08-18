package com.gmail.vsyniakin.patterns.creational.builder.simple;

public class DemoBuilder {

	public static void main(String[] args) {
		Contact user = new Contact.Builder()
									.name("Max")
									.lastName("Payne")
									.phone("000-000-00-00")
									.email("MaxPayne@payne.max")
									.gender(Contact.Gender.MALE)
									.build();
		
	}

}
