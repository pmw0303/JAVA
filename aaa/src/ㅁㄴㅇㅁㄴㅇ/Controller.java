package ������������;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Controller {

	// ���� ���� ����Ʈ
	public static ArrayList<Car> carlist = new ArrayList<>();

	public static void carIn(String carNum, int parkNum, String year, String month, String day, String hour, String min) {
		
		Car car = new Car(carNum, (int)parkNum, year, month, day, hour, min);
		carlist.add(car);
		save();
	}

	public static void save() { // �� �Է� ���� �ֱ�
		try {
			FileOutputStream output = new FileOutputStream("D:/java/car.txt");
			for (Car car : carlist) {
				String content = car.getCarNum() + " ," + car.getParkNum() + " ," + car.getYear() + " ,"
						+ car.getMonth() + " ," + car.getDay() + " ," 
						+ car.getHour() + " ," + car.getMin() + "\n";

				output.write(content.getBytes());
			}
		} catch (Exception e) {
			System.out.println("�˸�>> ���� ���� ����");
		}
	}
	
	public static void load() { // �� �Է����� �ҷ�����
		try {
			FileInputStream input = new FileInputStream("D:/java/car.txt");
			byte[] bytes = new byte[1000];
			input.read(bytes);
			String file = new String(bytes);
			String[] carlist2 = file.split(" ,");
			
			int i=0;
			for(String temp : carlist2) {
				if(i+1 == carlist2.length) break;
				String[] field = temp.split(" ,");
				Car car = new Car(field[0], Integer.parseInt(field[1]), field[2], field[3], field[4],
									field[5], field[6]);
				
				carlist.add(car);
			}
			
		}catch(Exception e) {
			System.out.println("�˸�>> ���� �ҷ����� ����");
		}
	}
}
