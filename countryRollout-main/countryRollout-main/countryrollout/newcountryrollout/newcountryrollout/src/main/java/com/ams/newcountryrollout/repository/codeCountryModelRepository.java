package com.ams.newcountryrollout.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ams.newcountryrollout.model.codeCountryModel;

public interface codeCountryModelRepository extends JpaRepository<codeCountryModel, Long> {
	@Transactional
	@Modifying
	@Query(value = "insert into code_country(id, country_id, code_id)"
			+ "VALUES(:id, :country_id, :code_id)", nativeQuery = true)//id, country_id, code_id
	public void insertCodeCountry(@Param("id") long id, @Param("country_id") long country_id, @Param("code_id") String code_id);
	@Transactional
//	@Modifying
	@Query(value = "select count(id) from code_country", nativeQuery = true)//
	public int selectCodeCountry();
	
	

}
