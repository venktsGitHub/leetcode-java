package com.leet;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FandR {

	public static void main(String a[]) {
		
		Solution sol= new  Solution();
		
	List<String> result= sol.findAndReplacePattern(
			new String[] {
				"badc","abab","dddd","dede","yyxx"
				}, "baba");
	
		System.out.println(result);
	}
}

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        List<String> s = new LinkedList<>();
        int wrds[] = new int[26];
        int pat[] = new int[26];
        
        if(pattern.length()==1)
        {
            for(String str: words)
                s.add(str);
            
            return s;
        }
    
        for(int i=0; i<pattern.length();i++) {
        	
        	pat[pattern.charAt(i)-'a']++;
        	
        }
        int bit=0;
//        for(int i=0; i<26;i++) {
//        	System.out.print(pat[i]+" ");
//        }
        
        for(int i=0;i<words.length;i++) {
        	
        	//System.out.println(words[i]+" ");
        	
        	for(int j=0; j<pattern.length();j++) {
        		
        		wrds[words[i].charAt(j)-'a']++;
        	}
        	
//        	for(int kk=0; kk<26;kk++) {
//            	System.out.print(wrds[kk]+" ");
//            }
//        	
        	for(int j=0; j<pattern.length();j++) {
        		
        		if(!(wrds[words[i].charAt(j)-'a']==pat[pattern.charAt(j)-'a'])) {
        			bit=1;
        		}
        		
        		//System.out.println(wrds[words[i].charAt(j)-'a']+" == "+pat[pattern.charAt(j)-'a']);
        		
        	}
        	
        
        	if(bit==0) {
        		s.add(words[i]);
        		//System.out.println(words[i]);
        	}
        	
        	bit=0;
        	Arrays.fill(wrds,0);
        }
        
      //  System.out.println(s);
        return s;
    }
    
}