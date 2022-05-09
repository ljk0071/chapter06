package com.javaex.ex03;

public class UpperImpl implements Runnable {
	public void run() {
		for(char ch='A';ch<='Z';ch++) {
			System.out.println(ch);
		}
	}
}
