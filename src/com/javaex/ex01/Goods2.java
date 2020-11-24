package com.javaex.ex01;

public class Goods2 {

	
	private String name;
	private int price;
	
	public Goods2() {
		
	}
	public Goods2(String name, int price) {
		this.name = name;
		this.price = price;
		
	}
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


	public void showinfo() {
		System.out.println("상품명 "+name+"\n가격: "+price);
	}
	
}
