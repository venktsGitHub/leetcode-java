package com.main;

public class RemoveValue {

	public static void main(String[] args) {
		

		 new Solution().removeElement(new int[] {0,4,4,0,4,4,4,0,2}, 4);
		
	}

}

class Solution {
    public int removeElement(int[] nums, int val) {
        int len=0;
        int start=0;

        //3 2 2 3 6 7 // 3

        // 2 3 2 3 6  7

        // 2 2 3 3 6 7 
        
        // 2 2 6 3

        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==val){
                 
                start=i+1;

                while(start<nums.length){

                    if(nums[start]==val){
                        start++;
                    }

                    else{
                        nums[i]=nums[start];
                        nums[start]=val;
                        break;
                    }
                }

            
                }
            }
        


        for(int i=0; i<nums.length; i++){
          
                System.out.print(nums[i]+" ");
            
        }
        
        return len;
    }
}