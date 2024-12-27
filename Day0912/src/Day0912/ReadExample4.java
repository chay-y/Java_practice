package Day0912;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample4 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("src/files/test4.txt");
		
		while(true) {
			int data = reader.read();
			if(data == -1)
				break;
			
			System.out.println(data);
		}
		
		reader.close();
	}
}
