package com.pract.main;

import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		Readable r = a -> "Helo";
		
			Stream<Integer> strr = Stream.of(1,2,3,45,45,56,76,78).distinct();
     }
}

@FunctionalInterface
interface Readable{
	String reading(int read);
}
