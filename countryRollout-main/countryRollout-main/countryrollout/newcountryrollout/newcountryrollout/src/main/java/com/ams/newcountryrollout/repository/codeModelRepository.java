package com.ams.newcountryrollout.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ams.newcountryrollout.model.codeModel;


public interface codeModelRepository extends JpaRepository<codeModel, Long> {
	@Transactional
	@Modifying
	@Query(value = "insert into code( code, description, value, language)"
			+ "VALUES(:code, :description, :value, :language)", nativeQuery = true)//id, country_id, location_hierarchy_level, location_hierarchy_name, country_name, apac_hierarchy_name
	public void insertCode(@Param("code") String code, @Param("description") String description, @Param("value") String value, @Param("language") String language);
	@Transactional
//	@Modifying
	@Query(value = "select count(id) from code", nativeQuery = true)//
	public int selectCode();
}



