package com.ams.newcountryrollout.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "location_metadata")
public class locationMetadataModel {
	@Id//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")//, updatable = false, nullable = false)
	private long id;
	@Column(name = "country_id")
	private long country_id;
	@Column(name = "location_hierarchy_level")
	private String location_hierarchy_level;
	@Column(name = "location_hierarchy_name")
	private String location_hierarchy_name;
	@Column(name = "country_name")
	private String country_name;
	@Column(name = "apac_hierarchy_name")
	private String apac_hierarchy_name;
	public locationMetadataModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public locationMetadataModel(long id, long country_id, String location_hierarchy_level,
			String location_hierarchy_name, String country_name, String apac_hierarchy_name) {
		super();
		this.id = id;
		this.country_id = country_id;
		this.location_hierarchy_level = location_hierarchy_level;
		this.location_hierarchy_name = location_hierarchy_name;
		this.country_name = country_name;
		this.apac_hierarchy_name = apac_hierarchy_name;
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
	public String getLocation_hierarchy_level() {
		return location_hierarchy_level;
	}
	public void setLocation_hierarchy_level(String location_hierarchy_level) {
		this.location_hierarchy_level = location_hierarchy_level;
	}
	public String getLocation_hierarchy_name() {
		return location_hierarchy_name;
	}
	public void setLocation_hierarchy_name(String location_hierarchy_name) {
		this.location_hierarchy_name = location_hierarchy_name;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public String getApac_hierarchy_name() {
		return apac_hierarchy_name;
	}
	public void setApac_hierarchy_name(String apac_hierarchy_name) {
		this.apac_hierarchy_name = apac_hierarchy_name;
	}
	@Override
	public String toString() {
		return "locationMetadataModel [id=" + id + ", country_id=" + country_id + ", location_hierarchy_level="
				+ location_hierarchy_level + ", location_hierarchy_name=" + location_hierarchy_name + ", country_name="
				+ country_name + ", apac_hierarchy_name=" + apac_hierarchy_name + "]";
	}
	
	
}
