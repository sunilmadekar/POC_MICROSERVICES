package com.smware.college.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class College {
	


	
	private static Map<String, List<CollegePojo>> schooDB = new HashMap<String, List<CollegePojo>>();
	 
    static {
        schooDB = new HashMap<String, List<CollegePojo>>();
 
        List<CollegePojo> lst = new ArrayList<CollegePojo>();
        CollegePojo std = new CollegePojo("RBM", "Chandgad");
        lst.add(std);
        std = new CollegePojo("Shivaray", "Kolhapur");
        lst.add(std);
 
        schooDB.put("abcschool", lst);
 
        lst = new ArrayList<CollegePojo>();
        std = new CollegePojo("Kajal", "Class III");
        lst.add(std);
        std = new CollegePojo("Sukesh", "Class VI");
        lst.add(std);
 
        schooDB.put("xyzschool", lst);
 
    }
 
    @RequestMapping(value = "/getCollageDetailsForStudent/{schoolname}", method = RequestMethod.GET)
    public List<CollegePojo> getStudents(@PathVariable String schoolname) {
        System.out.println("Getting Student details for " + schoolname);
 
        List<CollegePojo> studentList = schooDB.get(schoolname);
        if (studentList == null) {
            studentList = new ArrayList<CollegePojo>();
            CollegePojo std = new CollegePojo("Not Found", "N/A");
            studentList.add(std);
        }
        return studentList;
    }


}
