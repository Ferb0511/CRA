package com.ams.newcountryrollout.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "code")
public class codeModel {
	@Id@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", updatable = false, nullable = false)
	private long id;
	@Column(name = "code")
	private String code;
	@Column(name = "description")
	private String description;
	@Column(name = "value")
	private String value;
	@Column(name = "language")
	private String language;
	
	public codeModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public codeModel(long id,String code, String description, String value, String language) {
		super();
		this.id = id;
		this.code = code;
		this.description = description;
		this.value = value;
		this.language = language;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "code [id=" + id + ", code=" + code + ", description=" + description + ", value=" + value + ", language="
				+ language + ", getId()=" + getId() + ", getCode()=" + getCode() + ", getDescription()="
				+ getDescription() + ", getValue()=" + getValue() + ", getLanguage()=" + getLanguage() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
