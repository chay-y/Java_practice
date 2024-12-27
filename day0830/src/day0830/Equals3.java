package day0830;

import java.util.Scanner;


public class Equals3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String id = "test";
		String pwd = "1234";
		
		System.out.println("Id >");
		String id_str = sc.next();
		
		System.out.println("pwd >");
		String pwd_str = sc.next();
		
		
		if(id.equals(id_str)&&pwd.equals(pwd_str)) {
			System.out.println("로그인성공");
		}else {
			System.out.println("로그인실패..");
		}
	}
	
	
}
