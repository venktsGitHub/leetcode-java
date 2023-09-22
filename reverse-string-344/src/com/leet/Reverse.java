package com.leet;

public class Reverse {

	public static void main(String[] args) {
		
		char c[] = new Solution().reverseString(new char[] {'h','e','l','l','o'});

	}

}

class Solution {
    public char[] reverseString(char[] s) {
     
        int start =0;
        int end = s.length-1;
        
        while(start>end){
            
            char temp= s[end];
            s[end]=s[start];
            s[start]=temp;
            
            start++;
            end--;
        }
        
        for(char c: s )
            System.out.print(" "+c);
        
		return s;
        }
}