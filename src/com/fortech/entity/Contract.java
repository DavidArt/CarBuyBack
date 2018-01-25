package com.fortech.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fortech.enums.ContractState;
import com.fortech.enums.Portfolio;


@Entity
@Table(name="CONTRACT")
public class Contract {
	
	@Column(name = "CONT_ID")
	private String id;

	@Column(name = "CONT_CENTER_ID")
	private String centerId;

	@Column(name = "CONT_NUMBER")
	private String number;

	@Column(name = "CONT_STATE")
	private ContractState state;

	@Column(name = "CONT_VEHICLE_STATE")
	private String vehicleState;

	@Column(name = "CONT_CURRENT_START_DATE")
	private Date currentStartDate;

	@Column(name = "CONT_CONTRACT_DURATION")
	private Integer contractDuration;
	
	@Column(name = "CONT_PORTFOLIO")
	private Portfolio portfolio;

	@Column(name = "CONT_CONTRACT_PUG")
	private BigDecimal contractPug;
	
	@Column(name = "CONT_RATE_SUBVENTION")
	private BigDecimal rateSubvention;
	
	@Column(name = "CONT_MILEAGE_PER_YEAR")
	private Integer mileagePerYear;

	@Column(name = "CONT_RU_GUARANTOR")
	private String ruGuarantor;
	
	@Column(name = "CONT_CUSTOMER_INFO")
	private String customerInfo;
	
	@Column(name = "CONT_CREATED_BY")
	private String createdBy;
	
	@Column(name = "CONT_CREATED_TIMESTAMP")
	private Timestamp createdTimestamp;
	
	@Column(name = "CONT_MODIFIED_BY")
	private String modifiedBy;
	
	@Column(name = "CONT_MODIFIED_TIMESTAMP")
	private Timestamp modifiedTimestamp;
	
	@Column(name = "CONT_VERSION")
	private Integer version;

	@Id
	@GeneratedValue
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@NotNull(message = "Contract center id must be specified.")
	public String getCenterId() {
		return centerId;
	}
	
	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}

	@NotNull(message = "Contract number must be specified.")
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@NotNull(message = "Contract state must be specified.")
	@Enumerated(EnumType.STRING)
	public ContractState getState() {
		return state;
	}

	
	public void setState(ContractState state) {
		this.state = state;
	}

	@NotNull(message = "Contract vehicle state must be specified.")
	public String getVehicleState() {
		return vehicleState;
	}

	public void setVehicleState(String vehicleState) {
		this.vehicleState = vehicleState;
	}

	@NotNull(message = "Current start date must be specified.")
	public Date getCurrentStartDate() {
		return currentStartDate;
	}

	public void setCurrentStartDate(Date currentStartDate) {
		this.currentStartDate = currentStartDate;
	}

	@NotNull(message = "Contract duration must be specified.")
	public Integer getContractDuration() {
		return contractDuration;
	}

	public void setContractDuration(Integer contractDuration) {
		this.contractDuration = contractDuration;
	}

	@NotNull(message = "Contract portofolio must be specified.")
	public Portfolio getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(Portfolio portfolio) {
		this.portfolio = portfolio;
	}

	@NotNull(message = "Contract PUG must be specified.")
	public BigDecimal getContractPug() {
		return contractPug;
	}

	public void setContractPug(BigDecimal contractPug) {
		this.contractPug = contractPug;
	}

	public BigDecimal getRateSubvention() {
		return rateSubvention;
	}

	public void setRateSubvention(BigDecimal rateSubvention) {
		this.rateSubvention = rateSubvention;
	}

	public Integer getMileagePerYear() {
		return mileagePerYear;
	}

	public void setMileagePerYear(Integer mileagePerYear) {
		this.mileagePerYear = mileagePerYear;
	}

	@NotNull(message = "Contract RU Guarantor must be specified.")
	public String getRuGuarantor() {
		return ruGuarantor;
	}

	public void setRuGuarantor(String ruGuarantor) {
		this.ruGuarantor = ruGuarantor;
	}

	public String getCustomerInfo() {
		return customerInfo;
	}

	public void setCustomerInfo(String customerInfo) {
		this.customerInfo = customerInfo;
	}

	@NotNull(message = "Contract created by must be specified")
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@NotNull(message = "Contract created timestamp by must be specified")
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

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	
}