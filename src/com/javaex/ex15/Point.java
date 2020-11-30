package com.javaex.ex15;

public class Point {
	
	private int x;
	private int y;
	
	
	public Point(){
		
	}
	public Point(int x, int y) {
		this.x= x;
		this.y = y;
		//메소드 - 게터세터
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//메소드 - 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
	
}
