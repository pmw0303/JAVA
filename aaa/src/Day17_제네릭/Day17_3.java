package Day17_���׸�;

import java.util.Arrays;
import java.util.ArrayList;
public class Day17_3 {
	

	public static void main(String[] args) {
		// �ڽ� Ŭ���� ���׸��� ���Ŭ���� �ֱ�
		Course<Person> personCourse =new Course<>("�Ϲ���", 5);
			personCourse.add(new Person("�Ϲ���"));
			personCourse.add(new Worker("������"));
			personCourse.add(new Student("�л�"));
			personCourse.add(new HighStudent("����л�"));
	
	
		Course<Worker> workerCourse = new Course<>("������", 5);
			workerCourse.add(new Worker("������"));
//			workerCourse.add(new Person("�Ϲ���")); �θ�Ŭ������ �� �� ����
//			workerCourse.add(new Student("�л�")); ������ �����Ƿ� �Ұ���
	
		Course<Student> studentCourse = new Course<>("�л�", 5);
			studentCourse.add(new Student("�л�"));
			studentCourse.add(new HighStudent("����л�"));
//			studentCourse.add(new Person("�Ϲ���")); �θ�Ŭ���� ����
			
		Course<HighStudent> highStudentCourse = new Course<>("����л�", 5);
//			highStudentCourse.add(new Student("�л�"));
			highStudentCourse.add(new HighStudent("����л�"));
		
		
	}
	
	
	
	
	
	
	
	
	
//	public static void �ڽ�������(Course<?> �ڽ����	) {
//		System.out.println(�ڽ����.getName() + "������ ��� : " + 
//						Arrays.toString(�ڽ����.getStudents()));
//	}
//	
//	public static void �ڽ�������(Course<? extends Student> �ڽ����	) {
//		System.out.println(�ڽ����.getName() + "������ ��� : " + 
//						Arrays.toString(�ڽ����.getStudents()));
//	}
//	
//	public static void �ڽ�������(Course<? super Worker> �ڽ����	) {
//		System.out.println(�ڽ����.getName() + "������ ��� : " + 
//						Arrays.toString(�ڽ����.getStudents()));
//	}
//	
//	
//	
//	
//	
	
}
