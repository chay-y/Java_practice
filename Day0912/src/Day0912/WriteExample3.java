package Day0912;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample3 {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("src/files/test3.db");
		
		byte[] array = {10, 20, 30, 40, 50};

		os.write(array);
		
		os.flush();
		
		os.close();
	}
}
