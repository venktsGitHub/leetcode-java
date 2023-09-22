package com.pract;

public class FindElementInRotatedSortedArray {

	public static void main(String[] args) {
		
		int ar[]= {2,2,2,0,2,2};
		int minIndex=0;
		int target=0;
		
		if(ar[0]<ar[ar.length-1]) {
			binarySearch(ar,0,ar.length-1,target);
		}
		else { 
			minIndex = findMinIndex(ar);
		}
		
		
		System.out.println("Minindex  found!!"+ minIndex); 
		
		
		int i=binarySearch(ar,0,minIndex-1,target);
		int j=binarySearch(ar,minIndex, ar.length-1,target);
		
		if(i<0 && j<0) {
			System.out.println("There is no such element"); 
		}
		
		else {
			System.out.println("Element found!!"); 
		}
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
		//0,1,2,3,4,5,6	
		//2,2,2,0,2,2
		
			if(ar[mid]<=ar[next] && ar[mid]<=ar[pre]) {
				
				
				min=mid;
				return mid;
			}
			
			
			
			else {
			
				if(ar[mid]>ar[start] && ar[mid]<ar[end] ) {
					return start;
				}
				
			else if(ar[mid]>ar[start]) {
					
					start=mid+1;
					System.out.println(" "+mid+" "+start);
				}
				
				else if(ar[mid]<ar[end]) {
					end=mid-1;
				}
				else {
					start=mid+1;
				}	
				

			}
			
		}
		
		return min;
	}
  
  public static int binarySearch(int ar[], int start, int end, int target) {
	
	  int mid=-1;
	  int ans=-1;
	  
	  if(ar.length==1){
          if(ar[0]==target){
              return 0;
          }
           return -1;
      }
	  
    while(start<=end) {
    	
    	mid= start+(end-start)/2;
    	
    	if(ar[mid]==target) {
    		ans=mid;
    		return ans;
    	}
    	
    	else if(ar[mid]<target) {
    		start=mid+1;
    	}
    	
    	else {
    		end=mid-1;
    	}
    	
    	
    }
	  
	  return ans;
	  
  }
}
