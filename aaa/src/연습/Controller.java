package ����;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
		// ���� �ڵ� �ۼ�
			// �Է¹��� ������ȣ(�μ�) �ޱ�  *�ߺ�üũ
			// ������¥ ���ϱ�
			// ���� �ð� ���ϱ�
			// ���� �ð�/�ݾ� -> ���� ��
			// ������ȣ, ������¥, �����ð� -> 3������ ��üȭ
			// ���� ��ü -> �迭 / ����Ʈ ���ϱ�
			// ���� ó�� or DB ó��
			
		// ���� �ڵ� �ۼ�
			// �Է¹��� ������ȣ ��������
			// �迭 or ����Ʈ�� ������ ������ȣ�� ã��
			// �����ð�(����ð�) ���ϱ�
			// ��� [�����ð� - �����ð� = (��-30)/10 *1000
			// ã�� ��ü �� �����ð��� �ݾ��� ����
	
	// �迭 ��� 
//	public static Car[] carlist = new Car[100];
	// ����Ʈ
	public static ArrayList<Car> carlist = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);	
	static LocalDateTime now = LocalDateTime.now();
	static String cur1 = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	static String inTime = now.format(DateTimeFormatter.ofPattern("HH:mm"));
	static String outTime = now.format(DateTimeFormatter.ofPattern("HH:mm"));
	
	public static boolean In() {
		System.out.println("������ȣ �Է�"); String num = scanner.next();

		for(Car temp : carlist) {
			if(temp.getCarNum().equals(num)) {
				System.out.println("���� ��ȣ �ߺ�");
			}else {
				Car cars = new Car();
				carlist.add(cars);
			}
		}
		
		return false;
	}
	
	public static boolean Out() {
		
	
		return false;
	}
}
