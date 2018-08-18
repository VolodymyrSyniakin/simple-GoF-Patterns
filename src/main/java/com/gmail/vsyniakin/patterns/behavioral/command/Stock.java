package com.gmail.vsyniakin.patterns.behavioral.command;

public class Stock {
	
	private String product;
	private int count;
	
	public Stock(String product, int count) {
		super();
		this.product = product;
		this.count = count;
	}
	
	public void buy(int count) {
		this.count += count;
		System.out.println("buy of " + this.product + ": " + count);
	}
	public void sell(int count) {
		this.count -= count;
		System.out.println("sell of " + this.product + ": " + count);
	}
	public void getCount() {
		System.out.println("balance of " + this.product + ": " + this.count);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stock other = (Stock) obj;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		return true;
	}
	
}
