package day0902;

public class String_IndexOf {

	public static void main(String[] args) {
		String str = "JSP 프로그래밍";
	
		String newStr = str.replace("JSP", "JAVA");
		System.out.println(newStr);
		
		int location = str.indexOf("프로그래밍");
		System.out.println(location);
		
		String str1 = str.substring(0,3);
		System.out.println(str1);
		
		String str2 = str.substring(4);
		System.out.println(str2);
		
		if(str.indexOf("자바")==-1) {
			System.out.println("자바와 관련된 책이 아닙니다.");
		}
	}
}
