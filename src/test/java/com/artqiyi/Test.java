package com.artqiyi;

import java.util.concurrent.ThreadLocalRandom;

public class Test {
	public static void main(String[] args) {
		System.out.println(ThreadLocalRandom.current().nextLong());
		for (int i = 0; i < 100; i++) {
			if(i%10==0) System.out.println();
			System.out.print(ThreadLocalRandom.current().nextInt(100)+"\t");
		}
	}
}
