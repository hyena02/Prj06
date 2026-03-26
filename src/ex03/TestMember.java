package ex03;

class Member {
//Field
	int		  id;
	String	name;
	String email;


//Constructor
	public Member () {}
	public Member (String msg ) {
		System.out.println(msg + "객체 생성1");
	}
	
	public Member(int id, String name, String email) {
		this(); 		//기본 생성자 Member() 호출하였다	this : 나 자신
	  //super();		// super : 부모 클래스 -> parent	// super() : 부모클래스 기본 생성자를 호출하는 뜻
		this.id = id;
		this.name = name;
		this.email = email;

	}
//Override methods
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
}// class
	

public class TestMember {

	public static void main(String[] args) {
		Member m1 = new Member();
		m1.id	= 1;
		m1.name	= "박찬호";
		m1.email= "pch@lotte.com";
		System.out.println(m1);
		
		Member m2 = new Member(2, "강호동", "khd@lotte.com");
		System.out.println(m2);
	}

}
