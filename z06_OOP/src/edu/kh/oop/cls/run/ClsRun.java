package edu.kh.oop.cls.run; // 2023-03-02 일곱번째

import edu.kh.oop.cls.model.service.ClsService;
import edu.kh.oop.cls.model.vo.Student;

public class ClsRun {
	
	public static void main(String[] args) {
		
		ClsService service = new ClsService();
		
		//service.ex2(); // static 확인 예제 호출
		//service.ex3(); // 생성자 예제 (2023-03-03 2번)
		service.ex4();
		
		Student std = new Student();
		//std.ex();
		
	    
	}
}
