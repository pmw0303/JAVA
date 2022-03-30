package Day09;

public class Day09_3 {
	public static void main(String[] args) {
		
		
		// super() : 부모클래스 내 빈 생성자 호출
		// super(인수1, 인수2) : 부모클래스 내 2개 인수 호출
		// super(인수1, 인수2, 인수3) : 
		
		
		Student student = new Student("홍길동", "123456-123456]7", 10);
		// 생성자 선언
		
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);
		// 생성자를 통해서 불러오기
	}

}
