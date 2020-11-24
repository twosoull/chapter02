package com.javaex.Ex02;

public class PointApp {
	
	public static void main(String[] args) {
		
	
	Point p1 = new Point();
//	p1.x = 2;
//	p1.y = 2;
	
	p1.setx(5);
	int x = p1.getx();
	
	
	p1.sety(5);
	int y = p1.gety();
	
	
	p1.draw(x,y);
	
	Point p2 = new Point();
	

	
	p2.setx(10);
	x = p2.getx();
	
	
	p2.sety(23);
	y = p2.gety();
	
	
	p2.draw(x, y);

	
	
	}
}
