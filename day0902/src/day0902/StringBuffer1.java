package day0902;

public class StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("StringBuffer");
		sb.append(" : ");
		sb.append("hello java");
		
		System.out.println(sb);
		
		//String으로 변환
		String result1 = sb.toString();
		System.out.println(result1);
		
		//             ||    String   || StirngBuffer || StringBuilder ||
		//   가변 여부   ||     불변     ||      가변   	  ||      가변      ||
		// 스레드 세이프  ||      o      ||       o      ||      x        ||
		//   연산 속도   ||     느림     ||      중간     ||      빠름      ||
		

		//   저장 위치   String          //String Constant Pool(리터럴생성)
		//             StirngBuffer    //Heap
		//             StringBuilder   //Heap
		

		//   언제 사용   String          //문자열 추가 연산이 적고, 스레드 세이프 환경
		//             StirngBuffer    //문자열 추가 연산이 많고, 스레드 세이프환경 조금 변경이 많은 경우
		//             StringBuilder   //문자열 추가 연산이 많고, 스레드 세이프 고려x, 빠른 연산 필요
	}
}
