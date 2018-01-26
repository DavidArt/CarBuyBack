package com.fortech.carbuyback.entities;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fortech.carbuyback.enums.Branch;
import com.fortech.carbuyback.enums.Brand;


@Entity
@Table(name="VEHICLE")
public class Vehicle {
	
	@Column(name = "VEHI_ID")
	private String id;
	
	@Column(name = "VEHI_CONT_ID")
	private String contId;
	
	@Column(name = "VEHI_VIN")
	private String vin;
	
	@Column(name = "VEHI_BRANCH")
	private Branch branch;
	
	@Column(name = "VEHI_INTERNAL_VIN")
	private String internalVin;
	
	@Column(name = "VEHI_MODEL_YEAR")
	private String modelYear;
	
	@Column(name = "VEHI_BRAND")
	private Brand brand;
	
	@Column(name = "VEHI_VEHICLE_CLASS")
	private String VehicleClass;
	
	@Column(name = "VEHI_VEHICLE_TYPE_CLASS")
	private String vehicleTypeClass;
	
	@Column(name = "VEHI_MODEL")
	private String model;
	
	@Column(name = "VEHI_TRANSMISSION_TYPE")
	private String transmissionType;
	
	@Column(name = "VEHI_ENGINE_TYPE")
	private String engineType;
	
	@Column(name = "VEHI_COMMISSION_NUMBER")
	private String commissionNumber;
	
	@Column(name = "VEHI_REGISTRATION_DATE")
	private Date registrationDate;
	
	@Column(name = "VEHI_EMISSION_STANDARD")
	private String emissionStandard;
	
	@Column(name = "VEHI_CREATED_BY")
	private String createdBy;
	
	@Column(name = "VEHI_CREATED_TIMESTAMP")
	private Timestamp createdTimestamp;
	
	@Column(name = "VEHI_MODIFIED_BY")
	private String modifiedBy;
	
	@Column(name = "VEHI_MODIFIED_TIMESTAMP")
	private Timestamp modifiedTimestamp;

	@Id
	@GeneratedValue
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContId() {
		return contId;
	}

	public void setContId(String contId) {
		this.contId = contId;
	}

	@NotNull(message = "Vehicle VIN must be specified.")
	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	@NotNull(message = "Vehicle branch must be specified.")
	@Enumerated(EnumType.STRING)
	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public String getInternalVin() {
		return internalVin;
	}

	public void setInternalVin(String internalVin) {
		this.internalVin = internalVin;
	}

	public String getModelYear() {
		return modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	@NotNull(message = "Vehicle brand must be specified.")
	@Enumerated(EnumType.STRING)
	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	@NotNull(message = "Vehicle class must be specified.")
	public String getVehicleClass() {
		return VehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		VehicleClass = vehicleClass;
	}

	@NotNull(message = "Vehicle type class must be specified.")
	public String getVehicleTypeClass() {
		return vehicleTypeClass;
	}

	public void setVehicleTypeClass(String vehicleTypeClass) {
		this.vehicleTypeClass = vehicleTypeClass;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getTransmissionType() {
		return transmissionType;
	}

	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String getCommissionNumber() {
		return commissionNumber;
	}

	public void setCommissionNumber(String commissionNumber) {
		this.commissionNumber = commissionNumber;
	}

	@NotNull(message = "Vehicle registration date must be specified.")
	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getEmissionStandard() {
		return emissionStandard;
	}

	public void setEmissionStandard(String emissionStandard) {
		this.emissionStandard = emissionStandard;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Timestamp createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getModifiedTimestamp() {
		return modifiedTimestamp;
	}

	public void setModifiedTimestamp(Timestamp modifiedTimestamp) {
		this.modifiedTimestamp = modifiedTimestamp;
	}
	
	
}
