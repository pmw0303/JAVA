package ����;

import java.util.ArrayList;

public class Parking_date {

	private ArrayList<Parking_date> date_array = new ArrayList<>();
	
	private int ������ȣ;
	private int ������;
	private int ������;
	private int ������;
	private int ������;
	private int ������;
	private int ������ġ;
	private int �������;
	
	public Parking_date() {
		
	}
	
	public Parking_date(int ������ȣ) {
		this.������ȣ = ������ȣ;
	}
	
	public Parking_date(int ������ȣ, ArrayList<Parking_date> date_array) {
		this.������ȣ = ������ȣ;
		this.date_array = date_array;
	}
	
	public Parking_date(int car_num, int year, int month, int day, int hour, int min,int real_position) {
		
		this.������ȣ = car_num;
		this.������ = year;
		this.������ = month;
		this.������ = day;
		this.������ = hour;
		this.������ = min;
		this.������ġ = real_position;
	}

	public Parking_date(int ������ȣ, int ������, int ������, int ������, int ������, int ������, int ������ġ, int �������) {
		super();
		this.������ȣ = ������ȣ;
		this.������ = ������;
		this.������ = ������;
		this.������ = ������;
		this.������ = ������;
		this.������ = ������;
		this.������ġ = ������ġ;
		this.������� = �������;
	}

	public ArrayList<Parking_date> getDate_array() {
		return date_array;
	}

	public void setDate_array(ArrayList<Parking_date> date_array) {
		this.date_array = date_array;
	}

	public int get������ȣ() {
		return ������ȣ;
	}

	public void set������ȣ(int ������ȣ) {
		this.������ȣ = ������ȣ;
	}

	public int get������() {
		return ������;
	}

	public void set������(int ������) {
		this.������ = ������;
	}

	public int get������() {
		return ������;
	}

	public void set������(int ������) {
		this.������ = ������;
	}

	public int get������() {
		return ������;
	}

	public void set������(int ������) {
		this.������ = ������;
	}

	public int get������() {
		return ������;
	}

	public void set������(int ������) {
		this.������ = ������;
	}

	public int get������() {
		return ������;
	}

	public void set������(int ������) {
		this.������ = ������;
	}

	public int get������ġ() {
		return ������ġ;
	}

	public void set������ġ(int ������ġ) {
		this.������ġ = ������ġ;
	}

	public int get�������() {
		return �������;
	}

	public void set�������(int �������) {
		this.������� = �������;
	}
	
	
}
