package Day18;

import java.util.Vector;

public class Day18_2_Vector {

	public static void main(String[] args) {
		
		// p730
			
		// 1. Vector ����Ʈ��ü ����
		Vector<Board> list = new Vector<>();
		// 2. ����Ʈ ��ü �� �߰�
			// 1�� ����
		list.add(new Board("����", "����", "�ۼ���"));
			// 2�� ����
		Board board = new Board("����2", "����2", "�ۼ���2");
		list.add(board);
		list.add(new Board("����3", "����3", "�ۼ���3"));
		list.add(new Board("����4", "����4", "�ۼ���4"));
		list.add(new Board("����5", "����5", "�ۼ���5"));
		list.add(new Board("����6", "����6", "�ۼ���6"));
		
		System.out.println(list);
		
		// 3. �˻� contains
		System.out.println("�˻� : " + list.contains(board));
		System.out.println("��ġ : " + list.indexOf(board));
		
		// 4. ���� remove
		list.remove(2);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		
		// �ݺ��� �̿��� ��� ��ü ���
		for(int i=0 ; i < list.size() ; i++) {
			Board temp = list.get(i); // i ��° ��ü ���
			System.out.println(temp.���� + "\t" + temp.���� + "\t" + temp.�ۼ���);					
		}
		
		// �ݺ���2
		System.out.println("==========================");
		for (Board temp : list) {
			System.out.println(temp.���� + "\t" + temp.���� + "\t" + temp.�ۼ���);
		}
					
		
		
	}
}
