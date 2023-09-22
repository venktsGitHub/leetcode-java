package com.leet;

import java.util.HashSet;
import java.util.Set;

public class CDuplicate {

	public static void main(String[] args) {
		
		System.out.println(new Solution().containsDuplicate(new int[] {1,2,3,4}));
	}
}
class Solution {
public boolean containsDuplicate(int[] nums) {
        
        
		Set<Integer> res = new HashSet<>();
        
		for(int c: nums){ if(!res.add(c)){return true;}}
        
        return false; 
    }
}	