package com.javaex.ex16;

public class PersonApp {

	public static void main(String[] args) {
		
		Person[] pArray = new Person[3];
		
		Person p01 = new Person("둘리",1203);
		Person p02 = new Person("도우너",203);
		Person p03 = new Person("마이콜",103);
		
		pArray[0] = p01;
		pArray[1] = p02;
		pArray[2] = p03;
		
		for(int i = 0; i <pArray.length; i++) {
			pArray[i].showInfo();
		}
		
		Student[] sArray = new Student[2];
		
		
		
		Student s01 = new Student("유재석",44,"서울고등학교");
		Student s02 = new Student("강호동",47,"경기고등학교");
		sArray[0] = s01;
		sArray[1] = s02;
		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].showInfo();
		}
		
//		s01.showInfo();  

	}
}
