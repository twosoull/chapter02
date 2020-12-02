package com.javaex.ex21;

public abstract class Shape {
	//필드
	protected String fillColor;
	protected String lineColor;
	
	
	//생성자
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
	
	//두 일반 메소드 모두 오버라이딩해서 사용해야한다
	//왜냐면 shape 도형 자체로는 아무것도 그릴수없다
	//도형 삼각형 도형 사각형처럼 어떤 도형인지가 중요하기에
	//각각 도형의 색을 표시하기 위해 부모로 사용되었으므로
	//현재 두 메소드는 Shape 클래스 자체만으로 사용되면 위험하다. 
	//사용하기에 위험한 코드이기에 abstract를 사용한다
	//오류가 나기에 클래스도 abstract로 바꿔준다
	//이로서 Shape 클래스는 독단적으로 메모리가 올라갈 수 없게되고
	//변수와메소드만을 끌어쓰는 부모용도가 된다
	//메소드 또한 오버라이딩 용도로만 사용이된다
	
	public abstract void draw();
	public abstract double area();
	
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	
	
	
}
