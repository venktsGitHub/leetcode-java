package com.pract;

public class FreqOfANumInSortedArray {

	public static void main(String[] args) {
		
		
			int ar[]= {1,2,3,5,7,8,9,12,34,34,34,34,34,34,34,56};
			int target=34;
			int first = firstOccurance(ar, target);
			int last  = lastOccurance(ar, target);
			
			System.out.println("the frequency is "+ (last-first+1));
				
	}
	
	public static int firstOccurance(int[] ar, int target) {
		
		int start=0;
		int end=ar.length-1;
		int mid =0;
		
		int ans=0;
		
		while(start<=end) {
			
			 mid = (start)+(end-start)/2;
			
			if(ar[mid]==target) {
				ans=mid;
				end=mid-1;
			}
			
			else if(ar[mid]>target){
				
				end=mid-1;
			}
			
			else {
				start=mid+1;
			}
			
		}
		
		return ans;
	}

	
	public static int lastOccurance(int[] ar, int target) {
		
		int start=0;
		int end=ar.length-1;
		
		int mid =0;
		
		int ans=0;
		
		while(start<=end) {
			
			 mid = (start)+(end-start)/2;
			
			if(ar[mid]==target) {
				ans=mid;
				start=mid+1;
			}
			
			else if(ar[mid]>target){
				
				end=mid-1;
			}
			
			else {
				start=mid+1;
			}
			
		}
		
		return ans;
	}
}
