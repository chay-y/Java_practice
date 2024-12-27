package day0902;

public class String_RunTime {

	public static void main(String[] args) {
		
		long before = System.currentTimeMillis();
		
		String a = "";
		for (int i=0; i<1000000; i++) {
			a += "a";
		}
		
		long after = System.currentTimeMillis();
		
		System.out.println("String 시간차이 : "+(after - before));
		
		System.out.println("_______________________________");
		
		long before1 = System.currentTimeMillis();
		
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<10000000; i++) {
			sb.append("a");
		}
		
		long after1 = System.currentTimeMillis();
		
		System.out.println("StringBuilder 시간차이 : "+(after1 - before1));
		
		System.out.println("_______________________________");
		
		long before2 = System.currentTimeMillis();
		
		StringBuffer sb1 = new StringBuffer();
		for (int i=0; i<10000000; i++) {
			sb.append("a");
		}
		
		long after2 = System.currentTimeMillis();
		
		System.out.println("StringBuffer 시간차이 : "+(after2 - before2));
		
		
	}
}
