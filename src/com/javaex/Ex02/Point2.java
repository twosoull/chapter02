package com.javaex.Ex02;

public class Point2 {
	private int x;
	private int y;

	public Point2() {
		
	}
	public Point2(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public void setX(int x) {
		this.x = x;
	}
		
	public void draw() {
		
	
	System.out.printf("점 [x=%d, y=%3d]을 그렸습니다 \n",x,y);
				
		
	
}

}