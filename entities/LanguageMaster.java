package com.bookworm.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
public class LanguageMaster {
private int languageId;
private String languageDesc;
private List<ProductTypeMaster> typeMaster;

public LanguageMaster() {
}

public LanguageMaster(String languageDesc) {
this.languageDesc = languageDesc;
}

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public int getLanguageId() {
	return languageId;
}
public void setLanguageId(int languageId) {
	this.languageId = languageId;
}

public String getLanguageDesc() {
	
	return languageDesc;
}
public void setLanguageDesc(String languageDesc) {
	this.languageDesc = languageDesc;
}


private Set<GenereMaster> genereMasters;

@ManyToMany(mappedBy="languageMasters")
public Set<GenereMaster> getGenereMasters() {
	return genereMasters;
}

public void setGenereMasters(Set<GenereMaster> genereMasters) {
	this.genereMasters = genereMasters;
}

@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(name="Language_Type",
joinColumns = {		
		@JoinColumn(name = "langId", referencedColumnName="languageId")
},
inverseJoinColumns = {
		@JoinColumn(name="typeId", referencedColumnName="typeId")
})
public List<ProductTypeMaster> getTypeMaster() {
	return typeMaster;
}

public void setTypeMaster(List<ProductTypeMaster> typeMaster) {
	this.typeMaster = typeMaster;
}

}
