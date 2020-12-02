package com.javaex.ex20;

public class ShapeApp {
	 public static void main(String[] args) {
		//Shape 배열
		 Shape[] sArray = new Shape[3];
		 
		 //사각형 만들기
		 Shape r = new Ractangle("빨강 ","빨강",5,5);
		
		 //원만들기
		 Shape c = new Circle("파랑","파랑",50);
		 
		 //삼각형만들기
		 Shape t = new Triangle("노랑","연두",10,10);
		 
		 sArray[0] = r;
		 sArray[1] = c;
		 sArray[2] = t;
		 
		 for(int i = 0 ; i <sArray.length; i++) {
			 sArray[i].draw();
		 }
		 
		 //Shape class 에 abstract 작성 문제발생 --> 추상클래 
//		 Shape s = new Shape("빨강","검정");
//		 s.draw();
		 
		 
	}
}
