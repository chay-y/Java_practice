package day0830;

import java.util.Scanner;

class MyException extends Exception{
	public MyException(int cnt) {
		super("크기는"+cnt+"이상으로 설정");
	}
}

public class Exception3 {

	public static void main(String[] args) throws MyException {
		int cnt=0;
		int[] arr=null;
		Scanner s = new Scanner(System.in);
		
		System.out.println("원하는 배열의 크기를 입력하세요 >");
		cnt = s.nextInt();
		
		if(cnt<5) {
			try{
				throw new MyException(5);
			}catch(MyException e) {
				e.printStackTrace();
				}
			}	
			else{
				System.out.println("크기가"+cnt+"인 배열이 생성");
				arr=new int[cnt];
			}
	}
}
