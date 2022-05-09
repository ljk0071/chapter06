package com.javaex.ex03;

import java.util.ArrayList;

public class MultiThread {

	public static void main(String[] args) {
		
		ArrayList<Thread> thread = new ArrayList<Thread>();
		
		thread.add(new Thread(new LowerImpl()));
		thread.add(new Thread(new DigitImpl()));
		thread.add(new Thread(new UpperImpl()));
		
		for(int i=0;i<thread.size();i++) {
			thread.get(i).start();
		}
	}

}
