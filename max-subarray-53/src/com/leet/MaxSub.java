package com.leet;

public class MaxSub {

	public static void main(String[] args) {
		System.out.println("-2,1,-3,4,-1,2,1,-5,4");
		System.out.println("sum is: "+new Solution().maxSubArray(new int[] {-2,-1}));

	}

}


class Solution {
    public int maxSubArray(int[] nums) {
       
        //int[] dp = new int[nums.length];
        int c_max=0;
        int o_max=0;
        int temp=0;
        if(nums.length==1)
            return nums[0];
       
        
      c_max=o_max=nums[0];
        
       // System.out.println(c_max+" "+o_max);
        //[-2,-1]
        for(int i=1;i<nums.length;i++){
         //-3=-3+4   
          c_max=Math.max(c_max+nums[i], nums[i]);
          
          if(c_max<0) {
        	  c_max=nums[i];
          }
         
          
          System.out.println(c_max);
           if(c_max>o_max)
        	   o_max=c_max;
            
           
            
        }
        
       
        
        System.out.println();
        
        return o_max;
    }
}