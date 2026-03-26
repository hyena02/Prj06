package ex01;
/*
num,name,kor,eng,mat
번호,이름,국어,영어,수학
1,사나,70,80,90
2,모모,0,70,100
3,쯔위,70,90,90
4,정연,80,90,70
5,원영,90,90,89
6,유진,100,100,100
*/

class Score {

	// Field : 클래스 안에 선언된 변수 (입력 : num,name,kor, eng, mat)
	int num;
	String name;
	int kor;
	int eng;
	int mat;

	// Field (출력 : num,name,kor, eng, mat, tot, avg , grade)
	int tot;
	double avg;
	char grade;

	// Constructor : 생성자 - new 할 때 실행되는 초기명령들 ( Alt+Shift+S ) /Generate Constructor
	// using Fields
	public Score(int num, String name, int kor, int eng, int mat) { // <- 지역변수임 (파라메타 변수는 지역변수랑 동일)
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

		// 계산(생성자는 값 받으면서 계산까지 하게한다 )
		getTot();
		getAverage();
		getGrade();
	}//public
// grade 구하기(1) : switch 문
	private void getGrade() {
		int v = (int) this.avg / 10;
		switch( v ) {
		case 10 : this.grade = 'A'; // 둘다 'A'라서 break 안써도대
		case 9 	: this.grade = 'A'; break;
		case 8 	: this.grade = 'B'; break;
		case 7 	: this.grade = 'C'; break;
		case 6 	: this.grade = 'D'; break;
		default : this.grade = 'F'; break;
		}
	}

	private void getTot() { // void 로 바꾸면 return 안해도 되긴해
		this.tot = this.kor + this.eng + this.mat; // 모든 field 변수는 this.
	}

	private void getAverage() {
//		this.avg = (this.kor + this.eng + this.mat) / 3.0;
		this.avg = this.tot / 3.0;
	}
//ctrl + shift + p : 대응하는 {}를 찾아준다
// grade 구하기(2) : if 문
/*	private void getGrade() {
		this.grade = ' ';
		if (this.avg >= 90) {
			this.grade = 'A';
		} else if (this.avg >= 80) {
			this.grade = 'B';
		} else if (this.avg >= 70) {
			this.grade = 'C';
		} else if (this.avg >= 60) {
			this.grade = 'D';
		} else
			this.grade = 'F';
	}//getGrade
*/
	
//		
//	static void title() {
//		String title = "번호 이름 국어 영어 수학 총점 평균 등급";
//		System.out.println(title);
//	}//title
	static void title () {
		System.out.printf("%1s %4s %4s %4s %4s %4s %6s %4s\n",
				"번호","이름","국어","영어","수학","총점","평균","등급");
		
	}
	
	// Method
	void disp() {
		String fmt = "%-4d %4s %6d %6d %6d %6d %8.2f  %3c\n"; // 소수점-1자리:%.1f , 2자리:%.2f
		System.out.printf(fmt, num, name, kor, eng, mat, tot, avg, grade);

	}//disp
}//class

public class TestScore {

	public static void main(String[] args) {
//		Score sc1 = new Score(); ->  [X]			Score sc1 = new Score(int n, String na, int k, int e, int m );  -> [O]
//Error : The constructor Score() is undefined 
//기본 생성자가 없고, 인자있는 생성자가 있다 -> 인자있는 생성자만 존재하면 new Score(); 

		Score.title(); // score.title -> f2 -> change to static

		Score sc1 = new Score(1,"사나", 70, 80, 90);
		sc1.disp();

		Score sc2 = new Score(2,"모모", 0, 70, 100);
		sc2.disp();
		Score sc3 = new Score(3,"쯔위",70,90,90);
		sc3.disp();
		Score sc4 = new Score(4,"정연",80,90,70);
		sc4.disp();
		Score sc5 = new Score(5,"원영",90,90,89);
		sc5.disp();
		Score sc6 = new Score(6,"유진",100,100,100);
		sc6.disp();

	}//main
}//class
