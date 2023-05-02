package ncs.test1;

import java.util.Scanner;

public class Test01 {
	/*
	 * [문제 1] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오 각 부서별 평가 점수를 입력 받아 부서별 평가를 하고자 한다. A, B,
	 * C, D, E 와 같이 5개의 평가 기준으로 구성되며 각각의 점수를 이용하여 구한다.
	 * 
	 * 
	 * 5개의 점수를 공백으로 구분하여 하나의 문자열로 입력 받는다. 공백을 기준으로 값들을 분리한 다음, 5개가 아니면 “다시 입력 하세요”라고
	 * 메시지를 출력한 다. 각 분리 문자열을 정수로 변환한 다음, 숫자가 10부터 99까지의 값인지 확인하고 계산에 사용한 다. 입력된 값이
	 * 10부터 99까지의 정수가 아닌 경우 “다시 입력 하세요”라고 메시지를 출력한다. 반복 실행은 하지 않는다.
	 * 
	 * 3. 실행 결과 모두 double로 선언하고 계산한다. “10 20 40 50 80”을 입력 하였을 때 아래와 같이 출력 된다. 평가점수:
	 * 34.0점 Class: Normal Class
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[5];

		while (true) {

			System.out.println("점수입력");
			String sco = sc.nextLine();
			str = sco.split("\\s");
			if (str.length == 5) {
				String sco1 = str[0];
				String sco2 = str[1];
				String sco3 = str[2];
				String sco4 = str[3];
				String sco5 = str[4];

				double score1 = Double.parseDouble(sco1);
				double score2 = Double.parseDouble(sco2);
				double score3 = Double.parseDouble(sco3);
				double score4 = Double.parseDouble(sco4);
				double score5 = Double.parseDouble(sco5);
				Double[] dob = { score1, score2, score3, score4, score5 };
				for (int i = 0; i < dob.length; i++) {
					if (!(10 <= dob[i] && dob[i] <= 99)) {
						System.out.println("다시 입력하세요");
						break;
					} else {
						double result1 = ((score1 + score2) / 2) * 0.6;
						double result2 = ((score3 + score4) / 2) * 0.2;
						double result3 = score5 * 0.2;
						double result = result1 + result2 + result3;

						System.out.println("평가점수 : " + result);
						if (result >= 90.0) {
							System.out.println("Gold Class");
						} else if (result >= 80) {
							System.out.println("Bronze Class");
						} else if (result < 70) {
							System.out.println("Normal Class");
						}

						break;

					}
				}

			} else {
				System.out.println("다시 입력하세요");
			}

		}

	}

}
