package ex05;

class Score {
	// 생성자 , Getter/Setter, toString 만들어서 작업
	// 모든 Field 는 private 
	// Field 입력 : num, name, kor, eng, mat
	// Field 출력 : num, name, kor, eng, mat, tot, avg , grade
	private int num;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	private String grade;

//Constructor

	public Score(int num, String name, int kor, int eng, int mat) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		getTot();
		getAverage();
		getGrade();
	}//public score

//get 구하기
	private void getTot() {
		this.tot = this.kor + this.eng + this.mat;
	}
	private void getAverage() {
		this.avg = this.tot / 3.0;
	}
	private void getGrade() {
		this.grade = "";
		if (this.avg >= 90 )
			this.grade = "A";
		else if (this.avg >= 80)
			this.grade = "B";
		else if (this.avg >= 70)
			this.grade = "C";
		else if (this.avg >= 60)
			this.grade = "D";
		else
			this.grade = "F";
	}

public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
		getTot();
		getAverage();
		getGrade();
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		getTot();
		getAverage();
		getGrade();
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
		getTot();
		getAverage();
		getGrade();
	}
	public double getAvg() {
			return avg;
		}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

// to String
	@Override
	public String toString() {
		return "Score [num=" + num + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ","
				+ " tot="+ tot + ", avg=" + avg + ", grade=" + grade + "]";
	}
	
	static void title() {
		String title = "번호, 이름, 국어, 영어 ,수학, 총점, 평균, 등급";
		System.out.println(title);
	}
	void display() {
		String fmt ="%d %s %d %d %d %d %.2f %s";
		System.out.printf(fmt, num,name,kor, eng, mat, tot, avg, grade);
	}


	
}//class



public class TestScore {

	public static void main(String[] args) {
		
		Score.title();
		Score sc1 = new Score (1,"사나",70,80,90);
		sc1.setKor(10);
		sc1.setEng(11);
		sc1.setMat(12);
		System.out.println(sc1);
		Score sc2 = new Score (2,"모모",0,70,100);
		sc2.setKor(30);
		sc2.setEng(31);
		sc2.setMat(32);
		System.out.println(sc2);
		Score sc3 = new Score (3,"쯔위",70,90,90);
		sc3.setKor(50);
		sc3.setEng(51);
		sc3.setMat(52);
		System.out.println(sc3);
		Score sc4 = new Score (4,"정연",80,90,70);	
		sc4.setKor(70);
		sc4.setEng(71);
		sc4.setMat(72);
		System.out.println(sc4);
		Score sc5 = new Score (5,"원영",90,90,89);
		sc5.setKor(80);
		sc5.setEng(81);
		sc5.setMat(82);
		System.out.println(sc5);
		Score sc6 = new Score (6,"유진",100,100,100);
		sc6.setKor(90);
		sc6.setEng(91);
		sc6.setMat(92);
		System.out.println(sc6);

	}//main

}//class
