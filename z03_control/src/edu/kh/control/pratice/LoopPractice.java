package edu.kh.control.pratice;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class LoopPractice {
	/*
	 다음과 같은 실행 예제를 구현하세요 
	 
	 ex.
	 정수 입력 : 4
	 	 *
	 	**
	   ***
	  ****
	 */
	
	public void practice1() { // 2/27일 시작점 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		
		for(int x=1; x <= input; x++) {
			
			// 1) for문 하나 더 작성
			// * 1개 출력 전에 띄어쓰기 3번
			// * 2개 출력 전에 띄어쓰기 2번
			// * 3개 출력 전에 띄어쓰기 1번
			// * 4개 출력 전에 띄어쓰기 0번
			
			// i == 4 3 2 1
			// 
			
			/*for(int i= 1 ; i <= input - x ; i++ ) {
				
				System.out.print(" ");
			}
			
			for(int j = 1; j <= x ; j++) {
				
				System.out.print("*");
			}*/
			
			// 2) for + else
			for(int i = 1; i <= input; i++) {
				
				if( i<= input -x ) {
					System.out.print(" ");
					
				} else {
					
					System.out.print("*");
					
				}
			}
			
			System.out.println();
			
		}
		
	}
	
	public void practice2() { // 2023-03-06. 3번
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		
		// 윗쪽 삼각형
		for(int x =1; x<=input; x++) {
			
			for(int i=1; i<=x; i++) {
				
				System.out.print("*");
			}
			System.out.println(); //줄 바꿈
			
		}
		
		// 아랫쪽 삼각형
		for(int y = input-1; y>=1; y--) {
			
			for(int i = 1; i <= y; i++) {
				
				System.out.print("*");
			}
			System.out.println(); //줄 바꿈
		}
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int x = 1; x <= input; x++) { // 입력 받은 input만큼 줄 출력
			
			
			// 공백 출력 for문
			for(int i = input-x; i >=1; i--) {
				
				System.out.print(" ");
			}
			
			// * 출력 for문
			// -> 1, 3, 5, 7, 9
			for(int i = 1; i <= 2*x-1; i++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
	public void practice4() { // 2023-03-08 (7일 숙제-> 풀이)2번
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		/*
		for(int x = 1; x<=input; x++) {
			
	      if(x==1 || x==input) {
	    	  
	    	  for(int i=1; i<=input; i++) {
	    		  
	    		  System.out.print("*");
	    	  }
	    	  System.out.println();
	    	  
	      } else {
	    	  
	    	  for(int i = 1; i<=input;i++) {
	    		  
	    		  if(i== 1 || i == input) {
	    			  
	    			  System.out.print("*");
	    		  } else {
	    			  
	    			  System.out.print(" ");
	    		  }
	    	  }
	    	  System.out.println();
	    	  
	      	}
			 
		}
		System.out.println(); */  // 건룡님의 경우 삼항연산자를 사용해서 구성했음! 
		
		// 선생님 코드!! 
		//row : 행 (줄)
		//col(column) : 열(칸)
		
		for(int row=1; row<=input; row++) {
			
			for(int col = 1; col<=input; col++) {
				// row 또는 col이 1 또는 input인 경우 * 출력
				// == 테두리
				
				if(row == 1 || row == input || col == 1 || col == input) {
					System.out.print("*");
					
				} else { // 내부
					System.out.print(" ");
					
				}
			}
			System.out.println();
		}
		
	}	 

	
	
}
