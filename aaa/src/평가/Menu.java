package ��;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		LocalDateTime now = LocalDateTime.now();
		String cur = now.format(DateTimeFormatter.ofPattern("yyyy - MM - dd  HH:mm"));
		
		while(true) {
			try {
				System.out.println("============================ ���� ��Ȳ ǥ ================================");
				System.out.println("\t\t\t"+cur); // �ð� ���
				System.out.println("  ��¥\t\t������ȣ\t\t�����ð�\t\t�����ð�\t\t�ݾ�");
				// �ݺ��� �Ἥ �������
				for(Car temp : Controller.carlist) {
					System.out.printf("  %s\t%s\t%s\t\t%s\t\t%s\n", temp.getDay(), temp.getCarNum(), temp.getCarIn(),
													temp.getCarOut(), temp.getMoney());
				}
				System.out.println("=======================================================================");
				
				System.out.println("\t\t\t1.����   2.����");
				int ch = scanner.nextInt();
				
				if(ch==1) {
					// ��ȣ �Է¹ޱ�
					System.out.println("���� ��ȣ �Է�");
					String carNum = scanner.next();
					Controller.In(carNum);
				}else if(ch==2) {
					// ��ȣ �Է¹ޱ�
					System.out.println("���� ��ȣ �Է�");
					String carNum = scanner.next();
					Controller.Out(carNum);
				}else {
					System.out.println("�߸��� ��ȣ�Դϴ�");
				}
				
			} catch (Exception e) {	}
		}
	}
}
