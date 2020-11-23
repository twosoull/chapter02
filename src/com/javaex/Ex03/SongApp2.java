package com.javaex.Ex03;

public class SongApp2 {

	public static void main(String[] args) {
	
		Song2 song = new Song2();
		
		song.setSong("좋은날","아이유","real", "이민수", 2010, 3);
		
		
		song.showinfo();
		Song2 song2 = new Song2();
		song2.setSong("거짓말","BIGBANG","real", "이민수", 2010, 3);
		
		song2.showinfo();
		
	}
	

}
