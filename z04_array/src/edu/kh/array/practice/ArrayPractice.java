package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {  //2023-02-28 두번째
	
	// 길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
	// 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후 
	// 짝수 번째 인덱스 값의 합을 출력하세요. ( 0 번재 인덱스는 짝수로 취급) 
	/*
	 * [실행 화면]
	 * 
	 * 1 2 3 4 5 6 7 8 9
	 * 짝수 번째 인덱스 합 : 25
	 * */

	public void example() {
		
		int[] arr = new int[9];
		
		int sum = 0;

		for(int i = 0; i < arr.length; i++ ) {
			arr[i] = i+1;
			
			System.out.print(arr[i] + " ");
			
			if(i % 2 ==0) {
				
				sum += arr[i];
			}
			
		}
		
		System.out.println("\n짝수 번째 인덱스 합 : " + sum);
		
	}
	
	// 길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
	// 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후 
	// 홀수 번째 인덱스 값의 합을 출력하세요. ( 0 번재 인덱스는 짝수로 취급) 
	/*
	 * [실행 화면]
	 * 
	 * 9 8 7 6 5 4 3 2 1
	 * 홀수 번째 인덱스 합 : 20
	 * */
	
	public void ex2( ) {
		
		/*int[] arr = new int[9];
		int sum = 0;
		
		for(int i = arr.length-1; i>=0; i--) {
			
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
			
			if(i % 2 != 0) {
				
				sum += arr[i];
			}
		}
		
		System.out.println("\n홀수 번째 인덱스 합 : " + sum); */
		
		int[] arr = new int[9];
		int sum = 0;
		int num = 9;
		
		for(int i = 0; i<arr.length; i++) {
			
			
			// arr[i]= 9 - i;
			arr[i]= num;
			num--;
			
			if(i%2 ==1) { // i가 홀수인 경우
				
				sum += arr[i];
			}
			System.out.println(arr[i] + " ");
		}
	}
		
	// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 
	// 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요
	/*
	 * [실행 화면]
	 * 
	 * 양의 정수 : 5
	 * 1 2 3 4 5 
	 * 
	 * */
	
	public void ex3( ) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		for(int i = 0; i < input; i++) {
			
			int[] arr = new int[input];
			
			arr[i] = i+1;
			
			System.out.print(arr[i] + " ");
			
		}
	}
	
	public void practice4( ) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print("입력 " + i +" : " );
			
			arr[i] = sc.nextInt();
			
		} 

		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		
		boolean flag = false; // 일치하는 값 없음(가정)
		
		for(int i =0; i < arr.length; i++) {
			
			if(arr[i] == search) {
				
				System.out.println("인덱스 : " + i);
				
				flag = true;
			} 
		}
		if(flag == false) {
			
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0); // 입력 받은 문자열에서 0번 인덱스 문자를 반환
		// String -> char  
		
		char[] arr = new char[input.length()]; // 입력 받은 문자열 길이 만큼의 배열 생성
		
		int count = 0; // input에 일치하는 ch가 몇개 있는지 카운트하는 변수
		
		System.out.print(input + "에" +  ch + "가 좋재하는 위치(인덱스): ");
		
		for(int i = 0; i < arr.length; i++) {
			
			// 배열 대입
			arr[i] = input.charAt(i); // 입력 받은 문자열에서 i번째 인덱스 문자를 arr[i]에 대입
			
			// 검색
			if(arr[i] == ch) { // 검색 조건
				
				count++;
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n"+ ch + "개수 : " + count);
		
	}

	
	public void practice6() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		int sum = 0;
		String value = "";
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print("배열 " + i +"번째 인덱스에 넣을 값 : ");
			//int data = sc.nextInt();
			//arr[i] = data;
			//sum += data;
			arr[i] = sc.nextInt();
			sum += arr[i];
			value += arr[i] + " ";
			
		}
		
		/*for(int i = 0; i<arr.length; i++) {
			
			System.out.print(arr[i]+ " ");
		}*/
		System.out.println(value);
		System.out.println("총 합 : "+ sum);
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		
		char[] pNoArr = new char[input.length()];
		
		/*
		for(int i = 0; i < pNoArr.length; i++) {
			
			pNoArr[i] = input.charAt(i);
			
			if(i>7) {
				
				pNoArr[i] = '*';
			}
		}
		System.out.println(pNoArr);
		*/ //내가 한 풀이
		
		for(int i = 0; i < pNoArr.length; i++) {
			
			if(i <= 7) { // 7번 인덱스 이하(생년월일, -, 성별)
				
				pNoArr[i] = input.charAt(i);
			}
			
		}	
		
		
		
	}
	
	
	public void practice8() {  // 못 풀었던 문제! 
		
		Scanner sc = new Scanner(System.in);
		
		while(true) { // 3 이상의 수가 입력될 때까지 무한 반복
					  // -> 3이상이 입력되면 break 문으로 종료	
			
			System.out.print("정수 : ");
			int input = sc.nextInt();
			
			if(input<3 || input % 2 == 0) { // 3미만 또는 짝수인 경우 -> 반복
				System.out.println("다시 입력하세요.");
				
			} else {
				
				// 입력 받은 정수 만큼의 크기를 가지는 배열 생성
				int[] arr = new int[input];
				
				int num = 0; // arr 배열에 대입될 값
				
				for(int i=0; i < arr.length; i++) {
					
					if(i <= arr.length/2) { // 중간 이전 까지 -> 증가
						
						arr[i] = ++num;
					} else { // 중간 이후 -> 감소
						
						arr[i] = --num;
					}
					// 출력 시 , 출력 (단, 마지막 제외)
					if(i == arr.length-1) { // 마지막 바퀴
						System.out.print(arr[i]);
					} else {
						System.out.print(arr[i] + ", ");
						
					}
				}
				break;
			}
		}
	}
	

	public void practice9() {
		
		int[] arr = new int[10];
		
		String random = "";
		for(int i = 0; i < arr.length; i++) {
			
			int num = (int)(Math.random()*10+1);
			arr[i] = num;
			random += arr[i] +" ";
		}
		System.out.print("발생한 난수 : " + random);
	}
	
	public void practice10() {
		
		int[] arr = new int[10];
		
		String random = "";
		
		
		for(int i = 0; i < arr.length; i++) {
			
			int num = (int)(Math.random()*10+1);
			arr[i] = num;
			random += arr[i] +" ";
		}
		System.out.print("발생한 난수 : " + random);
		
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i< arr.length; i++) {
			
			if(arr[i]>max) {
				
				max = arr[i];
				
			} else if( arr[i] < min ){
				
				min = arr[i];
			}
		}
		System.out.print("\n최대값 : " + max);
		System.out.print("\n최소값 : " + min);
	}
	
	public void practice11() {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			
			int random = (int)(Math.random()*10+1);
			
			arr[i] = random;
			for(int x = 0; x < i; x++) {
				
				if(random == arr[x]) {
					i--;
					
					break;
				} 
			}
		}
		for(int i = 0; i<arr.length; i++) {
			
			System.out.print(arr[i] + " "); // 이 구문이 위 for문에 들어가면 왜 안됨? => if문 안에 break 구문 나면 어디로? 하단 break 구문이 내려가지!그럼 출력이 계속 i가 줄었다늘었다 반복
		}
	}
	
	// 로또 번호 자동 생성기 프로그램을 만들기
	// (중복 값 없이 오름차순으로 정렬하여 출력하세요.)
	public void practice12(){
		
		int[] arr = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			
			int random = (int)(Math.random()*45+1);
			arr[i] = random;
			
			for(int x=0; x < i; x++ ) {
				
				if(random == arr[x]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(arr);
	
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
	
	}
		
	
	// 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
	// 문자의 개수와 함께 출력하세요.
	public void practice13() { // 못 푼 문제풀이(2023-03-10)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()];
		int count = 0; // 카운트용 변수
		
		System.out.print("문자열에 있는 문자: ");
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = input.charAt(i); // 문자열 -> char 배열에 옮겨 담기
			
			// 중복 검사 + flag
			// application
			// 배열 : [a, p, p, l, i, c, a, t, i, o, n]
			// 화면 : a, p, l, i, c, t, o, n
			// 개수 : 1 2 3 4 5 6 7 8 
			
			boolean flag = true; // 신호용 변수
			
			for(int x = 0; x<i; x++) { // 중복 검사용 for문
				
				if(arr[i] == arr[x]) {
					// 현재 대입된 문자가 앞서 대입된 문자와 같다면 == 중복
					flag = false; // 신호용 변수의 값을 false로 변경
					break;  // 중복확인했으니 계속 진행할 필요 없으니까! 
				}
			}
			if(flag) { // flag가 true인 경우 == 중복이 없었다라는 의미
				count++; // 카운트 1 증가
				
				if(i == 0) { // 첫 바퀴인 경우
					
					System.out.print(arr[i]);
					
				} else { // 첫 바퀴가 아닌 경우
					
					System.out.print(", " + arr[i]);
				}
			}
		}// 바깥쪽 for문 끝
		System.out.println("\n문자 개수 : " + count);
				
	}		
		
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
