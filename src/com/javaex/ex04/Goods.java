package com.javaex.ex04;

public class Goods {
	//필드
	private String name;
	private int price;
	
	//생성자

	
	public Goods(String name, int price) {
	
		this.name = name;
		this.price = price;
	}


	public Goods(String name) {
	
		this.name = name;
	}




	//게터세터
	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//메소드 일반 메소드
	
	public void showinfo(){
		System.out.println("상품이름" + name + "가격:" + price);
	}
}
