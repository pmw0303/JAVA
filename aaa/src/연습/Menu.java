package ����;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
//	ArrayList<Car> carlist = new ArrayList<>();
	LocalDateTime now = LocalDateTime.now();
	String cur = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd   HH : mm"));	
		while(true) {
			// ��� ���� ���
				// �迭 or ����Ʈ�� ��� ��ü ��� �ݺ���
			System.out.println("================================ ���� ���� ====================================");
			System.out.println("\t\t\t����ð� : " + cur);
			System.out.println("  ��¥\t\t������ȣ\t\t����\t\t����\t\t�ݾ�");
			for(Car temp : Controller.carlist) {
				System.out.printf("  %s\t%s\t\t%s\t\t%s\t\t%s\n", temp.getDay(), temp.getCarNum(), 
						temp.getCarIn(), temp.getCarOut(), temp.getMoney());
			}
			System.out.println("=============================================================================");
			System.out.println("\t\t\t1.����\t\t2.����");
			int ch = scanner.nextInt();
			try {
				if(ch==1) {
					// ������ȣ �ޱ�
					System.out.println("���� ��ȣ �Է�");
					String carNum = scanner.next();
					// �Է¹��� ��ȣ�� ��Ʈ�ѷ� �޼ҵ忡 �ѱ�
					
					// �޼ҵ� ����� ���� ���
					Controller.In(carNum);
					
				}else if(ch==2) {
					// ������ȣ �ޱ�
					System.out.println("���� ��ȣ �Է�");
					String carNum = scanner.next();
					// �Է¹��� ��ȣ�� ��Ʈ�ѷ� �޼ҵ忡 �ѱ�
					// �޼ҵ� ����� ���� ���
					Controller.Out(carNum);
					
				}else {
					System.out.println("�ٽô�����");
				}
			} catch (Exception e) {
				
			}
		}
		
	}
}
