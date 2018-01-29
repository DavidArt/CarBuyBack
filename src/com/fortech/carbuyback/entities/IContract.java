package com.fortech.carbuyback.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import com.fortech.carbuyback.enums.ContractState;
import com.fortech.carbuyback.enums.Portfolio;

/**
 * The contract for a Contract entity
 *  
 * @author david.rus
 *
 */
public interface IContract extends AbstractBuyBackEntity{

	String getId();

	void setId(String id);

	String getCenterId();
	
	void setCenterId(String centerId);

	String getNumber();

	void setNumber(String number);

	ContractState getState();
	
	void setState(ContractState state);

	String getVehicleState();

	void setVehicleState(String vehicleState);

	Date getCurrentStartDate();

	void setCurrentStartDate(Date currentStartDate);

	Integer getContractDuration();

	void setContractDuration(Integer contractDuration);

	Portfolio getPortfolio();

	void setPortfolio(Portfolio portfolio);

	BigDecimal getContractRvg();

	void setContractRvg(BigDecimal contractRvg);

	BigDecimal getRateSubvention();

	void setRateSubvention(BigDecimal rateSubvention);

	Integer getMileagePerYear();

	void setMileagePerYear(Integer mileagePerYear);

	String getRvGuarantor();

	void setRvGuarantor(String rvGuarantor);

	String getCustomerInfo();

	void setCustomerInfo(String customerInfo);

	String getCreatedBy();

	void setCreatedBy(String createdBy);

	Timestamp getCreatedTimestamp();

	void setCreatedTimestamp(Timestamp createdTimestamp);

	String getModifiedBy();

	void setModifiedBy(String modifiedBy);

	Timestamp getModifiedTimestamp();
	
	void setModifiedTimestamp(Timestamp modifiedTimestamp);

	Integer getVersion();

	void setVersion(Integer version);
	
}
