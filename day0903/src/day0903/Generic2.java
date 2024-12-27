package day0903;

class Store{
	
	private Object data;
	
	public void set(Object data) {
		this.data = data;
	}
	
	public Object get() {
		return data;
	}
}

public class Generic2 {

	public static void main(String[] args) {
		
		Store s = new Store();
		
		s.set(10);
		s.set("Hello");
		
		String s1 = (String)s.get();
		System.out.println(s1);
		
		Integer i = (Integer)s.get();
		System.out.println(i);
	}
}
