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
public class VehicleImpl implements Vehicle{
	
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

	@Override
	@Id
	@GeneratedValue
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getContId() {
		return contId;
	}

	@Override
	public void setContId(String contId) {
		this.contId = contId;
	}

	@Override
	@NotNull(message = "Vehicle VIN must be specified.")
	public String getVin() {
		return vin;
	}

	@Override
	public void setVin(String vin) {
		this.vin = vin;
	}

	@Override
	@NotNull(message = "Vehicle branch must be specified.")
	@Enumerated(EnumType.STRING)
	public Branch getBranch() {
		return branch;
	}

	@Override
	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@Override
	public String getInternalVin() {
		return internalVin;
	}

	@Override
	public void setInternalVin(String internalVin) {
		this.internalVin = internalVin;
	}

	@Override
	public String getModelYear() {
		return modelYear;
	}

	@Override
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	@Override
	@NotNull(message = "Vehicle brand must be specified.")
	@Enumerated(EnumType.STRING)
	public Brand getBrand() {
		return brand;
	}

	@Override
	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	@Override
	@NotNull(message = "Vehicle class must be specified.")
	public String getVehicleClass() {
		return VehicleClass;
	}

	@Override
	public void setVehicleClass(String vehicleClass) {
		VehicleClass = vehicleClass;
	}

	@Override
	@NotNull(message = "Vehicle type class must be specified.")
	public String getVehicleTypeClass() {
		return vehicleTypeClass;
	}

	@Override
	public void setVehicleTypeClass(String vehicleTypeClass) {
		this.vehicleTypeClass = vehicleTypeClass;
	}

	@Override
	public String getModel() {
		return model;
	}

	@Override
	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String getTransmissionType() {
		return transmissionType;
	}

	@Override
	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}

	@Override
	public String getEngineType() {
		return engineType;
	}

	@Override
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	@Override
	public String getCommissionNumber() {
		return commissionNumber;
	}

	@Override
	public void setCommissionNumber(String commissionNumber) {
		this.commissionNumber = commissionNumber;
	}

	@Override
	@NotNull(message = "Vehicle registration date must be specified.")
	public Date getRegistrationDate() {
		return registrationDate;
	}

	@Override
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	@Override
	public String getEmissionStandard() {
		return emissionStandard;
	}

	@Override
	public void setEmissionStandard(String emissionStandard) {
		this.emissionStandard = emissionStandard;
	}

	@Override
	public String getCreatedBy() {
		return createdBy;
	}

	@Override
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public Timestamp getCreatedTimestamp() {
		return createdTimestamp;
	}

	@Override
	public void setCreatedTimestamp(Timestamp createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	@Override
	public String getModifiedBy() {
		return modifiedBy;
	}

	@Override
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Override
	public Timestamp getModifiedTimestamp() {
		return modifiedTimestamp;
	}

	@Override
	public void setModifiedTimestamp(Timestamp modifiedTimestamp) {
		this.modifiedTimestamp = modifiedTimestamp;
	}
	
	
}