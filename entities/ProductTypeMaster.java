package com.bookworm.entities;

import java.util.List;

import javax.persistence.*;

@Entity
public class ProductTypeMaster {
	private int typeId;
	private String typeDesc;
	private List<LanguageMaster> languageMaster;
	public ProductTypeMaster() {
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getTypeDesc() {
		return typeDesc;
	}
	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}
	
	@ManyToMany(mappedBy="typeMaster")
	public List<LanguageMaster> getLanguageMaster() {
		return languageMaster;
	}
	public void setLanguageMaster(List<LanguageMaster> languageMaster) {
		this.languageMaster = languageMaster;
	}   
	
}
