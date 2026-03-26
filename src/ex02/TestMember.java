package ex02;

import java.util.Objects;

class Member {

//Field
	int id;
	String name;

//Constructor
//기본 생성자 	  - m1
	public Member() {
	}

//인자있는 생성자 - m2
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}

//Method
	void disp() {
		System.out.println(id + " " + name);
	}
/*
// Method
// @Override - annotation/ 컴파일러에게 알려주는 기능/ method 이름, 매개변수, return type, 접근 제어자 (더넓거나) 같아야함
// 새로 만든 equals () <- Object 를 재정의한 것이 아니다.
//Error - 	@Override -> 파라메타 다름(method 에 전달되는 값 다름)  

	boolean equals(Member m3) {
		boolean result = false;

		if (this.id == m3.id) {
			if ( this.name.equals(m3.name) ) {
				result = true;
			}
		}
		
		return result;
	}// boolean
*/

	@Override								//alt+shift+s -> Generate hashCode() and equals() 
	public int hashCode() {
		return Objects.hash(id, name);
	}

// Object 의 equals() 를 재정의 하는 문법
	@Override
	public boolean equals(Object obj) {  	// Object : 모든 객체 다 받을 수 있음 => 모든 객체를 다 비교할 수 있게 한다 (Java 에서는 모든클래스다 Object 를 부모로 가지고 있음 )
		if (this == obj)
			return true;				// 같은 객체면 바로 끝.
		if (obj == null)
			return false;				// null 이면 비교 불가.
		if (getClass() != obj.getClass())
			return false;				// type 이 다르면 비교 안함.
		Member other = (Member) obj;	// 형변환 => object 를 Member 로 생각하고 비교하려고 꺼내는 과정
		return id == other.id && Objects.equals(name, other.name); 
	}									// id 가 같고, name 이 같으면 => 같은 객체라고 판단
	
	
// 객체 상태를 확인할 때 (디버깅 할 때 편함)
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}




}// class

public class TestMember {

	public static void main(String[] args) {
		Member m1 = new Member(); 			// 생성자 하나라도 만들면 강제로 만들어야햄
		m1.id = 1;
		m1.name = "단종";
		m1.disp();																// hashCode = 10진수
		System.out.println(m1);			   // ex02.Member@18b4aac2  = class 이름 + hashCode (16진수의 형태인 hashCode)
		System.out.println(m1.toString()); // ex02.Member@18b4aac2

		Member m2 = new Member(2, "엄홍도");
		m2.disp();
		System.out.println(m2); 			// ex02.Member@764c12b6 (m1, m2 다른객체이다~~)
		System.out.println(m2.toString());  // ex02.Member@764c12b6

		System.out.println(m1 == m2); // false

		Member m3 = new Member(1, "단종");
		System.out.println(m3); // ex02.Member@c387f44

// 객체 비교 - 주소 비교하는 방법 : ==	, (m1.equals(m3))	
		System.out.println(m1 == m3); 		// false (m1, m3 다른 객체라서 이잉..)
// 객체 비교 - 내용 비교하는 방법 : equals
//								  : m1.equals(m3) -> 기능을 수정하여야 한다
		System.out.println(m1.equals(m3));	 // false ->override => true

	}// main
}// class