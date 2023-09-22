package com.pract;


//input is sorted array
public class FindFirstOccuranceOfNumber {

	public static void main(String[] args) {
		
int ar[]= {1,2,3,5,7,8,9,12,16,34,34,34,34,34,34,34,56};
		
		int start=0;
		int end=ar.length-1;
		System.out.println(end);
		int target=34;
		int mid =0;
		
		int ans=0;
		
		while(start<=end) {
			
			 mid = (start)+(end-start)/2;
			 System.out.println(mid+" "+ar[mid]);
			
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
		
		System.out.println("the index is "+ans);
	}

}
