package com.javaex.ex03;

public class LowerImpl implements Runnable{
	public void run() {
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch);
		}
	}
}
