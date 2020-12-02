package com.javaex.ex20;

public abstract class Shape {

	 //필드
	protected String fillColor;
	protected String lineColor;
	
	//생성자 2개
	public Shape() {
		
	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	//메소드 g/s
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	//메소드 일반
	//draw()는 면색과 선색만으로 만들면 아예 입력이 안되거나
	//윈도우창 자체를 덮어버릴 수 있기에 그냥 만들지않음
	//하지만 추상화클래스에 있고 그걸 써야한다면
	//자료형 부모클래스로 묶은 배열을 사용하고있따면
	//내용자체를 날려버리고 오버라이딩되서 사용하기위해
	//메소드를 작성한다
	public abstract void draw();
	
	public abstract double area();
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	
	
}
