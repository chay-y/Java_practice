package day0819;

public class String1 {

	public static void main(String[] args) {
		String str1 = "str";
		String str2 = "str";
		String str3 = new String("str");
		String str4 = new String("str");
		
		System.out.println(str1 == str2); //주소비교
		System.out.println(str1.equals(str2)); //내용비교
		
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		
		System.out.println("------------------------------");
		
		String s1 = new String();
		
		System.out.println(s1 == null);
		
		int[] arr1 = null;
//		arr1[0] = 10;
		
		System.out.println(arr1);
	}
}
