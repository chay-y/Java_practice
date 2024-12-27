package d1;

import java.util.ArrayList;
import java.util.Collections;

public class Exam3 {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		Collections.addAll(arr, 5,11,20,40,30);
		
		System.out.println("가장 큰 값은? > "+Collections.max(arr));
		System.out.println("가장 작은 값은? > "+Collections.min(arr));
		
	}
}
