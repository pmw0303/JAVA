package Day12;

import java.io.IOException;

public class Day12_3 {
	
	public static void main(String[] args) throws IOException {
		
		// ���� �˻� ���α׷�
					// [����]
					// 1. �Է¹ޱ� [ System.in.read() ]
					// 2. String �迭�� ���� ������ ���� 
						//		String[] ������� = {	
						//			"�ȴ�! ���̹� ��α�&����Ʈ",
						//			"������ ��Ʈ ���� Ȱ�� ������",
						//			"Tucker�� Go ��� ���α׷���",
						//			"ȥ�� �����ϴ� C ���"
						//};
					// 3. �˻���� , ������� 
						// �˻���� : Ư�� ���ڸ� �Է¹޾� ������ ���Ե� ���ڰ� ������ ��� ��� 
							// '���' �˻� ->  "Tucker�� Go ��� ���α׷���" / "ȥ�� �����ϴ� C ���"
						// ������� : ������ �������� �Ϻθ� �Է¹޾� ��µ� �������� ��ȣ�� ���� 
							// '����' ���� -> ���õ� �������� ������ ���ڿ� ���ο� ���� �Է¹޾� ->  ���� �Ϸ� 
		
		String[] book = {"�ȴ�! ���̹� ��α�&����Ʈ", "������ ��Ʈ ���� Ȱ�� ������", 
							"Tucker�� Go ��� ���α׷���", "ȥ�� �����ϴ� C ���"};
			
		while (true) {
			System.out.println("1.�˻� | 2.����");
			byte[] bytes = new byte[100]; // Ű����κ��� [��Ʈ��] ����Ʈ�� �о���� / �Ϲ� ����
			int count = System.in.read(bytes); // ����Ʈ�迭 --> ���ڿ� ��ȯ [-2 = \n\r ����]
			String ch = new String(bytes, 0, count - 2);

			if (ch.equals("1")) {
				System.out.println("���� �˻�");
				count = System.in.read(bytes);
				String search = new String(bytes, 0, count - 2);

				System.out.println("�˻� ���");
				for (String temp : book) {
					// ��� 1
//					if(temp.indexOf(search) != -1) {
//						// ������ �ܾ ���� ���
//						System.out.println(temp); 
//					}
//				}				
					if (temp.contains(search)) {
						System.out.println(temp);

					}

				}

			} else if (ch.equals("2")) {
				System.out.println("������ å�̸�[�Ϻ�]");
				count = System.in.read(bytes); // Ű����κ��� ����Ʈ �о �迭 ����
				String bt = new String(bytes, 0, count - 2);
				// 0���ε��� ����Ʈ���� -2 ������ �ε�������
				int i = 0;
				for (String temp1 : book) {
					if (temp1.contains(bt)) {
						System.out.println(i + "�� å" + bt);
					}
					i++;
				}
				System.out.println("������ȣ �Է�");
				count = System.in.read(bytes);
				String ch2 = new String(bytes, 0, count - 2);
				int index = Integer.parseInt(ch2);
				System.out.println("��������");
				count = System.in.read(bytes);
				String oldStr = new String(bytes, 0, count - 2);

				// ������ ���� �Է¹ޱ�
				System.out.println("�ٲܹ���");
				count = System.in.read(bytes);
				String newStr = new String(bytes, 0, count - 2);

				book[index] = book[index].replace(oldStr, newStr);
				// ****** ������ �ٽ� ����� ����ȴ�
				System.out.println("����Ϸ�");

			}
		}
	}
}
