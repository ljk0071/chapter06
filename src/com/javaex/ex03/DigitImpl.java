package com.javaex.ex03;

public class DigitImpl implements Runnable {
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
 
}
