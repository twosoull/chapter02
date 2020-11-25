package com.javaex.ex05;

public class PointApp {
	public static void main(String[] args) {
		//기본생성자
		Point p1 = new Point();
		p1.setX(5);
		p1.setY(5);
		
		p1.showinfo();
		//int x int y
		Point p2 = new Point(10,23);
		
		p2.showinfo();
		//int x 와 세터y
		Point p3 = new Point(15);
		
		p3.setY(20);
		
		p3.showinfo();
		
		//Point(int y) 사용
		
	}
}
