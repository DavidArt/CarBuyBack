package com.fortech.enums;

public enum ContractState {

	IN_PREPARATION {
	      public String toString() {
	          return "BIP";
	      }
	},
	
	active {
	      public String toString() {
	          return "BAC";
	      }
	},
	
	RESOLD {
	      public String toString() {
	          return "BRS";
	      }
	},
	
	CANCELED {
	      public String toString() {
	          return "BCA";
	      }
	}	
	
}
