package ����������;

import java.util.Random;
import java.util.Scanner;

public class Building {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Elevator e = new Elevator(1);

		System.out.println("----------------");
		System.out.print("���� �� �Է� : ");
		int now = sc.nextInt();
		
		boolean arrive = false;
		while(true) {
			if(now > 20 || now < 0) {
				System.out.println("�߸��� ���� �Է�");
				
			}else if(now > 0) {
				if(e.floor < now) {
					System.out.println(e.floor + "���Դϴ�");
					e.floor ++;
					if(e.floor == now)
					System.out.println("�����߽��ϴ�"); arrive = true;
				}else if(e.floor > now) {
					System.out.println(e.floor + "���Դϴ�");
					e.floor --;
					if(e.floor == now)
					System.out.println("�����߽��ϴ�"); arrive = true;
				}
			}else if(now < 20) {
				
			}else if(now == e.floor) {
				
			}
		}
		
	}
}
