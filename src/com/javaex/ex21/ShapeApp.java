package com.javaex.ex21;

public class ShapeApp {
	
	//각 Shape를 상속받는 클래스들을 객체로만들어준다
	//사용용도가 Shape로 하나로 정렬해주기 위함이기에 타입명은
	//부모인 Shape로해준다
	public static void main(String[] args) {
		
		Shape t = new Triangle("빨강","빨강",10,20);
//		t.draw();
		Shape c = new Circle("파랑","파랑",50);
//		c.draw();
		Shape r = new Ractangle("노랑","노랑",100,200);
//		r.draw();
		
		
		Shape[] sArray = new Shape[3];
		
		sArray[0] = t; //삼각형
		sArray[1] = c; //동그라미
		sArray[2] = r; //사각형
		
		//Shape는 독단적으로 쓸수없게 abstract를 걸어뒀지만
		//오버라이딩된 draw()가 사용될수있다.
		
		for(int i = 0; i<sArray.length; i++) {
			sArray[i].draw();
			System.out.println("넓이:"+sArray[i].area());
		}
		
		
	}
}
