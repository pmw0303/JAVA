package Day09;

public class Day09_3 {
	public static void main(String[] args) {
		
		
		// super() : �θ�Ŭ���� �� �� ������ ȣ��
		// super(�μ�1, �μ�2) : �θ�Ŭ���� �� 2�� �μ� ȣ��
		// super(�μ�1, �μ�2, �μ�3) : 
		
		
		Student student = new Student("ȫ�浿", "123456-123456]7", 10);
		// ������ ����
		
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);
		// �����ڸ� ���ؼ� �ҷ�����
	}

}
