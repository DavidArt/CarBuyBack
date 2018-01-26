package com.fortech.carbuyback.enums;

public enum Portfolio {
	
	FINANCE_LEASE ("1"),	
	OPERATE_LEASE ("2"),	
	DIRECT_BUYBACK ("3");

	private final String portfolio;

	private Portfolio(String portfolio) {
		this.portfolio = portfolio;
	}

	public String getPortfolio() {
		return portfolio;
	}
	
}
