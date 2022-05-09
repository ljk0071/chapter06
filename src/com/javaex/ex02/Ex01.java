package com.javaex.ex02;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args){
		
		ArrayList<Thread> tl = new ArrayList<Thread>();
		
		tl.add(new DigitThread());
		tl.add(new LowerThread());
		tl.add(new UpperThread());
		
		for(int i=0;i<tl.size();i++) {
			tl.get(i).start();
		}
	}

}
