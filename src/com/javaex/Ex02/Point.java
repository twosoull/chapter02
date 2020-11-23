package com.javaex.Ex02;

public class Point {
	
	private int x;
	private int y;


public void setx(int a) {
	x = a;
}

public int getx() {
	return x;
}

public void sety(int b) {
	y = b;	
}

public int gety() {
	return y;
	
	
}

public void draw(int a,int b) {
	
	x = a;
	y = b;
	
	System.out.printf("점 [x=%d, y=%3d]을 그렸습니다 ",x,y);
			
	
	
}

}