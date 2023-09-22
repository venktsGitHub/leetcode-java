package com.pract;

public class DescendingSortedArray {

	public static void main(String[] args) {
	
int ar[]= {56,34,23,13,12,8,5,4,1};
		
		int start=0;
		int end=ar.length-1;
		int target=13;
		int mid =0;
		
		int ans=0;
		
		while(start<=end) {
			
			 mid = (start)+(end-start)/2;
			
			if(ar[mid]==target) {
				ans=mid;
				break;
			}
			
			else if(ar[mid]<target){
				
				end=mid-1;
			}
			
			else {
				start=mid+1;
			}
			
		}
		
		System.out.println("the index is "+ans);
	}
}
