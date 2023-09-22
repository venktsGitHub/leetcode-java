package com.pract;

public class StringToInt {

	public static void main(String[] args) {
		
		String s = "words 23 and 453";
		s=s.trim();
		
		String str[] = s.split(" ");
		
			for(String ss: str) {
            
            long i=0;
			
			try {
				 i = Long.parseLong(ss);
                 
				 if(i>Integer.MAX_VALUE){
					 
                     System.out.println(Integer.MAX_VALUE);
                     
                 }
                
                else if(i<Integer.MIN_VALUE){
                	
                	 System.out.println(Integer.MIN_VALUE);
                }
                
                else{
                	
                	 System.out.println(i);
                }
			}
			
			catch(Exception e) {
                
            }
			
		}
		
	}

}
