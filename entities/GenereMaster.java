package com.bookworm.entities;

import java.util.Set;

import javax.persistence.*;

@Entity
public class GenereMaster {
private int genereId;
private String genereDesc;
private Set<LanguageMaster> languageMasters;
public GenereMaster() {
}
public GenereMaster(String genereDesc) {
this.genereDesc = genereDesc;
}
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public int getGenereId() {
	return genereId;
}
public void setGenereId(int genereId) {
	this.genereId = genereId;
}
public String getGenereDesc() {
	return genereDesc;
}
public void setGenereDesc(String genereDesc) {
	this.genereDesc = genereDesc;
}


@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(name="Genere_Language",
joinColumns={
		@JoinColumn(name="genId",referencedColumnName="genereId")
},
inverseJoinColumns={
		@JoinColumn(name="langId",referencedColumnName="languageId")
})
public Set<LanguageMaster> getLanguageMasters() {
	return languageMasters;
}
public void setLanguageMasters(Set<LanguageMaster> languageMasters) {
	this.languageMasters = languageMasters;
}

}

