package com.javaex.Ex02;

public class PointApp2 {
	
	public static void main(String[] args) {
		
		Point2 point = new Point2(5,5);
		point.setX(10);
		point.draw();
		
		Point2 point2 = new Point2();
		point2.setX(3);
		
		point2.draw();
	}
}
