package day0909;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackQueueExam1 {

	public static void main(String[] args) {
		//괄호 검사하기
		//여는괄호, 닫는괄호가 한쌍이어야 하고
		//여는 괄호만 있거나, 닫는 괄호만 있으면 오류라고 출력
		//괄호가 올바르게 작성되었으면 '괄호가 일치합니다.'출력
		
		String expression = "((5+6)*(3-2))";
		Stack st = new Stack();
		
		System.out.println(expression);
		System.out.println();
		try {
			for(int i=0; i<expression.length(); i++) {
				char ch = expression.charAt(i);
			
				if(ch=='(') {
					st.push(ch);
				}else if(ch == ')') {
					st.pop();
				}
			}
		
			if(st.isEmpty()) {
				System.out.println("괄호가 일치합니다");
			}else {
				System.out.println("오류입니다.");
			}
			
		}catch(EmptyStackException e) {
			System.out.println("여는 괄호가 일치하지 않습니다");
		}catch(Exception e) {
			System.out.println("예외가 발생하였습니다.");
		}
		
	}
}


//		String expression = "((5+6)*(3-2))";
//		int expressionSize = expression.length();
//		char test;
//		char testIsPair;
//		
//		Stack ex = new Stack();
//		
//		for(int i=0; i<expressionSize; i++) {
//			test = expression.charAt(i);
//			switch(test) {
//			case '(':
//				ex.push(test);
//				break;
//			case ')':
//				if(ex.isEmpty()) {
//					System.out.println("오류입니다.");
//				}else {
//					testIsPair = (char) ex.pop();
//					if((test !='(') && (testIsPair == ')')){
//						System.out.println("오류입니다.");
//					}else {
//						break;
//					}
//				}
//			}
//		}
//		
//		if(ex.isEmpty()) {
//			System.out.println("괄호가 일치합니다");
//		}else {
//			System.out.println("오류입니다.");
//		}
//		
//	}
//}
