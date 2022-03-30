package Day17_제네릭;

import java.util.Arrays;
import java.util.ArrayList;
public class Day17_3 {
	

	public static void main(String[] args) {
		// 코스 클래스 제네릭에 사람클래스 넣기
		Course<Person> personCourse =new Course<>("일반인", 5);
			personCourse.add(new Person("일반인"));
			personCourse.add(new Worker("직장인"));
			personCourse.add(new Student("학생"));
			personCourse.add(new HighStudent("고등학생"));
	
	
		Course<Worker> workerCourse = new Course<>("직장인", 5);
			workerCourse.add(new Worker("직장인"));
//			workerCourse.add(new Person("일반인")); 부모클래스는 들어갈 수 없다
//			workerCourse.add(new Student("학생")); 관련이 없으므로 불가능
	
		Course<Student> studentCourse = new Course<>("학생", 5);
			studentCourse.add(new Student("학생"));
			studentCourse.add(new HighStudent("고등학생"));
//			studentCourse.add(new Person("일반인")); 부모클래스 못들어감
			
		Course<HighStudent> highStudentCourse = new Course<>("고등학생", 5);
//			highStudentCourse.add(new Student("학생"));
			highStudentCourse.add(new HighStudent("고등학생"));
		
		
	}
	
	
	
	
	
	
	
	
	
//	public static void 코스명단출력(Course<?> 코스명단	) {
//		System.out.println(코스명단.getName() + "수강생 명단 : " + 
//						Arrays.toString(코스명단.getStudents()));
//	}
//	
//	public static void 코스명단출력(Course<? extends Student> 코스명단	) {
//		System.out.println(코스명단.getName() + "수강생 명단 : " + 
//						Arrays.toString(코스명단.getStudents()));
//	}
//	
//	public static void 코스명단출력(Course<? super Worker> 코스명단	) {
//		System.out.println(코스명단.getName() + "수강생 명단 : " + 
//						Arrays.toString(코스명단.getStudents()));
//	}
//	
//	
//	
//	
//	
	
}
