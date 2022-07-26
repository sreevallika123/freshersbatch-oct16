package com.cg.assignment;

public class Assignment2 {
	 public static void main(String[] args) {

	        int n1=100,n2=1000, number, temp, total = 0;

	       
	        for(int i=n1;i<n2;i++) {
	        	 number = i;
	        	
	        
	        while (number != 0)
	        {
	            temp = number % 10;
	            total = total + temp*temp*temp;
	            number /= 10;
	        }
	        

	        if(total == i)
	            System.out.println(i);
	        
	        }

	 }
}
