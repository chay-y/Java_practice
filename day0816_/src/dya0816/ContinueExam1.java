package dya0816;

public class ContinueExam1 {
	public static void main(String[] args) {
		//아래의 문장에서 'e'의 개수를 나타내시오
		String s = "green computer academ";
		int count = 0;
		for (int i=1; i<=s.length(); i++) {
			if(s.charAt(i) !='e') {
				continue;
			}
			count++;
		}
		System.out.println("e의 개수 : "+count);
	}
}

