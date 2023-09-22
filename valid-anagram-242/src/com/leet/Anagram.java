package com.leet;

import java.util.LinkedList;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new Solution().isAnagram("aacc","ccac"));
	}

}


class Solution {
    public boolean isAnagram(String s, String t) {
        
    	
    	char chars[]=s.toCharArray();
        LinkedList<Character> charsList= new LinkedList<>();
        
        for(char c: chars) {
        	charsList.add(c);
        }
        
        for(int i=0;i<t.length();i++){
        	
        if(!charsList.contains(t.charAt(i))){
            return false;
        }
        
        else {
        	Character d=(char) (t.charAt(i)); 
        	System.out.println("the char is "+d);
        	charsList.remove(d);
        }
           }
        
        return true;
    }
}
