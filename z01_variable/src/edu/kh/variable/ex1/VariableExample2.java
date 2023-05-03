package edu.kh.variable.ex1;

public class VariableExample2 {
	public static void main(String[] args) {
		
		/* 자바 기본 자료형 8가지
		 * 
		 * 논리형 : boolean(1byte)
		 * 정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
		 * 실수형 : float(4byte), double(8byte)
		 * 문자형 : char(2byte, 유니코드)
		 * 
		 * 
		 **/
		
		//변수 선언 : 메모리에 값을 저장할 공간을 할당하는 것
		//변수 값 대입(집어넣기):변수에 값을 집어 넣는 것 
		
		//*카멜(낙타) 표기법
		//연결되는 두 단어 중 후속 단어의 첫 문자를 대문자료 표기
		
		boolean booleanData;
		// 메모리에 논리 값(t/f)을 저장할 공간을 1byte 할당하고
		// 할당된 공간을 booleanData라고 부르겠다.
		
		booleanData = true; // booleanData 변수에 true 값을 집어 넣기
		System.out.println("booleanData : " + booleanData);
		
		
		byte byteNumber=127;
		System.out.println("byteNumber : " + byteNumber);
		// 메모리에 정수값을 저장할 공간을 1byte 할당하고
		// 할당된 공간을 byteNumber라고 부르겠다.
		// 선언된 byteNumber 변수에 처음으로 127을 집어 넣음
		// --> 초기화 : 처음 변수에 값을 대입
		
		// 문자형 리터널 표기법 : ''(홑따옴표)
		// -> 문자 하나 
		char ch = 'A';
		char ch2 = 66;
		// ** char 자료형에 숫자가 대입될 수 있는 이유 
		// -컴퓨터에는 문자표가 존재하고 있는데 
		//  숫자에 따라 지정된 문자 모양이 매핑되어있고
		// 'B' 문자 그대로가 대입되면 변수에 숫자 66으로 변환되어 저장
		// -> 반대로 생각하면 변수에 애초에 66이라는 숫자를 저장하는 것이 가능
		
		System.out.println("ch : " + ch);
		System.out.println("ch2 : " + ch2);
		
		//변수 명명 규칙
		
		
		
		// 2. 예약어 사용 X
		// double double; 
		
		// 3. 숫자 시작 X
		// char 1abc;
		
		double 실수2번 = 3.14;
		System.out.println(실수2번);
		
		// -----------------------------------------------
		
		int number = 10;
		System.out.println("number : " + number); // 10 
		
		number = 20;
		System.out.println("number : " + number); // 20
		
		System.out.println( 1 + 1.3 ); 
		// 자동 형변환 : 1 -> 1.0 으로 자동 형변환
		
		
		
		
		
		
		
		
	}

}
