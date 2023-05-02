package ncs.test2;

public class CharTest {

	public static void main(String[] args) {
		/*프로그램 실행시 String 형태의 문자열을 스페이스 없이 main argument로 받아 들인다.
		입력 받은 String 문자를 String 클래스의 메소드를 이용하여, 반드시 char[]에 담고 for 루프문을
		이용하여 값들을 거꾸로 출력 한다.
		단, 모두 대문자로 만들어 출력 한다. 메소드를 사용하지 말고 직접 구현하여 처리한다.
		 JavaProgramming
		*/
		
		String str = args[0];
		char []car = str.toCharArray();
		
		for(int i =car.length-1; i>=0; i--) {
			
			if(97<=car[i]&&car[i]<=122) {
				car[i]-=32; 
			}
			
			System.out.print(car[i]);
		}
		
	}

}
