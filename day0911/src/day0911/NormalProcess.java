package day0911;

public class NormalProcess {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		for(int i=0; i<300; i++) {
			System.out.print(".");
		}
		long end=System.currentTimeMillis();
		
		System.out.println();
		System.out.println("소요시간1 : "+(end-start)+"ms");
		
		System.out.println();
		
		for(int i=0; i<300; i++) {
			System.out.print(",");
		}
		
		end =System.currentTimeMillis();
		
		System.out.println();
		System.out.println("소요시간1 : "+(end-start)+"ms");
	}
}
