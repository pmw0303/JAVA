package zzzz;

public class Student {

	String name;
	int kor, eng, mat;
	int sum = kor+ eng+ mat;
	int rank;
	
	public Student() {
		
	}
	
	
	
	public Student(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
	}
	
	
	public Student(String name, int kor, int eng, int mat, int sum, int rank) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.sum = sum;
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getSum() {
		return kor + eng + mat;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}



	public int getRank() {
		return rank;
	}



	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
	
}
