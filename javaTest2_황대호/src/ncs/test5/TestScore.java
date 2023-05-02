package ncs.test5;

import java.util.Arrays;
import java.util.Scanner;

public class TestScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double[][] score = new Double[3][5];
//75.5 75.5 75.5 226.5 75.5
//		1 83.5 76.5 80.0 240.0 80.0
//		2 79.9 80.1 77.6
		for (int i = 0; i < score.length; i++) {
			System.out.println((i + 1) + "번째 학생");
			System.out.println("과목1 점수 입력");
			score[i][0] = sc.nextDouble();
			System.out.println("과목2 점수 입력");
			score[i][1] = sc.nextDouble();
			System.out.println("과목3 점수 입력");
			score[i][2] = sc.nextDouble();

			score[i][3] = score[i][0] + score[i][1] + score[i][2];
			score[i][4] = (score[i][3] / 3);

		}
		
		System.out.printf("%5s %5s %5s %5s %5s %5s\n", "index", "과목1", "과목2", "  과목3", "총점", "평균");
		for (int i = 0; i < 3; i++) {
			System.out.printf("%-5d",i);
			for (int j = 0; j < 5; j++) {
				System.out.printf(" %6.1f",score[i][j]);
			}
			System.out.println();
		}

	}
}
