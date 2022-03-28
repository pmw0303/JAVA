package Day19;

import java.util.Scanner;
import java.util.TreeSet;

public class Day19_5_TreeSet {
	
	public static void main(String[] args) {
		
		// p753 - TreeSet (2��Ʈ��)
			// 1. �ϳ��� ��ü = ���
			// 2. �� ���� �ִ� 2���� �ڽ� ��带 ���� �� ����
		 	// 3. �θ𺸴� ������ ����, ũ�� ������ 
			// 4. ���� ������ �۰�, �������� ŭ
			// 5. TreeSet<�����ڷ���Ŭ����> : 
			// 6. TreeSet<���������Ŭ����> : Comparable, Compator 
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(87); System.out.println("Ȯ�� : " + scores);
		scores.add(88); System.out.println("Ȯ�� : " + scores);
		scores.add(90); System.out.println("Ȯ�� : " + scores);
		scores.add(49); System.out.println("Ȯ�� : " + scores);
		scores.add(60); System.out.println("Ȯ�� : " + scores);
		// * ������ �ڵ����� ����
		System.out.println(scores.first()); // ���� ���� ���
		System.out.println(scores.last()); // ���� ������ ��
		System.out.println(scores.lower(89)); // 89�������� ����
		System.out.println(scores.higher(70)); // 70�������� ������
		System.out.println(scores.floor(95)); // 95���� �������� ���� [���ų� ����]
		System.out.println(scores.ceiling(85)); // 85���� �������� ������ [���ų� ū]
		
		scores.pollFirst(); // ���� ���� ����
		System.out.println(scores);
		scores.pollLast(); // ���� ������ ����
		System.out.println(scores);
		
		// �������� / ��������
		// �������� : �⺻
		// �������� : .descendingSet()		
		System.out.println("�������� : " +scores);
		System.out.println("�������� : " +scores.descendingSet()); // ��������
		
		Scanner scanner = new Scanner(System.in);
		
		// �ݺ����� �̿��� �������� / �������� ���
		System.out.println("==============");
		System.out.println("��������");
		for(Integer temp : scores) {
			System.out.println(temp);
		}
		
		System.out.println("��������");
		for(Integer temp : scores.descendingSet()) {		
			System.out.println(temp);
		}
		
		int i = scanner.nextInt();
		scores.add(i);
		System.out.println(scores);
		System.out.println(scores.descendingSet());
	}

}
