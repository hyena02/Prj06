package ex04;

//Field	: package level 의 변수 : 같은 폴더에서 변수 공유됨
// access modifier(public, private, protected, package) 를 안붙이면 package level 이다
class Member{
	private int	id;				// private Field 는 전부 private
	private String name;		// 
	private String email;		// 
 
	
//constructor
	public Member() {}
	public Member(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;		
	}
// toString  // 객체 안에 값이 잘 들어가고있는지 확인하기 위해서 ( 디버깅용 ) 보기 좋게 ..
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
// source => < generate getters and setters >
// <=> Setter 함수 : 외부클래스에서 내부 Field 에 값을 넣는 방법
// <=> Getter 함수 : 내부Field에서 외부클래스로 값을 보내는 방법
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	} 

	
}// classMember


public class TestMember {

	public static void main(String[] args) {
		
		Member m1 = new Member();
		m1.setId(1);
		m1.setName("박찬호");
		m1.setEmail("pch@lotte.com");
		System.out.println(m1);
	
		String name1 = m1.getName();
		System.out.println("m1의 이름:" + name1);
		
		
		Member m2 = new Member(2, "강호동", "khd@aaaa.com");
		System.out.println(m2);
		
	//Error	m2.email = "khd@ss.com";		//not visible
		m2.setId(3);
		m2.setEmail("khd@bbbb.com");		//Field 에 넣고싶을 때 set--써야함 => f2 create 
		System.out.println(m2);
		System.out.println("m2의 아이디 : " + m2.getId());
		System.out.println("m2의 이름 : " + m2.getName());
		System.out.println("m2의 이메일 : " + m2.getEmail());
		
	}//main
}//class