package com.ams.newcountryrollout.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ams.newcountryrollout.helper.ExcelHelper;
import com.ams.newcountryrollout.message.responseMessage;
import com.ams.newcountryrollout.model.countryModel;
import com.ams.newcountryrollout.service.countryService;

@CrossOrigin("http://localhost:8081")
@Controller
@RequestMapping("/api/excel")
public class countryController {
	@Autowired
	  countryService fileService;
	  @PostMapping("/upload")
	  public ResponseEntity<responseMessage> uploadFile(@RequestParam("file") MultipartFile file) {
	    String message = "";
//	    System.out.println(ExcelHelper.hasExcelFormat(file));
	    if (ExcelHelper.hasExcelFormat(file)) {
//	      try {
	        fileService.save(file);
//	        System.out.println("here");
	        message = "Uploaded the file successfully: " + file.getOriginalFilename();
	        return ResponseEntity.status(HttpStatus.OK).body(new responseMessage(message));
//	      } catch (Exception e) {
//	        message = "Could not upload the file: " + file.getOriginalFilename() + "!";
//	        return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new responseMessage(message));
//	      }
	    }
	    message = "Please upload an excel file!";
	    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new responseMessage(message));
	  }
//	  @GetMapping("/users")
//	  public ResponseEntity<List<countryModel>> getAllData() {
//	    try {
//	    	
//	      List<countryModel> USModel = fileService.getAllData();
//	      if (USModel.isEmpty()) {
//	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//	      }
//	      return new ResponseEntity<>(USModel, HttpStatus.OK);
//	    } catch (Exception e) {
//	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//	    }
//	  }

}
