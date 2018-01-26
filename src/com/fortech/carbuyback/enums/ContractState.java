package com.fortech.carbuyback.enums;

public enum ContractState {

	IN_PREPARATION ("BIP"),
	ACTIVE ("BAC"),
	RESOLD ("BRS"),
	CANCELED ("BCA");
	
	private final String contractState;
	
	ContractState(String contractState) {
		this.contractState = contractState;
	}
	
	public String getContractState() {
		return contractState;
	}
	
}
