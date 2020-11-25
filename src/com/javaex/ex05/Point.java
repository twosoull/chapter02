package com.javaex.ex05;

public class Point {

	int x;
	int y;
	
	//기본생성자
	
	public Point() {}
	
	//매개변수 int x , int y
	
	public Point (int x,int y) {
		this.x = x;
		this.y = y;
	}
	//매개변수 int x
	public Point (int x) {
		this.x = x;
	}
	//매개변수 int y
	
	
	//게터 세터
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
	//쇼인포
	public void showinfo() {
		System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
	}
}
