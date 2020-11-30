package com.javaex.ex15;

public class ColorPoint extends Point{
	
	private String color;
		public ColorPoint() {
			
		}
		
		public ColorPoint(String color) {
			this.color = color;
		}
		public ColorPoint(int x, int y ,String color) {
			super(x,y);
			this.color = color;
		}
		
		public ColorPoint(Point p, String color) {
			super(p.getX(),p.getY());
			this.color = color;
		}
		//메소드 - 게터세터
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public void showInfo() {
			System.out.println("x="+super.getX()+"y="+super.getY()+"color = " + color);
		}

		//메소드 - 일반
		@Override
		public String toString() {
			return "ColorPoint [color=" + color + "]";
		}
		
		
		
}
