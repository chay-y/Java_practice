package dya0816;

public class Continue1 {
	public static void main(String[] args) {
		//1부터 10까지의 숫자중에서
		//3의 배수가 아닌 숫자를 출력
		for (int i=1; i<=10; i++) {
			if (i%3==0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
