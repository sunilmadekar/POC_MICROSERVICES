package com.smware.college.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.smware.college.pojo.CollegePojo;

@RestController
public class CollegeController {




	private static Map<String, CollegePojo> schooDB = new HashMap<String, CollegePojo>();

	static {

		CollegePojo std = new CollegePojo("RBM", "Chandgad","1001");
		schooDB.put(std.getCollegeId(), std);
		std = new CollegePojo("Shivaray", "Kolhapur","1001");
		schooDB.put(std.getCollegeId(), std);


	}

	@RequestMapping(value = "/getCollageDetailsForStudent/{collegeID}", method = RequestMethod.GET)
	public CollegePojo getStudents(@PathVariable String collegeID) {
		System.out.println("Getting Student details for " + collegeID);

		CollegePojo studentList = schooDB.get(collegeID);
		if (studentList == null) {
			studentList = new CollegePojo("Not Found", "N/A","");
		}
		return studentList;
	}


}
