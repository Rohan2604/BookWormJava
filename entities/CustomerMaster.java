package com.bookworm.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CustomerMaster")
public class CustomerMaster {
	/**
	 * 
	 */
	public CustomerMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String phoneNo;
	private List<InvoiceMaster> invoiceMaster;
	
	/**
	 * @return the customerid
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="customerId")
	public int getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerid the customerid to set
	 */
	public void setCustomerId(int customerid) {
		this.customerId = customerid;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="cid", referencedColumnName="customerId")
	public List<InvoiceMaster> getInvoiceMaster() {
		return invoiceMaster;
	}
	public void setInvoiceMaster(List<InvoiceMaster> invoiceMaster) {
		this.invoiceMaster = invoiceMaster;
	}
	
}
