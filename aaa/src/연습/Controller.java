package ����;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.sql.Timestamp;

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
//	static LocalDateTime now = LocalDateTime.now();
	
	public static void In(String carNum) {
		int carcount = 0;
		if(carlist.isEmpty()) {
			LocalDateTime now = LocalDateTime.now();
			Car cars = new Car(carNum,now);
			carlist.add(cars);
			return;
		}
		for(Car temp : carlist) {
			if(temp.getCarNum().equals(carNum)) {
				if(temp.getCarOut().equals("���� ��")) {
					System.out.println("���� ��ȣ �ߺ�");
					return;
				}else {
					LocalDateTime now = LocalDateTime.now();
					Car cars = new Car(carNum,now);
					carlist.set(carcount, cars);
					return;	
				}
			}
			carcount++;
		}
		LocalDateTime now = LocalDateTime.now();
		Car cars = new Car(carNum,now);
		carlist.add(cars);
	}
	
	public static void Out(String carNum) {
		if(carlist.isEmpty()) {
			System.out.println("������ ����ֽ��ϴ�.");
			return;
		}

		for(Car temp : carlist) {
			if(temp.getCarNum().equals(carNum)) {
				if(!temp.getCarOut().equals("���� ��")){
					System.out.println("�̹� ���� ó�� �� �����Դϴ�.");
					return;
				}
				LocalDateTime now = LocalDateTime.now();
				LocalDateTime past = temp.getNow();
				Date nowdate =Timestamp.valueOf(now); //����
				Date pastdate =Timestamp.valueOf(past); //����
				int term = (int)((nowdate.getTime()- pastdate.getTime())/600000);
				int money = (term-3) * 1000;
				if(money<0) {
					money = 0;
				}
				temp.setMoney(Integer.toString(money));
				temp.setCarOut(now.format(DateTimeFormatter.ofPattern("HH:mm")));
				return;
			}
		}
		System.out.println("���� �����Դϴ�.");
	
	}
}
