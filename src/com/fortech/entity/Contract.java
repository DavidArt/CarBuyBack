package com.fortech.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class Contract {
	
	@Id
	@GeneratedValue
	@Column(name = "CONT_ID")
	private String id;
	
	@NotNull(message = "Contract center id must be specified.")
	@Column(name = "CONT_CENTER_ID")
	private String centerId;
	
	@NotNull(message = "Contract number must be specified.")
	@Column(name = "CONT_NUMBER")
	private String number;
	
	@NotNull(message = "Contract state must be specified.")
	@Column(name = "CONT_STATE")
	private String state;
	
	@NotNull(message = "Contract vehicle state must be specified.")
	@Column(name = "CONT_VEHICLE_STATE")
	private String vehicleState;
	
	@NotNull(message = "Current start date must be specified.")
	@Column(name = "CONT_CURRENT_START_DATE")
	private Date currentStartDate;
	
	@NotNull(message = "Contract duration must be specified.")
	@Column(name = "CONT_CONTRACT_DURATION")
	private Integer contractDuration;
	
	@NotNull(message = "Contract portofolio must be specified.")
	@Column(name = "CONT_PORTOFOLIO")
	private String portofolio;
	
	@NotNull(message = "Contract PUG must be specified.")
	@Column(name = "CONT_CONTRACT_PUG")
	private BigDecimal contractPug;
	
	@NotNull(message = "Rate subvention must be specified.")
	@Column(name = "CONT_RATE_SUBVENTION")
	private BigDecimal rateSubvention;
	
	
	
	
	
	
	
	
	
}