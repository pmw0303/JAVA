package ����2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ����.Car;
import ����.Controller;

public class View {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LocalDateTime now = LocalDateTime.now();
		String cur = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd   HH : mm"));
		
		while(true) {
			
			System.out.println("================================ ���� ���� ====================================");
			System.out.println("\t\t\t����ð� : " + cur);
			System.out.println("  ��¥\t\t������ȣ\t\t����\t\t����\t\t�ݾ�");
			// �ݺ��� ���
			for(Car temp : Controller.carlist) {
				System.out.printf("  %s\t%s\t\t%s\t\t%s\t\t%s\n", temp.getDay(), temp.getCarNum(), 
						temp.getCarIn(), temp.getCarOut(), temp.getMoney());
			}		
			System.out.println("============================================================================");
			System.out.println("\t\t\t1.���� \t\t2.����");
			int ch = scanner.nextInt();
			try {
				if(ch==1) {
					System.out.println("���� ��ȣ �Է�");
					String carNum = scanner.next();
					Controller.In(carNum);
					
				}else if(ch==2) {
					System.out.println("���� ��ȣ �Է�");
					String carNum = scanner.next();
					Controller.Out(carNum);
					
				}else {
					System.out.println("�ٽ� �Է����ּ���");
				}
			} catch (Exception e) {
				
			}
		}
	}
}
