package com.javaex.ex04;

public class GoodsApp {
	
	public static void main(String[] args) {
		
		Goods camera = new Goods();
		//Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		String name = camera.getName();
		int price = camera.getPrice();
		
		camera.showinfo();
		
		//Goods(String name,int price);
		Goods computer = new Goods("LG그램",1000000);
		computer.showinfo();
		
		//Goods(String name)
		//setter 사용 setPrice();
		//showinfo() 확인
		
		Goods cup = new Goods("머그컵");
		cup.setPrice(2000);
		
		cup.showinfo();
		
	}
}
