package edu.kh.collection.model.vo;

import java.util.Scanner;

public class Test {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		
		for(int i = 0; i <arr.length; i++ ) {
			
			int random = (int)(Math.random()*45+1);
			
			arr[i] = random;
			
			for(int x = 0; x<i ; x++) {
				
				if(arr[x] == random) {
					
					i--;
					break;
				}
				
			}
			System.out.print(arr[i] + " ");
			
		}
		
		
	}
	
	
	

}
