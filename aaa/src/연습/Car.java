package 연습;

import java.time.LocalDate;
import java.time.LocalTime;

public class Car {
	// 필드
	private String carNum;
	private LocalDate day;
	private LocalTime carIn;
	private LocalTime carOut;
	private int money;
	
	// 생성자
	public Car() {}

	public Car(LocalDate day, String carNum, LocalTime carIn, LocalTime carOut, int money) {
		super();
		this.day = day;
		this.carNum = carNum;
		this.carIn = carIn;
		this.carOut = carOut;
		this.money = money;
	}
	// 메소드
	public LocalDate getDay() {
		return day;
	}
	public void setDay(LocalDate day) {
		this.day = day;
	}
	public String getCarNum() {
		return carNum;
	}
	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}
	public LocalTime getCarIn() {
		return carIn;
	}
	public void setCarIn(LocalTime carIn) {
		this.carIn = carIn;
	}
	public LocalTime getCarOut() {
		return carOut;
	}
	public void setCarOut(LocalTime carOut) {
		this.carOut = carOut;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

	
}
