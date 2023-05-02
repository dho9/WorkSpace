package ncs.test7;

public class StudentTest {
	public static void main(String[] args) {
		
		Student[] students = new Student[3];
		Student students1 = new Student("홍길순", 25, 171, 81, "210401", "영여영문학");
		Student students2 = new Student("한사랑", 23, 183, 72, "210402", "건축학");
		Student students3 = new Student("임꺽정", 26, 175, 65, "210403", "체육학");

		students[0] = students1;
		students[1] = students2;
		students[2] = students3;
		
		for(int i =0; i<students.length; i++) {
			
			System.out.println(students[i].toString());
			
			
		}
	}

}
