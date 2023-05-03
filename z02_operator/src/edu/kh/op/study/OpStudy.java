package edu.kh.op.study;

import java.util.Scanner;
public class OpStudy {
	
	public void opstudy1( ) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문장 입력 : ");
		
		//String today = sc.next(); - 입력되는 문자가 띄어쓰기 포함인 경우에는 그 앞까지만 저장되어 출력되고 나머진 안 나타남
		String today = sc.nextLine(); // 띄어쓰기까지도 모두 포함되어서 출력됨 
		
		
		System.out.println("오늘의 한줄 문장은 : \" " + today + " \"입니다.");
		
	}

	public void ex2() {
		
		/*
		 * 예제1
		 * 
		 * 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
		 * 
		 * 입력 : 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
		 * 
		 * 출력 : 첫째 줄에 다음 세 가지 중 하나를 출력한다.

			A가 B보다 큰 경우에는 '>'를 출력한다.
			A가 B보다 작은 경우에는 '<'를 출력한다.
			A와 B가 같은 경우에는 '=='를 출력한다.
		 * 
		 * */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 A : ");
		int a = sc.nextInt();
		
		System.out.print("정수 B : ");
		int b = sc.nextInt();
		
		if( a > b ) {
			
			System.out.println(">");
		} else if(a < b) {
			System.out.println("<");
			
		} else {
			System.out.println("==");
			
		}
		
	}
	
	
	public void ex3() {
		
		// 1부터 20까지의 홀수를 차례대로 출력
		
		for(int i = 1 ; i <=20 ; i+=2) {
			
			System.out.println(i);
		}
		
		
	}
	
	public void ex4( ) {
		

		// for문 응용 2 : 정수 5개를 입력 받아서 합계 구하기
		
		// ex) 
		// 입력 1: 10 
		// 입력 2: 20
		// 입력 3: 30 
		// 입력 4: 40 
		// 입력 5: 50 
		// 합계 : 150
		
		Scanner sc = new Scanner(System.in);
		
		
		int sum = 0;
		
		for(int i = 1; i<=5; i++) {
			
			System.out.print("입력 " + i + ":");
			int input = sc.nextInt();
			
			sum += input;
			
			
		}
		
		System.out.println("합계 : " + sum);
	}
	
	public void ex5() {
		
		// 정수를 몇번 입력 받을지 먼저 입력 받고 
				// 입력된 정수의 합계를 출력
				
				// ex)
				// 입력 받을 정수의 개수 : 2
				// 입력 1 : 10
				// 입력 2 : 20
				// 합계 : 30
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 받을 정수의 개수 : ");
		int num = sc.nextInt();
		
		
		int sum = 0;
		
		for(int i = 1 ; i <= num; i++) {
			
			System.out.print("입력" + i +" : ");
			int input = sc.nextInt();
			
			sum += input;
			
		}
		System.out.println("합계 : " + sum);
		
	}
	
	public void ex6() {
		
		// 1부터 20까지 1씩 증가하면서 출력
				// 단, 5의 배수에 () 를 붙여서 출력
				// ex) 1 2 3 4 (5) 6 7 8 9 (10) 11 ...
		
		for(int i = 1 ; i <=20 ; i++) {
			
			if(i % 5 ==0) {
				
				System.out.print("(" + i + ") ");
			} else {
				
				System.out.print( i + " ");
			}
		}
		
	}

	
	public void ex7() {
	//구구단 단을 만들어 보자 

	
		for(int i = 1; i <=9 ; i++) {
		
		int num = i;
		System.out.printf("%d * %d = %d\n",2,num,2*num);
		
		}

	}
	
	public void ex8() {
		
		// 몇 단인지 단수를 입력 받아
		// 입력 받은 단수의 구구단을 출력해보자 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단 단수 : ");
		int a = sc.nextInt();
		
		for(int i = 1 ; i <= 9 ; i++) {
			
		System.out.printf("%d * %d = %d\n",a,i,a*i);
			
		}
		
	}

	public void ex9() {
		
		// 구구단 전체를 출력하는 방법은???
	
		
	}
	
	
	
	
	
	
	
	
}
