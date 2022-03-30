package 연습;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Car {
	// 필드
	private String carNum;
	private LocalDateTime now;
	private String day;
	private String carIn;
	private String carOut;
	private String money;

	
	// 생성자
	public Car() {}

	
	public Car(String carNum, LocalDateTime now) {
		super();
		this.carNum = carNum;
		this.now = now;
		this.day = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		this.carIn = now.format(DateTimeFormatter.ofPattern("HH:mm"));
		this.carOut = "주차 중";
		this.money = "정산 전";
	}

	public String getCarNum() {
		return carNum;
	}

	public LocalDateTime getNow() {
		return now;
	}

	public void setNow(LocalDateTime now) {
		this.now = now;
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
	
}
