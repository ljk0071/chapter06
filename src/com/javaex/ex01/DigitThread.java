package com.javaex.ex01;

public class DigitThread extends Thread {
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
}
