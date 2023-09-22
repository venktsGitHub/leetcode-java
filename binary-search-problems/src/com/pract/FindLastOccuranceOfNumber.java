package com.pract;

public class FindLastOccuranceOfNumber {
	
	public static void main(String a[]) {
		int ar[]= {1,2,3,5,7,8,9,12,34,34,34,34,34,34,34,56};
		
		int start=0;
		int end=ar.length-1;
		int target=34;
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
		
		System.out.println("the ans is "+ans);
	}

}
