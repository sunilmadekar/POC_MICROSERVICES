package com.smware.college.pojo;

public class CollegePojo 
{
    private String name;
    private String address;
    private String collegeId;
     
    public CollegePojo(String name, String address, String collegeId) {
		super();
		this.name = name;
		this.address = address;
		this.collegeId = collegeId;
	}



	public CollegePojo() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getCollegeId() {
		return collegeId;
	}



	public void setCollegeId(String collegeId) {
		this.collegeId = collegeId;
	}



	public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
 
  
}
