package com.javaex.ex21;

public class Triangle extends Shape{
	//필드
	private int base;
	private int height;
	
	
	//생성자
	public Triangle() {
	}
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	public Triangle(String fillColor, String lineColor,int base, int height) {
		super(fillColor,lineColor);
		this.base = base;
		this.height = height;
	}

	//메소드 g/s
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	//메소드 일반
	
	public void draw() {
		System.out.println("삼각형  - 면색:"+fillColor+", 선색:"+lineColor+", 가로"+base+", 높이"+ height);
	}
	public double area() {
		return (base*height)/2;
	}
	
	
	
}
