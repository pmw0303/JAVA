package Day13;

import java.util.Calendar;
import java.util.Scanner;

public class Day_13_3_�޷� {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" ���� :"); int year = sc.nextInt();
		System.out.print(" �� :");	int month = sc.nextInt();
		
		�޷�(year, month);
	}
	
	public static void �޷�(int year, int month) {
		while(true) { // �������� 4��
			// Ķ���� Ŭ���� �� ���� ��¥/�ð� ��ü ȣ��
			Calendar cal = Calendar.getInstance();
			// ����, ��, ��
	//		int year = cal.get(Calendar.YEAR);
	//		int month = cal.get(Calendar.MONTH)+1;
//			int day = cal.get(Calendar.DAY_OF_MONTH);
//			// �ش� ���� 1���� ����ã��
//				// 1. ����� ���� Ķ���� ����
				cal.set(year, month-1, 1); // ��) 3�� 1��
				// 2. 3��1���� ����
				int sweek = cal.get(Calendar.DAY_OF_WEEK);
				// 3. 3���� ������ ��
				int eday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);		
				
			System.out.println("\t\t **** " + year + "��" + month + "�� **** " );
			System.out.println("��\t��\tȭ\t��\t��\t��\t��");
			
			// ���� �� 1���� ��ġ
			for(int i = 1 ; i < sweek ; i++) {
				System.out.print("\t");
			}
			// 1�Ϻ��� ������ ������ ���
			for(int i = 1 ; i <= eday ; i++) {
				System.out.print(i + "\t"); // i = �� ���
				// ����ϸ��� �ٹٲ�ó�� [ ���� 7��� ]
				if(sweek % 7 ==0 ) 
				System.out.println();
				sweek++;
				
			} //��ư
			try {
				System.out.println("\n\n [ 1.��(������)  2.��(������) 3.�ٽð˻� 4.����] \n\n");
				Scanner sc = new Scanner(System.in);
				int ch = sc.nextInt();		
				if(ch==1) {
					month -=1;
					if(month == 0) { year-=1; month = 12;}
				}else if(ch==2) {
					month +=1;
					if(month == 13) { month = 1; year+=1;}
				}else if(ch==3) {
					System.out.print(" ���� : "); year = sc.nextInt();
					System.out.print(" �� : "); month = sc.nextInt();
				}else if(ch==4) {
					System.out.println("����");
					break;
				}else 
					System.out.println("�߸��� ��ȣ");
			}catch(Exception e) {
				System.out.println("�߸��� �Է�");
			}
		} // while ��			
	} // �޷� ��
} // class ��
