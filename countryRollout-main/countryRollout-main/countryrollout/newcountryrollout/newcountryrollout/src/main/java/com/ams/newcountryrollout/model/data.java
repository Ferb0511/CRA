package com.ams.newcountryrollout.model;

import java.util.List;

public class data {
	public List<countryModel> country;
	public List<codeCountryModel> codeCountry;
	public List<locationMetadataModel> locationMetadata;
	public List<codeModel> code;
	
	public data() {
		super();
		// TODO Auto-generated constructor stub
	}

	public data(List<countryModel> country, List<codeCountryModel> codeCountry,
			List<locationMetadataModel> locationMetadata, List<codeModel> code) {
		super();
		this.country = country;
		this.codeCountry = codeCountry;
		this.locationMetadata = locationMetadata;
		this.code = code;
	}


	
	

}
