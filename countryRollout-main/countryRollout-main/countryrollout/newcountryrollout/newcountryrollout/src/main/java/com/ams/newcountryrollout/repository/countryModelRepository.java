package com.ams.newcountryrollout.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ams.newcountryrollout.model.countryModel;

public interface countryModelRepository extends JpaRepository<countryModel, Long>{
	@Transactional
	@Modifying
	@Query(value = "insert into country(id, code, description, language, farmer_language, apac_code, unit_of_measure, "
			+ "loc_optimization, unified_app, currency, country_code, s3_location, apac_url, dynamic_commission,"
			+ " maintenance_flag, dc_apac_url, agro_url, agro_username, agro_password, apac_country_code, "
			+ "sender_id, zone_id, is_p360_applicable, app_version, multilingual_enabled, is_legal_agreement_enabled) "
			+ "VALUES (:id , :code, :description, :language, :farmer_language, :apac_code, :unit_of_measure, :loc_optimization, "
			+ ":unified_app, :currency, :country_code, :s3_location, :apac_url, :dynamic_commission, :maintenance_flag, "
			+ ":dc_apac_url, :agro_url, :agro_username, :agro_password, :apac_country_code, :sender_id, :zone_id, "
			+ ":is_p360_applicable, :app_version, :multilingual_enabled, :is_legal_agreement_enabled)", nativeQuery = true)// currancy, dynamic_commission, after app_version
	public void insertcountry(@Param("id") long id, @Param("code") String code,@Param("description") String description,@Param("language") String language,
			@Param("farmer_language") String farmer_language,@Param("apac_code") String apac_code,@Param("unit_of_measure") String unit_of_measure,
			@Param("loc_optimization") String loc_optimization,@Param("unified_app") String unified_app,@Param("currency") String currency,
			@Param("country_code") String country_code,@Param("s3_location") String s3_location,@Param("apac_url") String apac_url,
			@Param("dynamic_commission") String dynamic_commission,@Param("maintenance_flag") boolean maintenance_flag,@Param("dc_apac_url") String dc_apac_url,
			@Param("agro_url") String agro_url,@Param("agro_username") String agro_username,@Param("agro_password") String agro_password,
			@Param("sender_id") String sender_id,@Param("zone_id") String zone_id,@Param("is_p360_applicable") String is_p360_applicable,
			@Param("app_version") String app_version,@Param("apac_country_code") String apac_country_code,@Param("multilingual_enabled") boolean multilingual_enabled,
			@Param("is_legal_agreement_enabled") String is_legal_agreement_enabled);
	
	@Transactional
//	@Modifying
	@Query(value = "select count(id) from country", nativeQuery = true)//
	public int selectCountry();

}
