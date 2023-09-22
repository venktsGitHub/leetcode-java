package com.lam;

public class Lambda {

	public static void main(String[] args) {
		
		Calculator cal = ( a,  b)-> a+b;
		

		
		System.out.println("The sum is: "+cal.sum(23, 45));
	}

	
}


@FunctionalInterface
interface Calculator{
	
	public int sum(int a, int b);
}