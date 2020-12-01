package com.javaex.ex18;

public class PointApp {
	
	public static void main(String[] args) {
		//ColorPoint가 point를 상속한 상태
		//point 배열 관리
		
		Point[] pArray = new Point[5];
		
		Point p01 =new Point (5, 5);
		Point p02 = new Point(10,5);
		Point p03 = new Point(20,20);
		
		Point c01 = new ColorPoint(100,100,"red");
		Point c02 = new ColorPoint(200,200,"blue");
	
		pArray[0] = p01;
		pArray[1] = p02;
		pArray[2] = p03;
		pArray[3] = c01;
		pArray[4] = c02;
		
		
		for(int i  = 0; i<pArray.length; i++) {
			pArray[i].showInfo();
		}
		// c01과 c02의 주소를 받은 배열 3,4번의  showInfo()메서드의 결과는
		// 객체를 point를 상속받은 ColorPoint 를 가지고있으므로
		// ColorPoint로인해 오버라이딩된 showInfo()를 사용했다
		//(주소가 가르키고있는 부분은 ColorPoint가 상속받고있는 point의 주소이다)
		ColorPoint[] cArray = new ColorPoint[2];
		
		System.out.println(((ColorPoint) pArray[3]).getColor());
		((ColorPoint)pArray[4]).setColor("yellow");
		
		for(int i=0; i<pArray.length; i++) {
			pArray[i].showInfo();
		}
		
		//캐스팅 테스트
		Point z1 = pArray[4]; //포인트 자료형 컬러포인트객체
//  	ColorPoint z2 = pArray[4]; // 오류 포인트 자료형 컬러포인트객체
		//자료형이 맞지않음
		//다운캐스팅?
		ColorPoint z3 = (ColorPoint)pArray[4];//형변환으로 자료형을 같게해줌
		Point z4 = pArray[4]; //자동으로 업캐스팅됌
		
		//g1 0x111주소  포인트 자료형 객체는 포인트를 상속한 컬러포인트
		Point g1 = new ColorPoint();
		
		((ColorPoint)g1).setColor("black");
		
		//0x111주소를 g2에 넣는다 0x111은 포인트 자료형에 객체는 포인트상속한 컬러포인트
		//0x111은 포인트를 가르킨다
		Point g2 = g1;
		//오버라이딩 상태
		g1.showInfo();
		g2.showInfo();
		//0x111주소를 컬러포인트 자료형으로 바꿔줌 객체는 포인트상속 컬러포인트
		ColorPoint g3 = (ColorPoint)g1;
		//정상작동
		g3.showInfo();
		
		//업캐스팅
		Point u1 = new Point();
		ColorPoint uc1 = new ColorPoint();
		//컬러포인트자료형의 포인트를 상속한 컬러포인트 객체를 가진uc1을
		//포인트로 형변환해서 넣었다
		//자식을 부모에게 넣어봤다 자식은 부모가 자기처럼 성을 바꾸나 안바꾸나 오케이
		//자식이 어떤모습이든 받아주는 부모의 사랑을 느낄수있다
		
		Point u2 = (Point)uc1;
		Point u3 = uc1;
		u3.showInfo();
		System.out.println("--");
		//상속을 빼면 여기서부터 오류가생김 타입 서로의 자료형이 다르기에
		//또 가지고 있는 객체가 완전달라서 형변환을 하든안하든 넣을 수가없게된다
		
		u2.showInfo();
		//오버라이딩 상태에서 정상작동됌
		
		u2.showInfo();//실험으로 상속을 뺸체로 사용해봤다 사용불가
		
		
		//다운캐스팅
		//ColorPoint uc2 = u1 ; //부모가 자식에게 대입시키려하니 안들어감
		
		//
		
		//ColorPoint uc2 = (ColorPoint)u1; //형변환을 하면 들여보내줌
		//하지만 바로 작동이 안된다 고집불통 자식이다
		//결국 작동 되는것은
		
		//ColorPoint uc2 = u2; //에러
		ColorPoint uc2 = (ColorPoint) u2;
		uc2.showInfo();
		//결국 point 자료형에 ColorPoint를 객체로 가지고있던 u2만이 형변환후에 들어가야 오버라이딩된
		//제대로 작동이된다
		
		//마지막실험
		
	//	ColorPoint i1 = new Point(); 역시안된다. 
		
		
		
	}
}
