package com.main;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacter {

	public static void main(String[] args) {
		
		
		//Scanner input = new Scanner(System.in);
		
		//String str = input.nextLine();
		
		//HashMap<Character,Integer> num = new LinkedHashMap<Character,Integer>();
			
		String str="aksauccffksbbskul";	
		
		System.out.println(str);
		
		
		int a[] = new int[26];
		
		
		for(int i=0; i<str.length(); i++) {
			
			a[str.charAt(i)-97]++;
			
		}
		int ans=0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(a[str.charAt(i)-97]==1) {
				ans=i;
				System.out.println(str.charAt(i));
				break;
			}
		}
		
		System.out.println(ans);
	}

}
