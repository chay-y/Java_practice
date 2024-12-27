package day0903;

import java.util.ArrayList;

class Box<T>{
	public T content;
}

public class Generic1 {

	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.content = "안녕";
		String str = box.content;
		
		Box<Integer> box2 = new Box<Integer>();
		box2.content = 123;
		int i = box2.content;
		
		//import 자동 : ' ctrl+shift+o '
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add("30");
		
		System.out.println(list);
		
		//Integer로 자동형변환이 필요함
		Integer i2 = (Integer)list.get(2);
		
		System.out.println(i2);
	}
}
