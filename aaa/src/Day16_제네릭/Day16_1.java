package Day16_���׸�;

public class Day16_1 {

	public static void main(String[] args) {
		
		// ���׸�
		
		// p656 �� ���׸� ��1
		
		// 1. Box ��ü ����
		Box box = new Box();
		// 2. ��ü�� �޼ҵ� ȣ��
		box.set("ȫ�浿");
		// 3. ��ü�� �޼ҵ� ȣ��
		String name = (String)box.get(); // String -> Object ���� 
		// but ������ Object�� String �Ϸ����� ���� ���� ����ȯ �������
		// box.get() -> (String)box.get()

		// 4. 
		box.set(new Apple()); // Apple�� �ѱ�°� ���� 
		Apple apple =(Apple) box.get(); // but box�� Apple�� �ִ� ���� �ȵ� *����ȯ
		// box.get() -> (Apple) box.get()
	}
	
}
