package com.bookworm.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class RoyaltyCalculation {

	public RoyaltyCalculation() {
		// TODO Auto-generated constructor stub
	}


	@OneToOne(cascade = CascadeType.ALL)
	public BeneficiaryMaster getBenId() {
		return benId;
	}



	public void setBenId(BeneficiaryMaster benId) {
		this.benId = benId;
	}



	public int getRoycalTranDate() {
		return roycalTranDate;
	}



	public void setRoycalTranDate(int roycalTranDate) {
		this.roycalTranDate = roycalTranDate;
	}


	@OneToOne(cascade = CascadeType.ALL)
	public ProductMaster getProductId() {
		return productId;
	}
	public void setProductId(ProductMaster productId) {
		this.productId = productId;
	}



	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public String getTranType() {
		return tranType;
	}
	public void setTranType(String tranType) {
		this.tranType = tranType;
	}



	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}



	public double getRoyaltyOnBasePrice() {
		return royaltyOnBasePrice;
	}
	public void setRoyaltyOnBasePrice(double royaltyOnBasePrice) {
		this.royaltyOnBasePrice = royaltyOnBasePrice;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="royalId")
	public int getRoycalId() {
		return roycalId;
	}
	public void setRoycalId(int roycalId) {
		this.roycalId = roycalId;
	}



	private int roycalId;
	private BeneficiaryMaster benId;
	private int roycalTranDate;
	private ProductMaster productId;
	private int quantity;
	private String tranType;
	private double basePrice;
	private double royaltyOnBasePrice;

}
