package com.javaex.ex01;

public class LowerThread extends Thread {
	public void run() {
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch);
		}
	}
}
