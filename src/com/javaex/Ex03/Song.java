package com.javaex.Ex03;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//타이틀
	public void setTitle(String t) {
		title = t;
	}
	public String getTitle() {
		return title;
	}
	//아티스트
	public void setArtist(String a) {
		artist = a;
	}
	public String getArtist() {
		return artist;
	}
	//앨범
	public void setAlbum(String a) {
		album = a;
	}
	public String getAlbum() {
		return album;
	}
	//작곡가
	public void setComposer(String c) {
		composer = c;
	}
	public String getComposer() {
		return composer;
	}
	//년도
	public void setYear(int y) {
		year = y;
	}
	public int getYear() {
		return year;
	}
	//트랙
	public void setTrack(int t) {
		track = t;
	}
	public int getTrack() {
		return track;
	}
	
	public void showinfo() {
		System.out.println(
		artist + "," + title+" ("+ album + ", "+year+", "+track+"번 track, "+ composer+
		" 작곡"+")"
				);
	}
}
