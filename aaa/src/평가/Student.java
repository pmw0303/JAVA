package Æò°¡;

public class Student extends Grade {

	String name;
	int kor;
	int eng;
	int math;

	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getkor() {
		return kor;
	}

	public void setkor(int kor) {
		this.kor = kor;
	}

	public int geteng() {
		return eng;
	}

	public void seteng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int gettotal() {
		return kor + eng + math;
	}

	public double getAvg() {
		double avg = (kor+eng+math)/3;		
		return avg;
	}

}
