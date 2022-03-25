package com.ams.newcountryrollout.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "country")
public class countryModel {
	@Id@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", updatable = false, nullable = false)
	private long id;
	@Column(name = "code")
	private String code; //(user/text)
	@Column(name = "description")
	private String description; //(user/text)
	@Column(name = "language")
	private String language; //(user/text)
	@Column(name = "farmer_language")
	private String farmer_language; //(user/text)
	@Column(name = "apac_code")
	private String apac_code; //(user/text or dropdown or search)
	@Column(name = "unit_of_measure")
	private String unit_of_measure; //(user/dropdown)
	@Column(name = "loc_optimization")
	private String loc_optimization; //(user/radio)
	@Column(name = "unified_app")
	private String unified_app; //(user/radio)
	@Column(name = "currency")
	private String currency; //(user/text or search or autopopulate)
	@Column(name = "country_code")
	private String country_code; //(user/text or search or autopopulate)
	@Column(name = "s3_location")
	private String s3_location; //(user/text)
	@Column(name = "apac_url")
	private String apac_url; //(user/text)
	@Column(name = "dynamic_commision")
	private String dynamic_commission; //(user/radio)
	@Column(name = "maintenance_flag")
	private boolean maintenance_flag;
	@Column(name = "dc_apac_url")
	private String dc_apac_url; //(user/text)
	@Column(name = "agro_url")
	private String agro_url; //(user/text)
	@Column(name = "agro_username")
	private String agro_username; //(user/text)
	@Column(name = "agro_password")
	private String agro_password; //(user/text)
	@Column(name = "sender_id")
	private String sender_id;
	@Column(name = "is_p360_applicable")
	private String is_p360_applicable;
	@Column(name = "zone_id")
	private String zone_id;
	@Column(name = "app_version")
	private String app_version;
	@Column(name = "apac_country_code")
	private String apac_country_code; //(user/text)
	@Column(name = "multilingual_enabled")
	private boolean multilingual_enabled;
	@Column(name = "is_legal_agreement_enabled")
	private String is_legal_agreement_enabled;
	
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
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getFarmer_language() {
		return farmer_language;
	}
	public void setFarmer_language(String farmer_language) {
		this.farmer_language = farmer_language;
	}
	public String getApac_code() {
		return apac_code;
	}
	public void setApac_code(String apac_code) {
		this.apac_code = apac_code;
	}
	public String getUnit_of_measure() {
		return unit_of_measure;
	}
	public void setUnit_of_measure(String unit_of_measure) {
		this.unit_of_measure = unit_of_measure;
	}
	public String getLoc_optimization() {
		return loc_optimization;
	}
	public void setLoc_optimization(String loc_optimization) {
		this.loc_optimization = loc_optimization;
	}
	public String getUnified_app() {
		return unified_app;
	}
	public void setUnified_app(String unified_app) {
		this.unified_app = unified_app;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getS3_location() {
		return s3_location;
	}
	public void setS3_location(String s3_location) {
		this.s3_location = s3_location;
	}
	public String getApac_url() {
		return apac_url;
	}
	public void setApac_url(String apac_url) {
		this.apac_url = apac_url;
	}
	public String getDynamic_commission() {
		return dynamic_commission;
	}
	public void setDynamic_commission(String dynamic_commission) {
		this.dynamic_commission = dynamic_commission;
	}
	public boolean isMaintenance_flag() {
		return maintenance_flag;
	}
	public void setMaintenance_flag(boolean maintenance_flag) {
		this.maintenance_flag = maintenance_flag;
	}
	public String getDc_apac_url() {
		return dc_apac_url;
	}
	public void setDc_apac_url(String dc_apac_url) {
		this.dc_apac_url = dc_apac_url;
	}
	public String getAgro_url() {
		return agro_url;
	}
	public void setAgro_url(String agro_url) {
		this.agro_url = agro_url;
	}
	public String getAgro_username() {
		return agro_username;
	}
	public void setAgro_username(String agro_username) {
		this.agro_username = agro_username;
	}
	public String getAgro_password() {
		return agro_password;
	}
	public void setAgro_password(String agro_password) {
		this.agro_password = agro_password;
	}
	public String getSender_id() {
		return sender_id;
	}
	public void setSender_id(String sender_id) {
		this.sender_id = sender_id;
	}
	public String getIs_p360_applicable() {
		return is_p360_applicable;
	}
	public void setIs_p360_applicable(String is_p360_applicable) {
		this.is_p360_applicable = is_p360_applicable;
	}
	public String getZone_id() {
		return zone_id;
	}
	public void setZone_id(String zone_id) {
		this.zone_id = zone_id;
	}
	public String getApp_version() {
		return app_version;
	}
	public void setApp_version(String app_version) {
		this.app_version = app_version;
	}
	public String getApac_country_code() {
		return apac_country_code;
	}
	public void setApac_country_code(String apac_country_code) {
		this.apac_country_code = apac_country_code;
	}
	public boolean isMultilingual_enabled() {
		return multilingual_enabled;
	}
	public void setMultilingual_enabled(boolean multilingual_enabled) {
		this.multilingual_enabled = multilingual_enabled;
	}
	public String getIs_legal_agreement_enabled() {
		return is_legal_agreement_enabled;
	}
	public void setIs_legal_agreement_enabled(String is_legal_agreement_enabled) {
		this.is_legal_agreement_enabled = is_legal_agreement_enabled;
	}
	public countryModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public countryModel(long id, String code, String description, String language, String farmer_language,
			String apac_code, String unit_of_measure, String loc_optimization, String unified_app, String currency,
			String country_code, String s3_location, String apac_url, String dynamic_commission,
			boolean maintenance_flag, String dc_apac_url, String agro_url, String agro_username, String agro_password,
			String sender_id, String is_p360_applicable, String zone_id, String app_version, String apac_country_code,
			boolean multilingual_enabled, String is_legal_agreement_enabled) {
		super();
		this.id = id;
		this.code = code;
		this.description = description;
		this.language = language;
		this.farmer_language = farmer_language;
		this.apac_code = apac_code;
		this.unit_of_measure = unit_of_measure;
		this.loc_optimization = loc_optimization;
		this.unified_app = unified_app;
		this.currency = currency;
		this.country_code = country_code;
		this.s3_location = s3_location;
		this.apac_url = apac_url;
		this.dynamic_commission = dynamic_commission;
		this.maintenance_flag = maintenance_flag;
		this.dc_apac_url = dc_apac_url;
		this.agro_url = agro_url;
		this.agro_username = agro_username;
		this.agro_password = agro_password;
		this.sender_id = sender_id;
		this.is_p360_applicable = is_p360_applicable;
		this.zone_id = zone_id;
		this.app_version = app_version;
		this.apac_country_code = apac_country_code;
		this.multilingual_enabled = multilingual_enabled;
		this.is_legal_agreement_enabled = is_legal_agreement_enabled;
	}
	@Override
	public String toString() {
		return "userServiceModel [id=" + id + ", code=" + code + ", description=" + description + ", language="
				+ language + ", farmer_language=" + farmer_language + ", apac_code=" + apac_code + ", unit_of_measure="
				+ unit_of_measure + ", loc_optimization=" + loc_optimization + ", unified_app=" + unified_app
				+ ", currency=" + currency + ", country_code=" + country_code + ", s3_location=" + s3_location
				+ ", apac_url=" + apac_url + ", dynamic_commission=" + dynamic_commission + ", maintenance_flag="
				+ maintenance_flag + ", dc_apac_url=" + dc_apac_url + ", agro_url=" + agro_url + ", agro_username="
				+ agro_username + ", agro_password=" + agro_password + ", sender_id=" + sender_id
				+ ", is_p360_applicable=" + is_p360_applicable + ", zone_id=" + zone_id + ", app_version=" + app_version
				+ ", apac_country_code=" + apac_country_code + ", multilingual_enabled=" + multilingual_enabled
				+ ", is_legal_agreement_enabled=" + is_legal_agreement_enabled + "]";
	}
	
	
	
}
