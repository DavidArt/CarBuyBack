package com.fortech.carbuyback.entities;
 
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
 
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fortech.carbuyback.enums.ContractState;
import com.fortech.carbuyback.enums.Portfolio;
 
 /**
  * A contract entity used to represent a table in the database
  * 
  * @author david.rus
  *
  */
@Entity
@Table(name="CONTRACT")
public class Contract implements IContract {
   
   
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
 
    @Column(name = "CONT_CONTRACT_RVG")
    private BigDecimal contractRvg;
   
    @Column(name = "CONT_RATE_SUBVENTION")
    private BigDecimal rateSubvention;
   
    @Column(name = "CONT_MILEAGE_PER_YEAR")
    private Integer mileagePerYear;
 
    @Column(name = "CONT_RV_GUARANTOR")
    private String rvGuarantor;
   
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Size(min=36, max=36)
    public String getId() {
        return id;
    }
 
    @Override
    public void setId(String id) {
        this.id = id;
    }
 
    @Override
    @NotNull(message = "Contract center id must be specified.")
    @Size(min=3, max=3)
    public String getCenterId() {
        return centerId;
    }
   
    @Override
    public void setCenterId(String centerId) {
        this.centerId = centerId;
    }
 
    @Override
    @NotNull(message = "Contract number must be specified.")
    @Size(min=12, max=12)
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
    @Size(min=3, max=3)
    public ContractState getState() {
        return state;
    }
 
    @Override
    public void setState(ContractState state) {
        this.state = state;
    }
 
    @Override
    @NotNull(message = "Contract vehicle state must be specified.")
    @Size(min=1, max=1)
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
    @Size(min=1, max=1)
    public Portfolio getPortfolio() {
        return portfolio;
    }
 
    @Override
    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
 
    @Override
    @NotNull(message = "Contract PUG must be specified.")
    @DecimalMin("0.01")
    public BigDecimal getContractRvg() {
        return contractRvg;
    }
 
    @Override
    public void setContractRvg(BigDecimal contractRvg) {
        this.contractRvg = contractRvg;
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
    @Min(0)
    public Integer getMileagePerYear() {
        return mileagePerYear;
    }
 
    @Override
    public void setMileagePerYear(Integer mileagePerYear) {
        this.mileagePerYear = mileagePerYear;
    }
 
    @Override
    @NotNull(message = "Contract RV Guarantor must be specified.")
    @Size(min=4, max=4)
    @Pattern(regexp = "{A-Za-z}*")
    public String getRvGuarantor() {
        return rvGuarantor;
    }
 
    @Override
    public void setRvGuarantor(String rvGuarantor) {
        this.rvGuarantor = rvGuarantor;
    }
 
    @Override
    @Size(max=20)
    public String getCustomerInfo() {
        return customerInfo;
    }
 
    @Override
    public void setCustomerInfo(String customerInfo) {
        this.customerInfo = customerInfo;
    }
 
    @Override
    @NotNull(message = "Contract created by must be specified")
    @Size(max=20)
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
    @Size(max=20)
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
 
    @Override
    public String toString() {
        return "ContractImpl [id=" + id + ", centerId=" + centerId + ", number=" + number + ", state=" + state
                + ", vehicleState=" + vehicleState + ", currentStartDate=" + currentStartDate + ", contractDuration="
                + contractDuration + ", portfolio=" + portfolio + ", contractPug=" + contractRvg + ", rateSubvention="
                + rateSubvention + ", mileagePerYear=" + mileagePerYear + ", ruGuarantor=" + rvGuarantor
                + ", customerInfo=" + customerInfo + ", createdBy=" + createdBy + ", createdTimestamp="
                + createdTimestamp + ", modifiedBy=" + modifiedBy + ", modifiedTimestamp=" + modifiedTimestamp
                + ", version=" + version + "]";
    }
   
   
}