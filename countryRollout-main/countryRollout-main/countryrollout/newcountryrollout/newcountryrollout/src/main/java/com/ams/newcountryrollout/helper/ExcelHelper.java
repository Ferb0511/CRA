package com.ams.newcountryrollout.helper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.springframework.web.multipart.MultipartFile;

import com.ams.newcountryrollout.model.codeCountryModel;
import com.ams.newcountryrollout.model.codeModel;
import com.ams.newcountryrollout.model.countryModel;
import com.ams.newcountryrollout.model.data;
import com.ams.newcountryrollout.model.locationMetadataModel;


public class ExcelHelper {
	public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
	  static String[] HEADERs = { "code", "description", "language", "farmer_language", "apac_code", "unit_of_measure", "loc_optimization", "unified_app", "currency", "country_code", "s3_location", "apac_url", "dynamic_commission", "maintenance_flag", "dc_apac_url", "agro_url", "agro_username", "agro_password", "sender_id", "is_p360_applicable", "zone_id", "app_version", "apac_country_code", "multilingual_enabled", "is_legal_agreement_enabled" };
	  static String SHEET = "Country";
	  public static boolean hasExcelFormat(MultipartFile file) {
	    if (!TYPE.equals(file.getContentType())) {
	      return false;
	    }
	    return true;
	  }
	  public static void abc(InputStream is) {
		  Workbook workbook;
			try {
				workbook = new XSSFWorkbook(is);
				Iterator<Sheet> sheetIterator = workbook.sheetIterator();System.out.println("Retrieving Sheets using Iterator");while (sheetIterator.hasNext()) {Sheet sheet = sheetIterator.next();System.out.println("=> " + sheet.getSheetName());}  
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  }
	  public static data excelToams_user(InputStream is) {
		  data d = new data();
		  List<countryModel> CModels = new ArrayList<countryModel>();
		  List<codeCountryModel> CCModels = new ArrayList<codeCountryModel>();
		  List<locationMetadataModel> LMModels = new ArrayList<locationMetadataModel>();
		  List<codeModel> COModels = new ArrayList<codeModel>(); 
		  
		  
		  int sheetcounter = 0;
		  
		  try {
		      Workbook workbook = new XSSFWorkbook(is);
//		      Sheet sheet = workbook.getSheet(SHEET);
//		      Workbook workbook = WorkbookFactory.create(is);
		      Iterator<Sheet> sheetIterator = workbook.sheetIterator();
		      while(sheetcounter<4) { //sheetIterator.hasNext()
		    	  switch(sheetcounter) {
		    	  case 0:
		    		  Sheet sheet = workbook.getSheetAt(sheetcounter);
				      Iterator<Row> rows = sheet.iterator();
//				      List<countryModel> CModels = new ArrayList<countryModel>();
				      int rowNumber = 0;
				      while (rows.hasNext()) {
				        Row currentRow = rows.next();
				        // skip header
				        if (rowNumber == 0) {
				          rowNumber++;
				          continue;
				        }
				        Iterator<Cell> cellsInRow = currentRow.iterator();
				        countryModel CModel = new countryModel();
				        int cellIdx = 0;
				        while (cellsInRow.hasNext()) {
				          Cell currentCell = cellsInRow.next();
				          switch (cellIdx) {
				          case 0:
				            CModel.setCode(currentCell.getStringCellValue());;
				            break;
				          case 1:
				            CModel.setDescription(currentCell.getStringCellValue());
				            break;
				          case 2:
				            CModel.setLanguage(currentCell.getStringCellValue());
				            break;
				          case 3:
				            CModel.setFarmer_language(currentCell.getStringCellValue());
				            break;
				          case 4:
				        	  CModel.setApac_code(currentCell.getStringCellValue());
				        	  break;
				          case 5:
				        	  CModel.setUnit_of_measure(currentCell.getStringCellValue());
				        	  break;
				          case 6:
				        	  CModel.setLoc_optimization(currentCell.getStringCellValue());
				        	  break;
				          case 7:
				        	  CModel.setUnified_app(currentCell.getStringCellValue());
				        	  break;
				          case 8:
				        	  CModel.setCurrency(currentCell.getStringCellValue());
				        	  break;
				          case 9:
				        	  CModel.setCountry_code(currentCell.getStringCellValue());
				        	  break;
				          case 10:
				        	  CModel.setS3_location(currentCell.getStringCellValue());
				        	  break;
				          case 11:
				        	  CModel.setApac_url(currentCell.getStringCellValue());
				        	  break;
				          case 12:
				        	  CModel.setDynamic_commission(currentCell.getStringCellValue());
				        	  break;
				          case 13:
				        	  CModel.setMaintenance_flag(currentCell.getBooleanCellValue());
				        	  break;
				          case 14:
				        	  CModel.setDc_apac_url(currentCell.getStringCellValue());
				        	  break;
				          case 15:
				        	  CModel.setAgro_url(currentCell.getStringCellValue());
				        	  break;
				          case 16:
				        	  CModel.setAgro_username(currentCell.getStringCellValue());
				        	  break;
				          case 17:
				        	  CModel.setAgro_password(currentCell.getStringCellValue());
				        	  break;
				          case 18:
				        	  CModel.setSender_id(currentCell.getStringCellValue());
				        	  break;
				          case 19:
				        	  CModel.setIs_p360_applicable(currentCell.getStringCellValue());
				        	  break;
				          case 20:
				        	  CModel.setZone_id(currentCell.getStringCellValue());
				        	  break;
				          case 21:
				        	  CModel.setApp_version(currentCell.getStringCellValue());
				        	  break;
				          case 22:
				        	  CModel.setApac_country_code(currentCell.getStringCellValue());
				        	  break;
				          case 23:
				        	  CModel.setMultilingual_enabled(currentCell.getBooleanCellValue());
				        	  break;
				          case 24:
				        	  CModel.setIs_legal_agreement_enabled(currentCell.getStringCellValue());
				        	  break;

				          default:
				            break;
				          }
				          cellIdx++;
				        }
				        CModels.add(CModel);
				      }
		    		  break;
		    	  case 1:
		    		  Sheet sheet1 = workbook.getSheetAt(sheetcounter);
				      Iterator<Row> rows1 = sheet1.iterator();
//				      List<countryModel> CModels = new ArrayList<countryModel>();
				      rowNumber = 0;
				      while (rows1.hasNext()) {
				        Row currentRow = rows1.next();
				        // skip header
				        if (rowNumber == 0) {
				          rowNumber++;
				          continue;
				        }
				        Iterator<Cell> cellsInRow = currentRow.iterator();
				        codeCountryModel CCModel = new codeCountryModel();
				        int cellIdx = 0;
				        while (cellsInRow.hasNext()) {
				          Cell currentCell = cellsInRow.next();
				          switch (cellIdx) {
				          case 0:
				            CCModel.setCode_id(currentCell.getStringCellValue());
				            break;
				          }
				          cellIdx++;
				        }
				        CCModels.add(CCModel);
				      }
		    		  break;
		    	  case 2:
		    		  Sheet sheet2 = workbook.getSheetAt(sheetcounter);
				      Iterator<Row> rows2 = sheet2.iterator();
//				      List<countryModel> CModels = new ArrayList<countryModel>();
				      rowNumber = 0;
				      while (rows2.hasNext()) {
				        Row currentRow = rows2.next();
				        // skip header
				        if (rowNumber == 0) {
				          rowNumber++;
				          continue;
				        }
				        Iterator<Cell> cellsInRow = currentRow.iterator();
				        locationMetadataModel LMModel = new locationMetadataModel();
				        int cellIdx = 0;
				        while (cellsInRow.hasNext()) {
				          Cell currentCell = cellsInRow.next();
				          switch (cellIdx) {
				          case 0:
				            LMModel.setApac_hierarchy_name(currentCell.getStringCellValue());;
				            break;
				          case 1:
					            LMModel.setLocation_hierarchy_name(currentCell.getStringCellValue());;
					            break;
				          }
				          cellIdx++;
				        }
				        LMModels.add(LMModel);
				      }
		    		  break;
		    		  
		    	  case 3:
		    		  Sheet sheet3 = workbook.getSheetAt(sheetcounter);
				      Iterator<Row> rows3 = sheet3.iterator();
//				      List<countryModel> CModels = new ArrayList<countryModel>();
				      rowNumber = 0;
				      while (rows3.hasNext()) {
				        Row currentRow = rows3.next();
				        // skip header
				        if (rowNumber == 0) {
				          rowNumber++;
				          continue;
				        }
				        Iterator<Cell> cellsInRow = currentRow.iterator();
				        codeModel COModel = new codeModel();
				        int cellIdx = 0;
				        while (cellsInRow.hasNext()) {
				          Cell currentCell = cellsInRow.next();
				          switch (cellIdx) {
				          case 0:
				            COModel.setCode(currentCell.getStringCellValue());
				            break;
				          case 1:
					            COModel.setDescription(currentCell.getStringCellValue());
					            break;
				          case 2:
					            COModel.setValue(currentCell.getStringCellValue());
					            break;
				          case 3:
				        	    COModel.setLanguage(currentCell.getStringCellValue());
				        	    break;
				          }
				   
				          cellIdx++;
				        }
				        COModels.add(COModel);
				      }
		    		  break;
		    		  
		    	  default:
		    		  break;
		    	  }
		    	  sheetcounter++;
		      }
		      workbook.close();
		      return new data(CModels, CCModels, LMModels, COModels);
		    } catch (IOException e) {
		      throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
		    }
	  }

}
