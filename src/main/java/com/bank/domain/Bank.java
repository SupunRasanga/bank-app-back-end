package com.bank.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bankId;
	private String bankName;
	private String code;
	private String incorporateDate;
	private int noOfStaff;
	private int noOfBranches;
	private String status;
	
	
	public Bank() {
		super();
	}
	
	public Bank(long bankId, String bankName, String code, String incorporateDate, int noOfStaff, int noOfBranches,
			String status) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.code = code;
		this.incorporateDate = incorporateDate;
		this.noOfStaff = noOfStaff;
		this.noOfBranches = noOfBranches;
		this.status = status;
	}
	public long getBankId() {
		return bankId;
	}
	public void setBankId(long bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getIncorporateDate() {
		return incorporateDate;
	}
	public void setIncorporateDate(String incorporateDate) {
		this.incorporateDate = incorporateDate;
	}
	public int getNoOfStaff() {
		return noOfStaff;
	}
	public void setNoOfStaff(int noOfStaff) {
		this.noOfStaff = noOfStaff;
	}
	public int getNoOfBranches() {
		return noOfBranches;
	}
	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
