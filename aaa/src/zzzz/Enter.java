package zzzz;

import java.util.ArrayList;
import java.util.Scanner;

public class Enter {
	ArrayList<Car> carlist = new ArrayList<Car>();
	
	void in(Scanner scanner) {
		String carNum;
		String parkArea;
		
		try {
			System.out.println("���� ��ȣ �Է�"); carNum =  scanner.next();
			System.out.println("���� ��ġ �Է�"); parkArea = scanner.next();
			for(Car temp : carlist) {
				if(carNum == temp.getCarNum() && parkArea == temp.getParkArea()) {
					System.out.println("�̹� ������ �Ǿ��ֽ��ϴ�");
				}else {
					System.out.println("�����Ǿ����ϴ�");
					// �ð� ��� �ֱ�
					Car car = new Car(carNum, parkArea);
					carlist.add(car);
				}
			}
		} catch (Exception e) {
			
		}
	}
	
	
}
