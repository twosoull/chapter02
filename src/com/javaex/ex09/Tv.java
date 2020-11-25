package com.javaex.ex09;

public class Tv {
	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	
	//생성자
	public Tv() {
		
	}
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	//메소드 게터세터
	
	
	public int getChannel() {
		if(this.channel>255) {
			this.channel= 100;
		}else if(this.channel<1) {
			this.channel = 1;
		}
		
		return channel;
	}
	public int getVolume() {
		
		if(this.volume>100) {
			this.volume= 100;
		}else if(this.volume<1) {
			this.volume = 1;
		}
		
		return volume;
	}
	
	//일반 메서드
	
	//파워
	public void power(boolean on) {	this.power = on; }
	
	//채널
	
	public int channel(int a) {
		if(power==true) {
			this.channel = a;
		
		getChannel();
		}
		return channel;
	}
	public void channel(boolean up) {
		if(power == true) {
	
		if(up==true) {
			this.channel += 1;
		}else if(up==false) {
			this.channel -= 1;
		}
		
		getChannel();
		}
	}
	//불륨
	
	public int volume(int a) {
		if(power == true) {
		this.volume = a;
		getVolume();
		}
		return volume;
	}
	public void volume(boolean on){
		if(power == true) {

		if(on == true) {
			this.volume += 1;
		}else if(on == false){
			this.volume -= 1;
		}
		
		getVolume();
		}
	}
	
	
	public void status() {
		System.out.println("channel : "+channel);
		System.out.println("volume : "+volume);
		System.out.println("power : "+power);
		
		System.out.println("===================");
	}
	
}
