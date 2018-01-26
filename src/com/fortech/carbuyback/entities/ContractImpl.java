package com.fortech.carbuyback.entities;

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

import com.fortech.carbuyback.enums.ContractState;
import com.fortech.carbuyback.enums.Portfolio;


@Entity
@Table(name="CONTRACT")
public class ContractImpl implements Contract {
	
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

	@NotNull(message = "Contract center id must be specified.")
	@Override
	public String getCenterId() {
		return centerId;
	}
	
	@Override
	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}

	@Override
	@NotNull(message = "Contract number must be specified.")
	public String getNumber() {
		return number;
	}

	@Override
	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	@NotNull(message = "Contract state must be specified.")
	@Enumerated(EnumType.STRING)
	public ContractState getState() {
		return state;
	}

	@Override
	public void setState(ContractState state) {
		this.state = state;
	}

	@Override
	@NotNull(message = "Contract vehicle state must be specified.")
	public String getVehicleState() {
		return vehicleState;
	}

	@Override
	public void setVehicleState(String vehicleState) {
		this.vehicleState = vehicleState;
	}

	@Override
	@NotNull(message = "Current start date must be specified.")
	public Date getCurrentStartDate() {
		return currentStartDate;
	}

	@Override
	public void setCurrentStartDate(Date currentStartDate) {
		this.currentStartDate = currentStartDate;
	}

	@Override
	@NotNull(message = "Contract duration must be specified.")
	public Integer getContractDuration() {
		return contractDuration;
	}

	@Override
	public void setContractDuration(Integer contractDuration) {
		this.contractDuration = contractDuration;
	}

	@Override
	@NotNull(message = "Contract portofolio must be specified.")
	public Portfolio getPortfolio() {
		return portfolio;
	}

	@Override
	public void setPortfolio(Portfolio portfolio) {
		this.portfolio = portfolio;
	}

	@Override
	@NotNull(message = "Contract PUG must be specified.")
	public BigDecimal getContractPug() {
		return contractPug;
	}

	@Override
	public void setContractPug(BigDecimal contractPug) {
		this.contractPug = contractPug;
	}

	@Override
	public BigDecimal getRateSubvention() {
		return rateSubvention;
	}

	@Override
	public void setRateSubvention(BigDecimal rateSubvention) {
		this.rateSubvention = rateSubvention;
	}

	@Override
	public Integer getMileagePerYear() {
		return mileagePerYear;
	}

	@Override
	public void setMileagePerYear(Integer mileagePerYear) {
		this.mileagePerYear = mileagePerYear;
	}

	@Override
	@NotNull(message = "Contract RU Guarantor must be specified.")
	public String getRuGuarantor() {
		return ruGuarantor;
	}

	@Override
	public void setRuGuarantor(String ruGuarantor) {
		this.ruGuarantor = ruGuarantor;
	}

	@Override
	public String getCustomerInfo() {
		return customerInfo;
	}

	@Override
	public void setCustomerInfo(String customerInfo) {
		this.customerInfo = customerInfo;
	}

	@Override
	@NotNull(message = "Contract created by must be specified")
	public String getCreatedBy() {
		return createdBy;
	}

	@Override
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	@NotNull(message = "Contract created timestamp by must be specified")
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

	@Override
	public Integer getVersion() {
		return version;
	}

	@Override
	public void setVersion(Integer version) {
		this.version = version;
	}
	
	
}