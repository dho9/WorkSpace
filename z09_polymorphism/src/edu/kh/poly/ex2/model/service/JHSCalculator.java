package edu.kh.poly.ex2.model.service; // 2023-03-13 3-3

import edu.kh.poly.ex2.model.vo.Animal;

public class JHSCalculator extends Animal implements Calculator{ // 2023-03-14 1번
							// 클래스, 인터페이스 동시 상속 가능
							// 인터페이스는 다중 상속 가능
	
	@Override
	public int plus(int num1, int num2) {
		return num1 + num2 + MAX_NUM;
	}

	@Override
	public int minus(int num1, int num2) {
		return num1 - num2 + MAX_NUM;
	}

	@Override
	public int multiple(int num1, int num2) {
		return num1*num2 + MAX_NUM;
	}

	@Override
	public double divide(int num1, int num2) {
		return (double)num1/num2 + MAX_NUM;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
