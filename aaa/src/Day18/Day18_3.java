package Day18;

import java.util.ArrayList;
import java.util.LinkedList;

public class Day18_3 {

	public static void main(String[] args) {
		
		// p731 ~ 732 
		// LinkedList
		
		//			ArrayList		vs		LinkedList
		//			�迭						��ũ
		//	���α��� ����
		//		�ε��� �������� �޸𸮿���			���� �ٸ� �޸��ּ� ����
		//	�ӵ� ����
		//	add[����]		����
		//	add[����-�߰�]						����
		//	�˻�			����
		//	����								����
		
		// 1. ArrayList ��ü����
		ArrayList<String> list1 = new ArrayList<>();
		// 2. LinkedList ��ü ����
		LinkedList<String> list2 = new LinkedList<>();
		
		// 3. �ð�����
		long starttime;
		long endtime;
		
		// 4. arraylist�� 10000�� �����ϴµ� �ɸ��� �ð�
		starttime = System.nanoTime(); // ����ð� ����� ���
		for(int i=0 ; i<10000 ; i++) {
			list1.add(0,i+""); 
			// ����-> ���ڿ� ��ȯ 
				// 1. String.valueOf(����)
				// 2. ���� + ""
			// ���ڿ� -> ���� ��ȯ
				// 1. Integer.parseInt(���ڿ�)
		}
		endtime = System.nanoTime();
		System.out.println("�ð� : " + (endtime-starttime));
		
		// 5. Linkedlist�� 10000�� �����ϴµ� �ɸ��� �ð�
		starttime = System.nanoTime();
		for(int i=0 ; i<10000 ; i++) {
			list2.add(0,i+""); 
			// ����-> ���ڿ� ��ȯ 
				// 1. String.valueOf(����)
				// 2. ���� + ""
			// ���ڿ� -> ���� ��ȯ
				// 1. Integer.parseInt(���ڿ�)
		}
		endtime = System.nanoTime();
		System.out.println("�ð� : " + (endtime-starttime));
		
	}
}
