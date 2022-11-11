package com.ezen.spring.polymorphism;

public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("====> 애플스피커 객체 생성");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker --- 소리 증가");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker --- 소리 감소");
	}

}
