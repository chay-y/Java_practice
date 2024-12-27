package d2;

class Member{
	//Member 클래스의 데이터인 이름,아이디,패스워드,나이...
	String name;
	String id;
	String pw;
	int age;
	
	//Member 클래스의 세가지의 기능
	
	void setInfo(String name, String id, String pw, int age) {
		this.name=name;
		this.id=id;
		this.pw=pw;
		this.age=age;
	}
	
	void showInfo() {
		System.out.println("이름 :"+name);
		System.out.println("아이디 : "+id);
		System.out.println("비밀번호 : "+pw);
		System.out.println("나이 : "+age);
	}
	
	boolean isLogin(String id, String pw) {
		if(this.id==id && this.pw==pw) {
			System.out.println("로그인 가능");
			return true;
		}else {
			System.out.println("로그인 불가능");
			return false;
		}
	}
	
}

public class MemberTest {

	public static void main(String[] args) {
		Member m = new Member();
		
		m.setInfo("자바", "java", "abcd1234", 20);
		m.showInfo();
		m.isLogin("java","abcd1234");
		m.isLogin("java","abcd");
	}
}
