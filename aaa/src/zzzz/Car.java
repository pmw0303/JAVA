package zzzz;

import java.util.ArrayList;

public class Car {
	ArrayList<Car> carlist = new ArrayList<Car>();
	String carNum;
	String carIn;
	String carOut;
	String day;
	int money;
	
	public Car() {} 
	
	public Car(String carNum) {
		this.carNum = carNum;	
	}
	
	public Car(String day, String carNum, String carIn, String carOut, int money) {
		super();
		this.day = day;
		this.carNum = carNum;
		this.carIn = carIn;
		this.carOut = carOut;
		this.money = money;
	}

	public Car(ArrayList<Car> carlist, String carNum, String carIn, String carOut, int money, String day) {
		super();
		this.carlist = carlist;
		this.carNum = carNum;
		this.carIn = carIn;
		this.carOut = carOut;
		this.money = money;
		this.day = day;
	}
	
	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public String getCarIn() {
		return carIn;
	}

	public void setCarIn(String carIn) {
		this.carIn = carIn;
	}

	public String getCarOut() {
		return carOut;
	}

	public void setCarOut(String carOut) {
		this.carOut = carOut;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
	
}
