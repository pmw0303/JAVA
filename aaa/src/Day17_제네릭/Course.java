package Day17_���׸�;

public class Course <T>{
					// ���׸� [�̸� �ƹ��ų�] : �ܺηκ��� ������ �ڷ���
	private String name; // ������ : ���ڿ�
	private T[] students; // �л��迭Ÿ�� : ?? [���׸��̶� �ܺο��� �޾ƾ� ��]
					// ����        �ο���
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]);
					// ** �Ű� Ÿ������ new (�޸� �Ҵ�) �Ұ�
					// 1. new Object[�ο���] : �ο�����ŭ object �迭 ����
					// 2. object �迭 -> T[] �迭�� ���� ����ȯ
					// ** Object Ŭ������ �ֻ����� ����		
	}
	// �޼ҵ� : ������ ȣ�� �޼ҵ�
	public String getName() {
		return name;
	}
	// �л��迭 ȣ�� �޼ҵ�
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
