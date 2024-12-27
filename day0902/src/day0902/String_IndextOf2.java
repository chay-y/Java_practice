package day0902;

public class String_IndextOf2 {

	public static void emailTest(String str) {
		int at = str.indexOf("@");
		int dot = str.indexOf(".");
		
		if(at != -1 && dot != -1 && at < dot) {
			System.out.println("올바른 메일주소입니다.");
		}else {
			System.out.println("올바른 메일주소가 아닙니다.");
		}
	}
	
	public static void main(String[] args) {
		String email1= "test@naver.com";
		String email2= "testnaver.com";
		String email3= "test@navercom";
		String email4= "test.naver@com";
		
		emailTest(email1);
		emailTest(email2);
		emailTest(email3);
		emailTest(email4);
		
	}
	
	
}
