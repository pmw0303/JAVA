package ����;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	ArrayList<Car> carlist = new ArrayList<>();
	LocalDateTime now = LocalDateTime.now();
	String cur = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd   HH : mm"));
	String cur1 = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	String inTime = now.format(DateTimeFormatter.ofPattern("HH:mm"));
	String outTime = now.format(DateTimeFormatter.ofPattern("HH:mm"));
	
	
		while(true) {
			// ��� ���� ���
				// �迭 or ����Ʈ�� ��� ��ü ��� �ݺ���
			System.out.println("================================ ���� ���� ====================================");
			System.out.println("\t\t\t����ð� : " + cur);
			System.out.println("\t��¥\t\t������ȣ\t\t����\t\t����\t\t�ݾ�");
			int i=0;
			for(Car temp : carlist) {
				System.out.printf("\t%s\t\t%s\t\t%s\t\t%s\t\t%d\n", carlist.get(i).getDay(), carlist.get(i).getCarNum(), 
						carlist.get(i).getCarIn(), carlist.get(i).getCarOut(), carlist.get(i).getMoney());
			}
			System.out.println("=============================================================================");
			System.out.println("\t\t\t1.����\t\t2.����");
			int ch = scanner.nextInt();
			try {
				if(ch==1) {
					// ������ȣ �ޱ�

					// �Է¹��� ��ȣ�� ��Ʈ�ѷ� �޼ҵ忡 �ѱ�
					
					// �޼ҵ� ����� ���� ���
					boolean result = Controller.In();
					
				}else if(ch==2) {
					// ������ȣ �ޱ�
					System.out.println("���� ��ȣ �Է�");
					String num = scanner.next();
					// �Է¹��� ��ȣ�� ��Ʈ�ѷ� �޼ҵ忡 �ѱ�
					// �޼ҵ� ����� ���� ���
					boolean result = Controller.Out();
				}
			} catch (Exception e) {
				
			}
		}
		
	}
}
