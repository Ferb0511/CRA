package com.ams.newcountryrollout.service;

import java.io.IOException;
import java.util.List;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ams.newcountryrollout.helper.ExcelHelper;
import com.ams.newcountryrollout.model.codeCountryModel;
import com.ams.newcountryrollout.model.countryModel;
import com.ams.newcountryrollout.model.data;
import com.ams.newcountryrollout.model.locationMetadataModel;
import com.ams.newcountryrollout.repository.codeCountryModelRepository;
import com.ams.newcountryrollout.repository.codeModelRepository;
import com.ams.newcountryrollout.repository.countryModelRepository;
import com.ams.newcountryrollout.repository.locationMetadataModelRepository;

@Service
public class countryService {
	 @Autowired
	  countryModelRepository CMrepository;
	 @Autowired
	  codeCountryModelRepository CCMrepository;
	 @Autowired
	  locationMetadataModelRepository LMrepository;
	 @Autowired
	  codeModelRepository COMrepository;
	  long country_id;
	  data d = new data();
	  public void save(MultipartFile file) {
	    try {
//	      List<countryModel> CModel = ExcelHelper.excelToams_user(file.getInputStream());
//	      List<codeCountryModel> CCModel = null ;//ExcelHelper.excelToams_user(file.getInputStream());
//	      List<locationMetadataModel> LMModel = null;
	      d = ExcelHelper.excelToams_user(file.getInputStream());
	      System.out.println(d.codeCountry.get(0).getCode_id());
	      
	      //insert data in country
	      d.country.get(0).setId(CMrepository.selectCountry()+1);
	      country_id = d.country.get(0).getId();
//	      System.out.println(CModel.get(0).getId());
	      CMrepository.insertcountry(d.country.get(0).getId(), d.country.get(0).getCode(), d.country.get(0).getDescription(), d.country.get(0).getLanguage(), d.country.get(0).getFarmer_language(), d.country.get(0).getApac_code(), d.country.get(0).getUnit_of_measure(), d.country.get(0).getLoc_optimization(), d.country.get(0).getUnified_app(), d.country.get(0).getCurrency(), d.country.get(0).getCountry_code(), d.country.get(0).getS3_location(), d.country.get(0).getApac_url(), d.country.get(0).getDynamic_commission(), d.country.get(0).isMaintenance_flag(), d.country.get(0).getDc_apac_url(), d.country.get(0).getAgro_url(), d.country.get(0).getAgro_username(), d.country.get(0).getAgro_password(), d.country.get(0).getSender_id(), d.country.get(0).getZone_id(), d.country.get(0).getIs_p360_applicable(), d.country.get(0).getApp_version(), d.country.get(0).getApac_country_code(), d.country.get(0).isMultilingual_enabled(), d.country.get(0).getIs_legal_agreement_enabled());
	      
	      //Insert Data in code_country
	      int i = 0;
	      while(i < d.codeCountry.size()) {
	    	  d.codeCountry.get(i).setId(CCMrepository.selectCodeCountry()+1);
	    	  CCMrepository.insertCodeCountry(d.codeCountry.get(i).getId(), country_id, d.codeCountry.get(i).getCode_id().concat(String.valueOf(country_id)));
	    	  i++;
	      }
	      //insert data in code
	      i = 0;
	      while(i < d.code.size()) {
	    	  d.code.get(i).setId(COMrepository.selectCode()+1);
	    	  COMrepository.insertCode( d.code.get(i).getCode().concat(String.valueOf(country_id)), d.code.get(i).getDescription(), d.code.get(i).getValue(), d.code.get(i).getLanguage());
	    
	    	 i++;
	      }
	      
	      //insert data in location_metadata
	      i = 0;
	      while(i < d.locationMetadata.size()) {
	    	  d.locationMetadata.get(i).setId(LMrepository.selectLocationMetadata()+1);
	    	  d.locationMetadata.get(i).setLocation_hierarchy_level("LEVEL"+(i+1));
	    	  LMrepository.insertLocationMetadata(d.locationMetadata.get(i).getId(), country_id, d.locationMetadata.get(i).getLocation_hierarchy_level(), d.locationMetadata.get(i).getLocation_hierarchy_name(), d.locationMetadata.get(i).getCountry_name(), d.locationMetadata.get(i).getApac_hierarchy_name());
	    	  i++;
	      }
	      
	      System.out.println(d.code.size());
	  
	      
	    } catch (IOException e) {
	      throw new RuntimeException("fail to store excel data: " + e.getMessage());
	    }
	  }
//	  public List<countryModel> getAllData() {
//	    return CMrepository.findAll();
//	  }

}
