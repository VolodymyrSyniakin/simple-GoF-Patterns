package com.gmail.vsyniakin.patterns.creational.builder.simple;

public class Contact {
	private final String name;
	private final String lastName;
	private final String phone;
	private final String email;
	private final Gender gender;
	
	private Contact(Builder builder) {
		this.name = builder.name;
		this.lastName = builder.lastName;
		this.phone = builder.phone;
		this.email = builder.email;
		this.gender = builder.gender;
	}
	
	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public Gender getGender() {
		return gender;
	}

	public static class Builder {
		private String name;
		private String lastName;
		private String phone;
		private String email;
		private Gender gender = Gender.NONE;
		
		public Builder() {
			super();
		}
		
		public Builder name (String name) {
			this.name = name;
			return this;
		}
		public Builder lastName (String lastName) {
			this.lastName = lastName;
			return this;
		}
		public Builder phone (String phone) {
			this.phone = phone;
			return this;
		}
		public Builder email (String email) {
			this.email = lastName;
			return this;
		}
		public Builder gender (Gender gender) {
			this.gender = gender;
			return this;
		}
		public Contact build () {
			return new Contact(this); 
		}
	}
	
	public enum Gender {
		MALE, FEMAIL, NONE
	}
}
