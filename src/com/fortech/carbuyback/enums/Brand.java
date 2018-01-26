package com.fortech.carbuyback.enums;

public enum Brand {

	MERCEDES ("095"),
	SMART ("126");
	
	private final String brand;
	
	Brand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
}
