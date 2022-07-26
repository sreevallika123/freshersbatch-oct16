package com.cg.assignment;

import java.util.Scanner;

public class Assignment7 {
	public static void main(String[] args) {
		

		Scanner s=new Scanner(System.in);
		int[] arr= {5,10,15,20,25,30,35,40,45,50};
		int query=s.nextInt();
		for(int i=0;i<arr.length;i++) {
		if(arr[i]==query) {
		System.out.println("Your number in array:"+i);
		break;
		}
		else {
		System.out.println("number not in array");
		}
		}
		}
		}
	

	

