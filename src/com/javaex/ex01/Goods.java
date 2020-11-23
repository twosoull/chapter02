package com.javaex.ex01;
//붕어빵 틀 만들기 - 필드 (추상화한 상품명,가격)
public class Goods {
	
	//필드
	private String name;
	private int price;
	//private는 캡슐화라고한다
	
	//생성자
	
	
	//메소드-겟터/세터
	
	
	//메소드 - 일반
	
	//name 등록하는 기능 setName()
	public void setName(String n) {
		name = n; //LG그램 , 니콘, 머그컵
	}
	
	//name 읽어주는 기능 getName()
	public String getName() {
		return name;
		
		
	}
	//price 등록하는 기능
	public void setPrice(int p){
		price =  p;
	}
	//price 읽어주는 기능
	public int getPrice() {
		return price;
	}
	
}
