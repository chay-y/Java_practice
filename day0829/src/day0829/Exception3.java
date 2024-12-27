package day0829;

public class Exception3 {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		try {
			for(int a : arr) {
				System.out.print(a+" ");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스초과");
		}
		
	}
}
