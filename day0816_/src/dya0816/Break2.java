package dya0816;

public class Break2 {
	public static void main(String[] args) {
		// 1부터 10까지의 숫자를 한줄에 3개씩 출력하기
		int k=0;
		myFor : for(int i=0; i<10; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(++k + "\t");
				if(k==10) {
					break myFor;
				}
			}
			System.out.println();
		}
	}
}
