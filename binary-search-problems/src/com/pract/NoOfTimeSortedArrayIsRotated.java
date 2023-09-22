package com.pract;


//
public class NoOfTimeSortedArrayIsRotated {

	public static void main(String[] args) {
		
		int ar[]= {10,11,12,15,18,1};
		int minIndex = findMinIndex(ar);
		
		System.out.println("The array rotated "+(ar.length-minIndex)+" times anti-clockwise");
		

	}
	
	public static int findMinIndex(int []ar) {
		
		int start=0;
		int end = ar.length-1;
		int N=ar.length;
		int mid=0;
		int min=-1;
		
		while(start<=end) {
			
			mid= start+(end-start)/2;
			int next=(mid+1)%N;
			int pre =(mid-1+N)%N;
		
			if(ar[mid]<ar[next] && ar[mid]< ar[pre]) {
				min=mid;
				return mid;
			}
			
			else {
				if(ar[mid]>ar[start]) {
					start=mid+1;
				}
				
				else if(ar[mid]<ar[end]) {
					end=mid-1;
				}
			}
			
		}
		
		
		
		return min;
	}

}
