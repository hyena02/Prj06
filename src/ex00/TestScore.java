package ex00;

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
	public Score() {}
	public Score(int num, String name, int kor, int eng, int mat) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		this.tot = getTot();
		this.avg = getAvg();
	}
	
// method : Getter
	public int getNum() {
		return this.num;
	}
	public String getName() {
		return this.name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMat() {
		return mat;
	}
	public int getTot() {
		return kor + eng+ mat;
	}
	public double getAvg() {
		return getTot()/3.0;
	}
	public String getGrade() {
		return grade;
	}
// method : Setter	
	public void setNum(int num) {
		this.num = num;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}

	
	
// toString
	@Override
	public String toString() {
		return "Score [num=" + num + ", name=" + name + ", kor=" + kor + ", eng=" + eng + 
				", mat=" + mat + ", tot=" + tot + ", avg=" + avg + ", grade=" + grade + "]";
	}
	public void calc() {
		this.tot = getTot();
		this.avg = getAvg();
		this.grade = getGrade();
	}
	
}//class

public class TestScore {

	public static void main(String[] args) {
		
		
		Score sc1 = new Score (1,"사나",70,80,90);
		System.out.println( sc1.toString() );
		System.out.println( "번호 : " + sc1.getNum() ); 
		System.out.println( "이름 : " + sc1.getName() ); 
		System.out.println( "총점 : " + sc1.getTot() ); 
		System.out.println( "평균 : " + sc1.getAvg() ); 

		Score sc2 = new Score (2,"모모",0,70,100);
		sc2.setNum(2);
		sc2.setName("모모");
		sc2.setKor(100);
		sc2.setEng(97);
		sc2.setMat(100);
		sc2.calc();
		System.out.println( sc2.toString() );
		System.out.println( "번호 : " + sc2.getNum() ); 
		System.out.println( "이름 : " + sc2.getName() ); 
		System.out.println( "총점 : " + sc2.getTot() ); 
		System.out.println( "평균 : " + sc2.getAvg() ); 
		
		Score sc3 = new Score (3,"쯔위",70,90,90);
		Score sc4 = new Score (4,"정연",80,90,70);
		Score sc5 = new Score (5,"원영",90,90,89);
		Score sc6 = new Score (6,"유진",100,100,100);
		
	}
}
