package Day19;

import java.util.HashSet;
import java.util.Scanner;

public class Day19_2 {
	
	// set �ߺ� �Ұ���
		// ��ü �� ��� �ʵ尡 �����ϸ� �ߺ� �Ұ���*
	
	public static void main(String[] args) {
		
		// �ζ� ���α׷� **set �÷���
		
		Scanner scanner = new Scanner(System.in); // 1. �Է°�ü
		HashSet<Integer> set = new HashSet<>(); // 2. set �÷��� HashSet Ŭ���� ��ü ����
		
		while(true) { // ���ѷ��� [�������� : set ��ü �� ��ü���� 6�̸� break]
			System.out.println("1 ~ 45 ���� ����(�ߺ� �Ұ�)");
			int num = scanner.nextInt();
			
			if(num < 1 || num >45) { // 1~45 ���� ���ڴ� �Ұ�
				System.err.println("������ �Ұ��� ��ȣ�Դϴ�");
			}else {
				set.add(num);
				System.out.println("���ù�ȣ : " + set);
			}
			if(set.size() == 6) {
				break;
			}
			
		}
	}
}
