package com.Alfonso20180410_buclefor;

public class Numeroshasta100fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			for(int i=1; i<20; i=i+1) {
			
				
			if(i%3==0 && i%5==0) {
					
				System.out.println("FizzBuzz");
			}	
			
			else if(i%3==0) {
				
				System.out.println("Fizz");
			}
			
			else if(i%5==0) {
				
				System.out.println("Buzz");
			}
			
			else {
				System.out.println(i);
			}
			
			
		
		}
		
		
		
	}

}
