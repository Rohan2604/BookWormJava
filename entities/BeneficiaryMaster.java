package com.bookworm.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BeneficiaryMaster {

	private int beneficiaryId;
	private String beneficiaryName;
	private String beneficiaryEmailId;
	private long beneficiaryContactNo;
	private String beneficiaryBankName;
	private String beneficiaryBankBranch;
	private String beneficiaryIFSC;
	private long beneficiaryAccountNo;
	private String beneficiaryAccountType;
	private String beneficiaryPAN;

	public BeneficiaryMaster() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getBeneficiaryId() {
		return beneficiaryId;
	}


	public void setBeneficiaryId(int beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}


	public String getBeneficiaryName() {
		return beneficiaryName;
	}


	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}


	public String getBeneficiaryEmailId() {
		return beneficiaryEmailId;
	}


	public void setBeneficiaryEmailId(String beneficiaryEmailId) {
		this.beneficiaryEmailId = beneficiaryEmailId;
	}


	public long getBeneficiaryContactNo() {
		return beneficiaryContactNo;
	}


	public void setBeneficiaryContactNo(long beneficiaryContactNo) {
		this.beneficiaryContactNo = beneficiaryContactNo;
	}


	public String getBeneficiaryBankName() {
		return beneficiaryBankName;
	}


	public void setBeneficiaryBankName(String beneficiaryBankName) {
		this.beneficiaryBankName = beneficiaryBankName;
	}


	public String getBeneficiaryBankBranch() {
		return beneficiaryBankBranch;
	}


	public void setBeneficiaryBankBranch(String beneficiaryBankBranch) {
		this.beneficiaryBankBranch = beneficiaryBankBranch;
	}


	public String getBeneficiaryIFSC() {
		return beneficiaryIFSC;
	}


	public void setBeneficiaryIFSC(String beneficiaryIFSC) {
		this.beneficiaryIFSC = beneficiaryIFSC;
	}


	public String getBeneficiaryAccountType() {
		return beneficiaryAccountType;
	}


	public void setBeneficiaryAccountType(String beneficiaryAccountType) {
		this.beneficiaryAccountType = beneficiaryAccountType;
	}


	public String getBeneficiaryPAN() {
		return beneficiaryPAN;
	}


	public void setBeneficiaryPAN(String beneficiaryPAN) {
		this.beneficiaryPAN = beneficiaryPAN;
	}


	public long getBeneficiaryAccountNo() {
		return beneficiaryAccountNo;
	}
	
	public void setBeneficiaryAccountNo(long beneficiaryAccountNo) {
		this.beneficiaryAccountNo = beneficiaryAccountNo;
	}

	
	
}
