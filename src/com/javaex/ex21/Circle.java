package com.javaex.ex21;

public class Circle extends Shape {
	//필드
	private int radius;

	//생성자
	public Circle() {
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor,lineColor);
		this.radius = radius;
	}
	
	//메소드 g/s
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//메소드 일반
	
	public void draw() {
		System.out.println("동그라미  - 면색:"+fillColor+", 선색:"+lineColor+", 반지름"+radius);
	
	}
	
	
	public double area() {
		return 3.14*radius*radius;
	}
	
	
}
