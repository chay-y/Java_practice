package Day0912;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample7 {
	
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("src/files/test7.txt");
		
		int data;
		StringBuilder sb = new StringBuilder();
		
		while((data = reader.read())!= -1) {
			sb.append((char)data);
		}
		
		System.out.println(sb.toString());
		reader.close();
		
	}
}
