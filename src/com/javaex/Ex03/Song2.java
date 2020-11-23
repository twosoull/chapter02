package com.javaex.Ex03;

public class Song2 {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public void setSong(String t,String a,String ab, String c,int y,int tr ) {
		title = t;
		artist = a;
		album = ab;
		composer = c;
		year = y;
		track = tr;
	}
	
	public void showinfo() {
		System.out.println(
		artist + "," + title+" ("+ album + ", "+year+", "+track+"번 track, "+ composer+
		" 작곡"+")"
				);
	}
}
