package day0821;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService serv = new MemberService();
			
		boolean result = serv.login("hong","12345");
		
		if(result==true) {
			System.out.println("로그인 되셨습니다.");
			serv.logout("hong");
		}else {
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
		}
		
	}
}
