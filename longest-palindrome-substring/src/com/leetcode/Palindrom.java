package com.leetcode;

import java.util.Arrays;

public class Palindrom {

	public static void main(String[] args) {
		Solution sol = new Solution();
		String out=sol.longestPalindrome("aacabdkacaa");
		
		System.out.println(out);

	}

}

class Solution {
    public String longestPalindrome(String s) {
        
        String a[][]=new String[s.length()+1][s.length()+1];
        
        for(int i=0;i<a[0].length; i++){
            
            Arrays.fill(a[i],"");
        }
        
        int len = s.length()+1;
        
        for(int i=1;i<len;i++){
            for(int j=1; j<len ; j++){
                
                if(s.charAt(i-1)==s.charAt(s.length()-j))
                {
                    a[i][j]=a[i-1][j-1]+s.charAt(i-1);
                }
                
                else{
                    
                    
                    if(a[i-1][j].length()>a[i][j-1].length())
					     a[i][j]=a[i-1][j];
					else
						 a[i][j]=a[i][j-1];
                }
            }
        }
        

        for(int i=0;i<len;i++){
            for(int j=0; j<len ; j++){
            	System.out.print(" "+a[i][j]);
            }
            System.out.println();}
        
        return a[len-1][len-1];
        
    }
}