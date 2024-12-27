package Day0912;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class ImageCopy1 {

	public static void main(String[] args) throws Exception, IOException {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("원본 파일 이름을 입력하세요 > ");
		
		String inputFileName = scan.next();
		
		System.out.println("복사한 파일 이름을 입력하세요 > ");
		
		String outputFileName = scan.next();
		
		try(InputStream input = new FileInputStream("src/files/"+inputFileName);
			OutputStream output = new FileOutputStream("src/files/"+outputFileName)){
			
			int c;
			
			while((c=input.read())!= -1) {
				output.write(c);
			}
			
		}catch(Exception e) {
			
		}
		System.out.println(inputFileName+"을 "+outputFileName+"로 붙여넣었습니다...");
	}
}
