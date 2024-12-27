package day0909;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HashSet1 {

	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1),"2","2","3","3","4","4","4"};
		List set = new ArrayList();
		
		for(int i=0; i<objArr.length; i++) {
			System.out.println(objArr[i]+" = "+set.add(objArr[i]));
		}
		
		System.out.println(set);
		
		Iterator it = set.iterator();
		
	
	}
}
