package com.javaex.ex07;

public class SongApp {
	public static void main(String[] args) {
		//아이유 기본생성자
		Song iu= new Song();
		
		iu.setTitle("좋은날");
		iu.setArtist("아이유");
		iu.setAlbum("Real");
		iu.setComposer("이민수");
		iu.setYear("2007");
		iu.setTrack(3);
		iu.showInfo();
		
		System.out.println("==================");
		//빅뱅 스트링 5 , 인트 1 생성자
		Song bng = new Song ("거짓말","BIGBANG","Always","G-DRAGON","2007",2);
		bng.showInfo();
		System.out.println("=================");
		//버스커버스커 스트링 2 생성자
		Song bsk = new Song("벚꽂엔딩","버스커버스커");
		bsk.setAlbum("버스커버스커 1집");
		bsk.setComposer("장범준");
		bsk.setYear("2012");
		bsk.setTrack(4);
		bsk.showInfo();
		
		//toString() 사용
		iu.toString();
		bng.toString();
		bsk.toString();
	}
}
