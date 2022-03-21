package zzzz;

import java.util.ArrayList;

public class Car {
	ArrayList<Car> carlist = new ArrayList<Car>();
	String carNum;
	String carIn;
	String carOut;
	String parkArea;
	int money;
	
	public Car() {} 
	
	public Car(String carNum, String parkArea) {
		this.carNum = carNum;
		this.parkArea = parkArea;
	}
	
	public Car(String carNum, String carIn, String carOut, String parkArea, int money) {
		super();
		this.carNum = carNum;
		this.carIn = carIn;
		this.carOut = carOut;
		this.parkArea = parkArea;
		this.money = money;
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

	public String getParkArea() {
		return parkArea;
	}

	public void setParkArea(String parkArea) {
		this.parkArea = parkArea;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}
