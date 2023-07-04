/**
 * 
 */
package com.bookworm.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author pranay
 *
 */
@Entity
@Table(name="ProductAttribute")
public class ProductAttribute {
	
	/**
	 * 
	 */
	public ProductAttribute() {
		// TODO Auto-generated constructor stub
	}
	

	private int productAttributeId;
	private int attributeValue;
	private AttributeMaster attributeMaster;
	private ProductMaster productMaster;
	



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getProductAttributeId() {
		return productAttributeId;
	}

	public void setProductAttributeId(int productAttributeId) {
		this.productAttributeId = productAttributeId;
	}


	public int getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(int attributeValue) {
		this.attributeValue = attributeValue;
	}

	@OneToOne(cascade=CascadeType.ALL)
	public AttributeMaster getAttributeMaster() {
		return attributeMaster;
	}

	public void setAttributeMaster(AttributeMaster attributeMaster) {
		this.attributeMaster = attributeMaster;
	}

	@OneToOne(cascade=CascadeType.ALL)
	public ProductMaster getProductMaster() {
		return productMaster;
	}

	public void setProductMaster(ProductMaster productMaster) {
		this.productMaster = productMaster;
	}
	
	

}
