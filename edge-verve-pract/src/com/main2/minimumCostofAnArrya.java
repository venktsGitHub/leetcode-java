package com.main2;

public class minimumCostofAnArrya {

	

	public static void main(String[] args) {
		
		int a[]= new int[] {1,3,5,2,9};
		int index=0;
		int value=0;
		int sum=0;
		
		int temp=0, max=Integer.MIN_VALUE;
		
		for(int i=0; i<a.length-1; i++) {
			
			temp = Math.abs(a[i]-a[i+1]);
			
			
			
			if(temp>max) {
				max=temp;
				index=i+1;
				
					value = (a[i]+a[i+1])/2;
				
			}
		}
		
		for(int i=0; i<a.length-1; i++) {
		
		  sum=sum+Math.abs(a[i]-a[i+1])*Math.abs(a[i]-a[i+1]);
		
		}
		
		int finalAns = sum-(max*max); 
		finalAns += (max*max)/2;
				
		System.out.println(max+" index is "+index+" the value is "+value+" sum is "+finalAns);

	}

}
