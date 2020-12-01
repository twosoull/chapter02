package com.javaex.ex16;

public class Student extends Person {

		private String schoolName;
		
		public Student() {
			
		} 

		public Student(String name, int age, String schoolName) {
			super(name, age);
			this.schoolName = schoolName;
		}
		//g/s

		public String getSchoolName() {
			return schoolName;
		}

		public void setSchoolName(String schoolName) {
			this.schoolName = schoolName;
		}

		public void showInfo() {
			System.out.println("이름"+getName()+"나이"+getAge()+"학교:"+schoolName);
		}
		
		
		//
		@Override
		public String toString() {
			return "Student [schoolName=" + schoolName + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
		}
		
}
