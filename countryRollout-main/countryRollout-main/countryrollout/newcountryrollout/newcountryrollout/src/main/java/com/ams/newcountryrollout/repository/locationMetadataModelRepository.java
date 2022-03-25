package com.ams.newcountryrollout.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ams.newcountryrollout.model.locationMetadataModel;

public interface locationMetadataModelRepository extends JpaRepository<locationMetadataModel, Long> {
	@Transactional
	@Modifying
	@Query(value = "insert into location_metadata(id, country_id, location_hierarchy_level, location_hierarchy_name, country_name, apac_hierarchy_name)"
			+ "VALUES(:id, :country_id, :location_hierarchy_level, :location_hierarchy_name, :country_name, :apac_hierarchy_name)", nativeQuery = true)//id, country_id, location_hierarchy_level, location_hierarchy_name, country_name, apac_hierarchy_name
	public void insertLocationMetadata(@Param("id") long id, @Param("country_id") long country_id, @Param("location_hierarchy_level") String location_hierarchy_level, @Param("location_hierarchy_name") String location_hierarchy_name, @Param("country_name") String country_name, @Param("apac_hierarchy_name") String apac_hierarchy_name);
	@Transactional
//	@Modifying
	@Query(value = "select count(id) from location_metadata", nativeQuery = true)//
	public int selectLocationMetadata();
}
