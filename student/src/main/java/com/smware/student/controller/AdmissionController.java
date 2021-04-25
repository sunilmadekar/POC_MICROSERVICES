package com.smware.student.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.smware.student.pojo.StudentPojo;

@RestController
public class AdmissionController {


	private static Map<Integer, StudentPojo> schooDB = new HashMap<Integer, StudentPojo>();

	static {
		schooDB = new HashMap<Integer, StudentPojo>();

		StudentPojo std = new StudentPojo("Sajal", "Class IV",101);
		schooDB.put(std.getStudentId(), std);
		std = new StudentPojo("Lokesh", "Class V",102);
		schooDB.put(std.getStudentId(), std);

		std = new StudentPojo("Kajal", "Class III",103);
		schooDB.put(std.getStudentId(), std);
		std = new StudentPojo("Sukesh", "Class VI",104);
		schooDB.put(std.getStudentId(), std);


	}

	@RequestMapping(value = "/getStudentDetailsForSchool/{id}", method = RequestMethod.GET)
	public StudentPojo getStudents(@PathVariable Integer id) {
		System.out.println("Getting Student details for " + id);

		StudentPojo student = schooDB.get(id);
		if (student == null) {
			student = new StudentPojo("Not Found", "N/A",000);
		}
		return student;
	}

	@RequestMapping(value = "/getStudentDetails", method = RequestMethod.GET)
	public Collection<StudentPojo> getStudentsById() {

		Collection<StudentPojo> pojo = schooDB.values();
		return pojo;
	}
}
