package com.leet;

public class ReverseStr {

	public static void main(String[] args) {
		
		String a="";
		String in = "Ramu";
		
		for(int i=0; i<in.length(); i++) {
			a=in.charAt(i)+a;
		}
		
		
		System.out.println("The reverse is "+a);
		
		StringBuilder str = new StringBuilder("The");
		
		StringBuilder str1 = new StringBuilder("The");
		
		String sr="The";
		
		
		System.out.println(str.equals(sr));
		String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 =  new String("HELLO");
 
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
	}

}
