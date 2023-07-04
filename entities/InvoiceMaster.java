package com.bookworm.entities;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class InvoiceMaster {
	
	private int invoiceMasterId;
	private Date invoiceDate;
	private int invoiceAmount;
	private List<RoyaltyCalculation> royaltyCalculation;
	
	public InvoiceMaster() {
		
	}

	@Id
	@Column(name="InvoiceMasterId")
	public int getInvoiceMasterId() {
		return invoiceMasterId;
	}
	public void setInvoiceMasterId(int invoiceId) {
		this.invoiceMasterId = invoiceId;
	}
	
	@Column(name="InvoiceDate")
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	
	@Column(name = "InvoiceAmount")
	public int getInvoiceAmount() {
	return this.invoiceAmount;
	}
	public void setInvoiceAmount(int invoiceAmount) {
	this.invoiceAmount = invoiceAmount;
	}

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="invId", referencedColumnName="invoiceMasterId")
	public List<RoyaltyCalculation> getRoyaltyCalculation() {
		return royaltyCalculation;
	}

	public void setRoyaltyCalculation(List<RoyaltyCalculation> royaltyCalculation) {
		this.royaltyCalculation = royaltyCalculation;
	}
	
	
	
	
}
