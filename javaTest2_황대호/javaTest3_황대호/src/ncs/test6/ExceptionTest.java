package ncs.test6;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("2~5정수입력 : ");
		int data = sc.nextInt();

		Calculator c = new Calculator();

		try {

			c.getSum(data);
			System.out.println("결과값 : "+c.getSum(data));
		}catch (InvalidException e) {
			System.out.println(e.getMessage());
		}



	}

}
