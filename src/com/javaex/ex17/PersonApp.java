package com.javaex.ex17;

public class PersonApp {
	 
	public static void main(String[] args) {
		 //test -->섞어쓰기
		//자료형을 통일하려고, 학교정보 유지하고싶다
//		Person s01 = new Student("유재석",44,"서울고등학교");
		
		//자식쪽 Student의 정보를 사용할 수 없다.
		//s01.getSchollName();
//		s01.showInfo();//자식쪾의 showInfo()가 실행된다. 덮어쓴다
		
//		System.out.println(s01.toString());
		
		
		Person[] psArray= new Person[5];
		
		Person p01 = new Person("둘리",1200);
		Person p02 = new Person("도우너",200);
		Person p03 = new Person("마이클",300);
		
		Person s01=new Student("유재석",44,"서울고등학교");
		Person s02=new Student("강호동",47,"경기고등학교");
		
		psArray[0] = p01;
		psArray[1] = p02;
		psArray[2] = p03;
		psArray[3] = s01;
		psArray[4] = s02;
		
		for(int i = 0; i<psArray.length; i++) {
			psArray[i].showInfo();
		}
	}
}
