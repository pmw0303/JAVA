package Day12;

import java.util.Random;
import java.util.Scanner;

public class Day12_4 {
	
	// ������ȣ ���� ���α׷�
	// ����
//		1. ���� 0000-9999 ���̿� ���� 10�� �����ؼ� �迭�� ����
//		2. ��� ���� ��ȣ�� �迭�� ����
//		3. ���ڸ� ��ȣ�� Ȧ/¦ ����
//		4. ���� ���ڸ��� Ȧ���� ���� / ¦���� ���� ���

	public static void main(String[] args) {
//		Random random = new Random();
//		int[] carN = new int[10];
//
//		for (int i = 0; i < carN.length; i++) {
//			carN[i] = random.nextInt(10000);
//		}
//
//		for(int j=0; j< carN.length ; j++) {
//			if(carN[j]%2 == 0) {
//				System.out.print(carN[j]+ "¦" + " ");
//			}else if(carN[j]%2 != 0) {
//				System.out.print(carN[j] + "Ȧ" + " ");
//			}
//			
//			
//		} Ȧ¦ 0 ~ 9999 ���� �迭�� �����ؼ� Ȧ¦ ���л̱� 
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();	
		String[] carlist = new String[10];
		String[] evenlist = new String[10];
		String[] oddlist = new String[10];
			
		while(true) {
			System.out.println("\n *** �������� ��� ���� ��ȣ ***");
			for(String temp : carlist) {
				if(temp != null) { 
					if(Integer.parseInt(temp) % 2 ==0) {
						System.out.println(temp + "[¦]  ");
						for(int i=0 ; i<evenlist.length ; i++) {
							evenlist[i] = temp;
							break;
						}
					}else System.out.println(temp + "[Ȧ]  ");
				}
			}
			// Ȧ������
			System.out.println("\n *** Ȧ�� ���� ***");
			// ¦������
			System.out.println("\n *** ¦�� ���� ***");
			
			System.out.println("1.��������");
			int ch = sc.nextInt();
			if(ch==1) {			
				int intnum = rd.nextInt(10000);
				String strnum = String.format("%04d", intnum);
											
				boolean save= false;
				for(int i=0; i<carlist.length; i++) {
					if(carlist[i] == null) {
						carlist[i] = strnum;
						save = true;
						break;
					}
				}
				if(save==false ) System.err.println("�����Ұ�");
			}
		}		
	}
}
