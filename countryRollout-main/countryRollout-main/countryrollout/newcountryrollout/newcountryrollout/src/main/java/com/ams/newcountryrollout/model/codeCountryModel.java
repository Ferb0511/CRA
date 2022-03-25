package com.ams.newcountryrollout.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "code_country")
public class codeCountryModel {
	@Id@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", updatable = false, nullable = false)
	private long id;
	@Column(name = "country_id")
	private long country_id;
	@Column(name = "code_id")
	private String code_id;
	public codeCountryModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public codeCountryModel(long id, long country_id, String code_id) {
		super();
		this.id = id;
		this.country_id = country_id;
		this.code_id = code_id;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCountry_id() {
		return country_id;
	}
	public void setCountry_id(long country_id) {
		this.country_id = country_id;
	}
	public String getCode_id() {
		return code_id;
	}
	public void setCode_id(String code_id) {
		this.code_id = code_id;
	}
	@Override
	public String toString() {
		return "codeCountryModel [id=" + id + ", country_id=" + country_id + ", code_id=" + code_id + "]";
	}
	

}
