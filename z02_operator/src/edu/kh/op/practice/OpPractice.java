package edu.kh.op.practice;

import java.util.Scanner;
public class OpPractice {
	
	// 실습문제 1
	// 모든 사람이 사탕을 골고루 나눠가지려고 한다.
	// 인원 수와 사탕 개수를 키보드로 입력받고 
	// 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요. 
	/*
	 * [실행화면]
	 * 인원 수 : 29
	 * 사탕 개수 : 100
	 * 
	 * 1인당 사탕 개수 : 3
	 * 남은 사탕 개수 : 13
	 * */
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
	
		System.out.println("1인당 사탕 개수 : " + (candy / people));
		System.out.println("남은 사탕 개수는 : " + (candy % people));
		
	}
	
	// 실습문제 2
	// 정수를 하나 입력 받아 짝수/홀수를 구분하세요.
	// (0은 짝수로 취급합니다.)
	/*
	 * [실행화면]
	 * 정수 입력 : 2
	 * 짝수 입니다.
	 * */
		
	// 실습문제 3
	// 나이를 키보드로 입력 받아 어린이(13세 이하)인지,
	// 청소년(13세 초과 ~ 19세 이하)인지,
	// 성인(19세 초과) 인지 출력하세요
	/*
	 * [실행화면]
	 * 나이 : 19
	 * 
	 * 청소년
	 * */
	
	public void practice2(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		
		System.out.print((input%2)==0 ? "짝수" : "홀수" + " 입니다");
		
	}

	public void practice3(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print((age>13 && age <=19)? "청소년":(age > 19 ? "성인" : "어린이"));
		
		//System.out.print(age<=13 ? "어린이 ": (age>19? "성인" : "청소년"));
			
	}
	
	// 키보드로 정수 두개를 입력받아 각각 변수(num1, num2)에 저장하세요
	// 그리고 또 다른 정수를 입력받아 그 수가 num1 이하이거나 num2 초과이면 true를 출력하고
	// 아니면 false를 출력하세요
	// (단, num1은 num2보다 작아야 함) <- 입력시 작게 입력하면 됨
	/*[실행화면]
	 * 정수1 : 4
	 * 정수2 : 11
	 * 입력 : 13
	 * 
	 * true 
	 * */
	// num1 > input || num2 < input
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		
		System.out.println((input <= num1 || input > num2) ? "true" : "false");
		// System.out.println(input <= num1 || input > num2);
	}
	
	// 3개의 수를 키보드로 입력 받아 입력받은 수가 
	// 모두 같으면 true, 아니면 false를 출력하세요
	/*[실행화면]
	 * 입력1 : 5 
	 * 입력2 : -8
	 * 입력3 : 5
	 * 
	 * false
	 * */
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 1 : ");
		int input1 = sc.nextInt();
		
		System.out.print("입력 2 : ");
		int input2 = sc.nextInt();
		
		System.out.print("입력 3 : ");
		int input3 = sc.nextInt();
		
		System.out.println(input1 == input2 && input2== input3 ? "true" : "false");
		
		// 선생님 풀이 방식
		// boolean result = input1 == input2 && input1 == input3;
		// System.out.println(result);
		
	}
	
	
}
