package Day17_���׸�;

public class Day17_2 {
	
	public static void main(String[] args) {
		
		// 1. ��ü����
		Box<Integer> box1 = new Box<>();
		// 2. �޼ҵ� ȣ�� �� ��� ���� ��ü�� ����
		box1 = Util.<Integer>boxing(100);
		// 3. Ȯ��
		System.out.println(box1.get());
		
		
		// p662~663
		// 1. p1 ��ü�� �����ϴµ� ������
		//		�� ���� '1' �� ���ڿ� '���' �ֱ�
		// ���� : ���׸�<����,���ڿ�>
		Pair<Integer, String> p1
		= new Pair<Integer, String>(1, "���");
		// 2. p2 ��ü
		Pair<Integer, String> p2
		= new Pair<Integer, String>(1, "���");
		
		boolean result1 = Util.<Integer, String>Compare(p1, p2);
		
		if(result1) {
			System.out.println("���� ��");
		}else {
			System.out.println("�ٸ� ��");
		}
		
		
		Pair<String, String> p3	= new Pair<>("user1", "ȫ�浿");
		Pair<String, String> p4	= new Pair<>("user2", "�Ӳ���");
		
		boolean result2 = Util.Compare(p3, p4);
		
		if(result2) {
			System.out.println("���� ��");
		}else {
			System.out.println("�ٸ� ��");
		}
	}

}
