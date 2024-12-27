package Day0912;

import java.io.File;
import java.io.FileReader;

public class BankAccountMain2 {
	public static void main(String[] args) throw IOException, Interrupted{
		//읽어올 파일 객체를 생성
		File file = new File("accounts-data.txt");
		
		//파일을 읽어오기 위해 FileReader 생성
		FileReader fr = new FileReader(file);
		
		int ch;
		
		//파일의 내용을 한 문자씩 읽어옴
		//읽어올 내용이 없으면 -1반환함
		while((ch=fr.read() != -1)) {
			//읽어온 문자값(정수)를 문자로 변환
			System.out.println((char)ch);
			
			//일시정지
			Thread.sleep(200);
		}
		
		fr.close();
	}
}
