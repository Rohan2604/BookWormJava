package com.bookworm.entities;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class MyShelf {

	private int shelfId;
	private CustomerMaster customerMaster;
	private String transactionType;
	private Date expiryDate;
	private boolean isActive;
	private List<ProductMaster> productMaster;

	public MyShelf() {
		// TODO Auto-generated constructor stub
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}


	public Date getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}


	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getShelfId() {
		return shelfId;
	}

	public void setShelfId(int shelfId) {
		this.shelfId = shelfId;
	}

	@OneToOne(cascade=CascadeType.ALL)
	public CustomerMaster getCustomerMaster() {
		return customerMaster;
	}

	public void setCustomerMaster(CustomerMaster customerMaster) {
		this.customerMaster = customerMaster;
	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Product_MyShelf",
	joinColumns = {		
			@JoinColumn(name = "shelfId", referencedColumnName="shelfId")
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
