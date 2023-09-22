package com.leet;

import java.util.PriorityQueue;

public class Squares {

	public static void main(String a[]) {
		
		int res[]=new Solution().sortedSquares(new int[] {-7,-3,2,3,11});
		for(int s: res) {
			System.out.println(" "+s);
		}
	}
}

class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int [] array_result = new int[nums.length];
        
        PriorityQueue<Integer> result = new PriorityQueue<Integer>();
        int k=0;
        
        for(int i=0; i<nums.length; i++){
            result.offer(nums[i]*nums[i]);
            
        }
        
       while(!result.isEmpty()) {
            
        	array_result[k]=result.poll();
        	k++;
            
        }
        
        
        
        return array_result;
    }
}
