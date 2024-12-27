package Day0912;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriter {

	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("src/files/input2.txt");
		
		int buf;
		
		System.out.println("바이트 단위로 읽어올 때");
		
		while((buf = fin.read())!= -1) {
			System.out.println((char)buf);
		}
		
		fin.close();
		
		FileReader fr = new FileReader("src/files/input2.txt");
		FileWriter fw = new FileWriter("src/files/input2.txt");
		
		System.out.println("\n\n 문자(2바이트) 단위로 읽어올 때");
		
		while((buf = fr.read())!= -1) {
			System.out.print((char)buf);
			fw.write(buf);
		}
		fr.close();
		fw.close();
	}
}
