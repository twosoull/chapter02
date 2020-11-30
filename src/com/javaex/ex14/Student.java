package com.javaex.ex14;

public class Student extends Person {
	
	//필드
	private String schoolName;


	public Student() {
	
	}
	
	public Student(String schoolName) {
		
		this.schoolName = schoolName;
		
	}
	
	public Student(String name, int age, String SchoolName) {
		super(name, age);
		this.schoolName= SchoolName; 
		
	}

	//메소드 - g/s
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
		
	}
	
	public void showInfo() {
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(schoolName);
		
		System.out.println("이름"+name+" 나이"+age+" 학교이름:"+schoolName);
	}

	//메소드 - 일반
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}

	

	
	
}
