package Day17_제네릭;

public class Course <T>{
					// 제네릭 [이름 아무거나] : 외부로부터 들어오는 자료형
	private String name; // 과정명 : 문자열
	private T[] students; // 학생배열타입 : ?? [제네릭이라서 외부에서 받아야 앎]
					// 과정        인원수
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]);
					// ** 매개 타입으로 new (메모리 할당) 불가
					// 1. new Object[인원수] : 인원수만큼 object 배열 선언
					// 2. object 배열 -> T[] 배열로 강제 형변환
					// ** Object 클래스는 최상위라서 가능		
	}
	// 메소드 : 과정명 호출 메소드
	public String getName() {
		return name;
	}
	// 학생배열 호출 메소드
	public T[] getStudents() {
		return students;
	}
	public void add(T t) {
		for(int i=0 ; i<students.length ; i++) {
			if(students[i] ==null) {
				students[i] = t;
				break;
			}
		}
	}
	
	
}
