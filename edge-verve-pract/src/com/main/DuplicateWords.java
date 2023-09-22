package com.main;

public class DuplicateWords {

	public static void main(String[] args) {
		
		String str = "this - - is; is. rahul rahul";
		//String backup = new String(str);
		
		
		String temp=" ";
		String next=" ";
		
		for(String in : str.split(" ") ) {
			temp=in;
			
			if((!temp.equals(next) && !in.contains(".")&& !in.contains(";")&& !in.contains(","))) {
				
				
				System.out.print(in+" ");
				next=temp;
			}
			
			else {
				if(in.contains(".") ) {
					if(temp.charAt(0)!=in.charAt(0))
					  System.out.print(in);
					
					else
						System.out.print(".");
						
				}
				else if(in.contains(";") ) {
					if(temp.charAt(0)!=in.charAt(0))
						  System.out.print(in);
						
						else
							System.out.print(";");
							
					}
				else if(in.contains(",") ) {
					if(temp.charAt(0)!=in.charAt(0))
						  System.out.print(in);
						
						else
							System.out.print(",");
							
					}
			}
			
		}
		

	}

}
