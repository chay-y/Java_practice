package Day0912;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReadExample6 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("src/files/test6.txt");
		
		char[] buffer = new char[5];
	
		int readCharNum = reader.read(buffer, 2,3);
		if(readCharNum != -1) {
			for(int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
	}
}
