package com.fortech.carbuyback.enums;

public enum Branch {
	
	CAR("0"),
	TRUCK("1"),
	BUS("2");
	
	private final String branch;
	
	Branch(String branch) {
		this.branch = branch;
	}
	
	public String getBranch() {
		return branch;
	}
}
