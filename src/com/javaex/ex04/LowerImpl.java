package com.javaex.ex04;

public class LowerImpl implements Runnable{
	public void run() {
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				
			}
		}
	}
}
