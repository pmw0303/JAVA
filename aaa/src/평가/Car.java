package 평가;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Car {

	private String carNum;
	private String day;
	private String carIn;
	private String carOut;
	private String money;
	private LocalDateTime now;
	
	public Car() {}
	
	public Car(String carNum, LocalDateTime now) {
		super();
		this.carNum = carNum;
		this.day = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		this.carIn = now.format(DateTimeFormatter.ofPattern("HH:mm"));
		this.carOut = "주차 중";
		this.money = "정산 전";
		this.now = now;
	}

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
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

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public LocalDateTime getNow() {
		return now;
	}

	public void setNow(LocalDateTime now) {
		this.now = now;
	}
	
	
}
