package day0830;

import java.io.File;
import java.util.Scanner;

public class CreateFile1 {

	public static void main(String[] args) {
		
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("파일명 > ");
			File f = createFile(s.nextLine());
			System.out.println(f.getName()+"파일이 성공적으로 생성되었습니다..");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	static File createFile(String fileName) throws Exception {
		if(fileName ==null||fileName.equals("")) {
			throw new Exception("파일 이름이 유요하지 않습니다.");
		}
		File f = new File(fileName);
		f.createNewFile();
		return f;
	}
}
