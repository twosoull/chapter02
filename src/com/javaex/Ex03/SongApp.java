package com.javaex.Ex03;

public class SongApp {

	public static void main(String[] args) {
		//아이유
		Song song = new Song();
		
		song.setTitle("좋은날");
		String title = song.getTitle();
		
		song.setArtist("아이유");
		String artist = song.getArtist();
		
		song.setAlbum("real");
		String album = song.getAlbum();
		
		song.setComposer("이민수");
		String composer = song.getComposer();
		
		song.setYear(2010);
		int year = song.getYear();
		
		song.setTrack(3);
		int track = song.getTrack();
		
		song.showinfo();
		
		//빅뱅
		Song song2 = new Song();
		
		song2.setTitle("거짓말");
		title = song2.getTitle();
		
		song2.setArtist("BIGBANG");
		artist = song2.getArtist();
		
		song2.setAlbum("Always");
		album = song2.getAlbum();
		
		song2.setComposer("G-DRAGON");
		composer = song2.getComposer();
		
		song2.setTrack(2);
		track = song2.getTrack();
		
		song2.setYear(2007);
		year = song2.getYear();
		
		song2.showinfo();
		
		//버스커버스커
		
		Song song3 = new Song();
		
		song3.setAlbum("버스커버스커1집");
		album = song3.getAlbum();
		
		song3.setArtist("버스커버스커");
		artist = song3.getArtist();
		
		song3.setComposer("장범준");
		composer = song3.getComposer();
		
		song3.setTitle("벚꽃엔딩");
		title = song3.getTitle();
		
		song3.setTrack(4);
		track = song3.getTrack();
		
		song3.setYear(2012);
		year = song3.getYear();
		
		song3.showinfo();
	}
	

}
