package day0830;

import java.io.IOException;
import java.util.Arrays;

public class SystemExam2 {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.println("입력 >");
		int readByteNo = System.in.read(bytes);
		
		System.out.println(Arrays.toString(bytes));
		System.out.println(readByteNo);
		
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
	}
}
