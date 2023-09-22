package com.leet;

public class L35 {

	public static void main(String a[]) {
		
		int ans= new Solution().searchInsert(new int[] {1,3,5,6,7,45,67}, 44);
		System.out.println("The ans is "+ans);
	}
}
class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(start<=end){
            
            mid=start+(end-start)/2;
            
            System.out.println("MID "+mid);
            //3==4
            if(nums[mid]==target){
               ans=mid;
               end=mid-1;
               System.out.println("Hekko");
            }
            //5>4
            else if(nums[mid]>target){
                ans=mid;
                end=mid-1;
                System.out.println("RUKGT");
            }
            //
            else {
                start=mid+1;
            }
            
        }
        
        
        return ans==-1?nums.length:ans;
    }
}