package day0902;

public class ByteToString1 {

	public static void main(String[] args) {
		byte[] bytes = {71,79,79,68,32,77,79,82,78,73,78,71};
		
		String str1 = new String(bytes);
		System.out.println(str1);

		String str2 = new String(bytes, 5, 7);
		System.out.println(str1);
	}
}
