package com.javaex.ex01;

public class GoodsApp2 {

	public static void main(String[] args) {
		//카메라
		Goods2 camera = new Goods2("니콘",400000);
		
		camera.showinfo();
		
		Goods2 computer = new Goods2("맥북",2000000);
		
		computer.showinfo();
		
		Goods2 cup = new Goods2();
		
		cup.showinfo();
		
		
	}
	
	
}
