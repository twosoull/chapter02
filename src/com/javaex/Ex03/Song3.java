package com.javaex.Ex03;

public class Song3 {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	//생성자
	//메소드 유사하다 이름은 클래스명,리턴형이없다
	public Song3() {
		//메모리에 올린다
		
	}
		
	public Song3(String title, String artist, String album, String composer, int year, int track){
		//매개변수를 넣어준다
			this.title = title;
			this.artist = artist;
			this.album = album;
			this.composer = composer;
			this.year = year;
			this.track = track;	
		}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	public void showinfo() {
		System.out.println(artist + "," + title + " (" + album + ", " + year + ", " + track + "번 track, " + composer
				+ " 작곡" + ")");
	}
}
