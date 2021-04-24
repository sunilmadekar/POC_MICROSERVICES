package com.smware.student.pojo;

public class StudentPojo 
{
    private String name;
    private String className;
    private int studentId;
     
   public StudentPojo(String name, String className, int studentId) {
		super();
		this.name = name;
		this.className = className;
		this.studentId = studentId;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getClassName() {
        return className;
    }
 
    public void setClassName(String className) {
        this.className = className;
    }
}
