package com.javaex.ex11;

public class MyMathApp {
	public static void main(String[] args) {	
		int sum = MyMath.plus(3, 4);
		System.out.println(sum);
		
		double sum01 = MyMath.plus(123.34,241.31);
		System.out.println(sum01);
		
		
		
		MyMath mm = new MyMath();
		System.out.println(mm.plus(3,4));//사용은 가능하지만 메모리가 더 쓰이고 따로 바뀌는 변수가 없다면 불필요하다.
		
		int sum02 = minus(100,10);
		
	}
	
	public static int minus (int a, int b) {
		return a-b;
	}
}
