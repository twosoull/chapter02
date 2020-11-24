package com.javaex.Ex03;

public class SongApp3 {

	public static void main(String[] args) {
		//아이유
		Song3 song = new Song3();
		
		song.setTitle("좋은날");
		song.setArtist("아이유");
		song.setAlbum("real");
		song.setComposer("이민수");
		song.setYear(2010);
		song.setTrack(3);
		
		song.showinfo();
		
		//빅뱅
		Song3 song2 = new Song3("거짓말","BIGBANG","Always","G-DRAGON",2,2007);
		
		song2.showinfo();
		
		//버스커버스커
		Song3 song3 = new Song3("벚꽃엔딩","버스커버스커","버스커버스커1집","장범준",4,2010);
		
		song3.showinfo();
		

	}
	

}
