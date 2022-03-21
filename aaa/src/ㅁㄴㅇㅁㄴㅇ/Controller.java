package けいしけいし;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Controller {

	// 託勲 舛左 軒什闘
	public static ArrayList<Car> carlist = new ArrayList<>();

	public static void carIn(String carNum, int parkNum, String year, String month, String day, String hour, String min) {
		
		Car car = new Car(carNum, (int)parkNum, year, month, day, hour, min);
		carlist.add(car);
		save();
	}

	public static void save() { // 託 脊径 舛左 隔奄
		try {
			FileOutputStream output = new FileOutputStream("D:/java/car.txt");
			for (Car car : carlist) {
				String content = car.getCarNum() + " ," + car.getParkNum() + " ," + car.getYear() + " ,"
						+ car.getMonth() + " ," + car.getDay() + " ," 
						+ car.getHour() + " ," + car.getMin() + "\n";

				output.write(content.getBytes());
			}
		} catch (Exception e) {
			System.out.println("硝顕>> 督析 煽舌 叔鳶");
		}
	}
	
	public static void load() { // 託 脊径舛左 災君神奄
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
			System.out.println("硝顕>> 督析 災君神奄 叔鳶");
		}
	}
}
