package com.bookworm.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class InvoiceDetails {
	private int invoiceDetailId;
	private InvoiceMaster invoiceMaster;
	private int quantity;
	private double basePrice;
	private String transactionType;
	private int rentNoOfDays;
	private List<ProductMaster> productMaster;
	
	public InvoiceDetails()
	{
		super();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getInvoiceDetailId()
	{
		return invoiceDetailId;
	}
	public void setInvoiceDetailId(int invoiceDetailId)
	{
		this.invoiceDetailId=invoiceDetailId;
	}
	
	@OneToOne(cascade=CascadeType.ALL)
	public InvoiceMaster getInvoiceMaster()
	{
		return invoiceMaster;
	}
	public void setInvoiceMaster(InvoiceMaster invoiceMaster)
	{
		this.invoiceMaster=invoiceMaster;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public int getRentNoOfDays() {
		return rentNoOfDays;
	}

	public void setRentNoOfDays(int rentNoOfDays) {
		this.rentNoOfDays = rentNoOfDays;
	}


	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Product_InvoiceDetails",
	joinColumns = {		
			@JoinColumn(name = "invDetId", referencedColumnName="invoiceDetailId")
	},
	inverseJoinColumns = {
			@JoinColumn(name="prodId", referencedColumnName="productMasterId")
	})
	public List<ProductMaster> getProductMaster() {
		return productMaster;
	}

	public void setProductMaster(List<ProductMaster> productMaster) {
		this.productMaster = productMaster;
	}
	
	
	
}
