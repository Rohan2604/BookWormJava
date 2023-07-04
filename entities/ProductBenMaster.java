package com.bookworm.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ProductBenMaster {

	private int prodBenId;
	private BeneficiaryMaster benficiaryMaster;
	private ProductMaster productMaster;
	private double prodBenPercentage;
	
	public ProductBenMaster() {
		// TODO Auto-generated constructor stub
	}

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getProdBenId() {
		return prodBenId;
	}
	
	public void setProdBenId(int prodBenId) {
		this.prodBenId = prodBenId;
	}
	
	@OneToOne(cascade=CascadeType.ALL)
	public BeneficiaryMaster getBenficiaryMaster() {
		return benficiaryMaster;
	}


	public void setBenficiaryMaster(BeneficiaryMaster benficiaryMaster) {
		this.benficiaryMaster = benficiaryMaster;
	}

	@OneToOne(cascade=CascadeType.ALL)
	public ProductMaster getProductMaster() {
		return productMaster;
	}


	public void setProductMaster(ProductMaster productMaster) {
		this.productMaster = productMaster;
	}


	public double getProdBenPercentage() {
		return prodBenPercentage;
	}

	public void setProdBenPercentage(double prodBenPercentage) {
		this.prodBenPercentage = prodBenPercentage;
	}




	

}
