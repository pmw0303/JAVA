package Day18;

import java.util.ArrayList;
import java.util.Scanner;

public class Day18_4 {

	public static void main(String[] args) {
		// ����� ���α׷�
			// �޴� : [��] 1.����߰� 2.������ [������] 3.���������
				// ����߰� : �ο����� �Է¹޾� ����ȣ ��ȯ
				// ������ : ����ȣ �Է¹޾� ��� ���
				// ����� ���� : ù��° ������� ����ȣ ȣ��
		
		Scanner scanner = new Scanner(System.in);
		
		int ����ȣ=0; // ���� ����ȣ
		ArrayList<���> ����� = new ArrayList<>();
		// ���� ���� ��� ��ü�� ������ �� �ִ� ����Ʈ ����
		
		while(true) {
			System.out.println("����ȣ\t�ο���\t���ð�[��]");
			for(��� temp : �����) {
				if (�����.indexOf(temp)==0) {
					System.out.println(temp.����ȣ + "\t" + temp.�ο��� + "\t����" );
				}else {
					System.out.println(temp.����ȣ + "\t" + temp.�ο��� + "\t" + �����.indexOf(temp) * 10);
				}
			}
			System.out.println("[��] 1.����߰� 2.������ [������] 3.����� ����");
			int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println("��ȭ��ȣ"); String ��ȭ��ȣ = scanner.next();
				System.out.println("�ο���"); int �ο��� = scanner.nextInt();
				// 3�� ���� -> 1�� ��üȭ
				��� temp = new ���(����ȣ, ��ȭ��ȣ, �ο���);
				// ��� �ο����� ����Ʈ�� ����
				�����.add(temp);
				����ȣ ++;// ����� ����
				
			}else if(ch==2) {
				System.out.println("����ȣ"); int ��������ȣ = scanner.nextInt();
				// ����Ʈ �� ��ü �ʵ� ����
				for(��� temp : �����) {
					if(temp.����ȣ == ��������ȣ) {
						�����.remove(temp);
						break; 
						// ��� ��� ����Ʈ���� �ϳ��� ȣ���ϴµ�, �Է¹��� ��ȣ�� temp�� ����ȣ�� ������ ����
					}
				}
			}else if(ch==3) {
				try {
					System.out.println("ù ��° ����� ����"); �����.remove(0); // 0��° �ε��� ����
				} catch (Exception e) {
					System.out.println("��� ����� �����ϴ�");
				}		
			}else {
				
			}
		}
	}
}
