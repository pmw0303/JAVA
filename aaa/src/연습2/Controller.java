package ����2;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import ����.Car;

public class Controller {

	public static ArrayList<Car> carlist = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	
	public static void In(String carNum) {
		int carcnt=0;
		if(carlist.isEmpty()) {
			LocalDateTime now = LocalDateTime.now();
			Car cars = new Car(carNum, now);
			carlist.add(cars);
			return;
		}
		for (Car temp : carlist) {
			if (temp.getCarNum().equals(carNum)) {
				if (temp.getCarOut().equals("���� ��")) {
					System.out.println("���� ��ȣ �ߺ�");
					return;

				} else {
					LocalDateTime now = LocalDateTime.now();
					Car cars = new Car(carNum, now);
					carlist.set(carcnt, cars);
					return;
				}
			}
			carcnt++;
		}
		LocalDateTime now = LocalDateTime.now();
		Car cars = new Car(carNum,now);
		carlist.add(cars);
	}
	
	public static void Out(String carNum) {
		if(carlist.isEmpty()) {
			LocalDateTime now = LocalDateTime.now();
			Car cars = new Car(carNum, now);
			carlist.add(cars);
			return;
		}
		for(Car temp : carlist) {
			if(!temp.getCarNum().equals("���� ��")) {
				System.out.println("�̹� ���� ó�� �Ǿ����ϴ�");
				return;
			}
			LocalDateTime now = LocalDateTime.now();
			LocalDateTime past = temp.getNow();
			Date nowdate = Timestamp.valueOf(now);
			Date pastdate = Timestamp.valueOf(past);
			int term = (int)(nowdate.getTime() - pastdate.getTime())/600000;
			// �и� ������ �̹Ƿ� /1000 - 10�� �� ������ �ð� /10 - ������ ���� /60 �� 60��������
			int money = (term -3)*1000; 
			if(money < 0) money=0;
			
			temp.setMoney(Integer.toString(money));
			temp.setCarOut(now.format(DateTimeFormatter.ofPattern("HH:mm")));
			return;
		}
		System.out.println("���� �����Դϴ�");
	}
}
