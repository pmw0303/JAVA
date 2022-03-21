package けいしけいし;

public class Car {
	
	 String carNum;
	 int parkNum;
	 String year;
	 String month;
	 String day; 
	 String hour;
	 String min;
	 
	 
	public Car() {}


	public Car(String carNum, int parkNum, String year, String month, String day, String hour, String min) {
		super();
		this.carNum = carNum;
		this.parkNum = parkNum;
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.min = min;
	}


	public String getCarNum() {
		return carNum;
	}


	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}


	public int getParkNum() {
		return parkNum;
	}


	public void setParkNum(int parkNum) {
		this.parkNum = parkNum;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public String getMonth() {
		return month;
	}


	public void setMonth(String month) {
		this.month = month;
	}


	public String getDay() {
		return day;
	}


	public void setDay(String day) {
		this.day = day;
	}


	public String getHour() {
		return hour;
	}


	public void setHour(String hour) {
		this.hour = hour;
	}


	public String getMin() {
		return min;
	}


	public void setMin(String min) {
		this.min = min;
	}
	 
	

	

}
