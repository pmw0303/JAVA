package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		boolean pass = true;
		int[] unum = new int[6];
		int[] lotton = new int[6];

		// 1. ����ڿ��� �Է¹ޱ�
		for (int i = 0; i < 6; i++) {
			System.out.print("1 ~ 45 ���� �Է� : ");
			int num = scanner.nextInt();

			

			if (num < 1 || num > 45) { // ��ȿ�� �˻�
				System.out.println("�˸�>> �߸��� ��ȣ �Դϴ�. �ٽ� �Է��� �ּ���. ");
				i--;
				pass = false;
			}
			// �ߺ�üũ
			for (int j = 0; j < 6; j++) {
				if (num == unum[j]) {

					System.out.println("�˸�>> �ٽ� �Է��� �ּ���. ");
					i--;
					pass = false;
				}
			}
			if (pass == true)
				unum[i] = num;

		}
		// ����� �迭�� ��� �ε��� ���
		for (int temp : unum) {

			System.out.print(temp + "\t");
		}
		System.out.println();

		// 2. �����Ͱ� ��������

		for (int k = 0; k < 6; k++) {

			int lotto = random.nextInt(45) + 1;
			for (int temp : lotton) {
				if (lotto == temp) {
					k--;
					pass = false;
				}
			}
			if(pass) lotton[k] = lotto;
		}System.out.print("\n");
		for(int temp : lotton) {
			System.out.print(temp+ "\t");
		}
		
		
//		// 3. �� �迭���� ������ �� ã��
//		// �ϳ� �����ؼ� �� ��
//		
		int same = 0;
//		for(int i=0; i <unum.length ; i++) {
//			for(int j=0; j<lotton.length ; j++) {
//				
//				if(unum[i] == lotton[j]) {
////					����� �迭 �� i��° �ε�����
////					��ǻ�� �迪 �� j��° �ε��� �����ϸ�
//					same++;
//					
//				}
//			}
//			
//		}
		
		// 3-2
			
		for(int �񱳱��� : unum) { //����ڹ�ȣ �迪 �� �ϳ��� �񱳱��� ����
			for(int �񱳴�� : lotton) { //��÷��ȣ �迭 �� �ϳ��� �񱳴�� ����
				if(�񱳱��� == �񱳴��)
					same++;
			}
		}
		
		
		System.out.println("\n������ �� : " + same);

	}
}
