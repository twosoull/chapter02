package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		
		
	    Goods camera = new Goods();
	    
	    camera.setName("니콘");
	    String name = camera.getName();
	    System.out.println(name);
//	    camera.name= "니콘";
//	    camera.price = 400000;
//	    
//	    System.out.println(camera.name);
//	    System.out.println(camera.price);
	    camera.setPrice(40000);
	    int price =camera.getPrice();
	    System.out.println(price);
//	    Goods computer =new Goods();
//	    computer.name= "LG그램";
//	    computer.price = 1000000;
	     Goods computer = new Goods();
	     computer.setName("LG그램");
	     String comname = computer.getName();
	     System.out.println(comname);
	     
	     computer.setPrice(1000000);
	     int comprice= computer.getPrice();
	     System.out.println(comprice);
//	    System.out.println(computer.name);
//	    System.out.println(computer.price);
//	    
//	    Goods cup=new Goods();
//	    
//	    cup.name= "머그컵";
//	    cup.price= 2000;
//	    System.out.println(cup.name);
//	    System.out.println(cup.price);
	     Goods cup = new Goods();
	     cup.setName("머그컵");
	     String cupname = cup.getName();
	     System.out.println(cupname);
	     
	     cup.setPrice(2000);
	     int cupprice = cup.getPrice();
	     System.out.println(cupprice);
//	    camera.price = 450000;
//	    System.out.println(camera.price);
	}

}
