package ncs.test4;

import java.util.Arrays;

public class TestSort {

	public static void main(String[] args) {
		// 10개의 정수 값을 기록할 수 있는 기본 자료형 배열을 선언한다.
		// Sequential sort(또는 selection sort) 알고리즘을 사용하여 내림차순 정렬 처리한 결과를 출력한다.
		// Math 클래스의 random() 메소드를 이용하여 51~100 사이의 임의의 정수값 10개를 발생시켜 기록한다.
		/*
		 * 3. 실행 결과 출력 결과는 다음과 같다. before: [93, 59, 59, 82, 62, 77, 83, 91, 83, 92]
		 * after: [93, 92, 91, 83, 83, 82, 77, 62, 59, 59]
		 */

		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (100 - 50)) + 51;
		}
		System.out.println("before : " + Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("after : " + Arrays.toString(arr));
	}
}
