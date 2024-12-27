package Day0912;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("src/files/test1/db");
		
		while(true) {
			int data = is.read(); //한바이트씩 읽어옴
		}
	}
}
