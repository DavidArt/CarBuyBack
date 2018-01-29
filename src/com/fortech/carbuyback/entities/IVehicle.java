package com.fortech.carbuyback.entities;

import java.sql.Date;
import java.sql.Timestamp;

import com.fortech.carbuyback.enums.Branch;
import com.fortech.carbuyback.enums.Brand;

/**
 * The contract for a Vehicle entity
 * 
 * @author david.rus
 *
 */
public interface IVehicle extends AbstractBuyBackEntity {

	String getId();

	void setId(String id);

	String getContId();

	void setContId(String contId);

	String getVin();

	void setVin(String vin);

	Branch getBranch();

	void setBranch(Branch branch);

	String getInternalVin();

	void setInternalVin(String internalVin);

	String getModelYear();

	void setModelYear(String modelYear);

	Brand getBrand();

	void setBrand(Brand brand);

	String getVehicleClass();

	void setVehicleClass(String vehicleClass);

	String getVehicleTypeClass();

	void setVehicleTypeClass(String vehicleTypeClass);

	String getModel();

	void setModel(String model);
	
	String getTransmissionType();

	void setTransmissionType(String transmissionType);

	String getEngineType();

	void setEngineType(String engineType);

	String getCommissionNumber();

	void setCommissionNumber(String commissionNumber);

	Date getRegistrationDate();

	void setRegistrationDate(Date registrationDate);

	String getEmissionStandard();

	void setEmissionStandard(String emissionStandard);

	String getCreatedBy();

	void setCreatedBy(String createdBy);

	Timestamp getCreatedTimestamp();

	void setCreatedTimestamp(Timestamp createdTimestamp);

	String getModifiedBy();

	void setModifiedBy(String modifiedBy);

	Timestamp getModifiedTimestamp();

	void setModifiedTimestamp(Timestamp modifiedTimestamp);
	
}
