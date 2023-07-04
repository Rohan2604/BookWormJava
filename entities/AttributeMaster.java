package com.bookworm.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="AttributeMaster")
public class AttributeMaster {
	/**
	 * 
	 */
	public AttributeMaster() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	private int attributeID;
	private String attributeDescription;

	
	/**
	 * @return the attributeID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getAttributeID() {
		return attributeID;
	}
	/**
	 * @param attributeID the attributeID to set
	 */
	public void setAttributeID(int attributeID) {
		this.attributeID = attributeID;
	}
	/**
	 * @return the attributeDescription
	 */
	public String getAttributeDescription() {
		return attributeDescription;
	}
	/**
	 * @param attributeDescription the attributeDescription to set
	 */
	public void setAttributeDescription(String attributeDescription) {
		this.attributeDescription = attributeDescription;
	}
	
	

	
}
