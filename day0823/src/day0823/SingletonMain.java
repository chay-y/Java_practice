package day0823;

public class SingletonMain {

	public static void main(String[] args) {
//		Singleton s1 = new Singleton();
//		Singleton s2 = new Singleton();
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
