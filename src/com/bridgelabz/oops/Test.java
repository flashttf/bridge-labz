package com.bridgelabz.oops;

import java.util.Random;

public class Test {
public static void main(String[] args) {
	Random random=new Random();
	
	for(int i=0;i<51;i++) {
		int index=random.nextInt(52);
		System.out.println(index);
	}
}
}
