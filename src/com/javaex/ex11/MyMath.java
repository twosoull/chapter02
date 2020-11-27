package com.javaex.ex11;

public class MyMath {
	
	private double pi = 3.14;
	
	public  MyMath(){
		
	}
	
	public static int plus(int a, int b) {
		int sum = a + b;
		return sum; 
	}
	
	public static double plus(double a, double b) {
		
		double sum = a + b;
		return sum;
		
	}
	
	public static double circle(double r) {
		return r*r*pi;
	}
}
