package Day02;

import java.util.Scanner;

public class Day02_3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*System.out.print("�⺻�� : ");
		int pay = scanner.nextInt();
		System.out.print("���� : ");
		int plus = scanner.nextInt();
		
		int real = (int) (pay + plus - (pay*0.1));
		
		System.out.printf("�� ���ɾ� : %s",real);*/
		//-----------------------------------------
		
		System.out.print("�ݾ� �Է� : ");
		int money = scanner.nextInt();
		
		System.out.println("�ʸ����� : " + money/100000);
		money -= (money/100000) * 100000;
		System.out.println("������ : " + money/10000);
		money -= (money/10000) * 10000;
		System.out.println("õ���� : " + money/1000);
		money -= (money/1000) * 1000;
		System.out.println("��� �� : " + money/100);
		
	}

}
