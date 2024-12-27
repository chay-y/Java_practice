package day0814;

public class ForExam1 {
	public static void main(String[] args) {
		
		int num = 2;
		
		for(int i=2; i<=9; i++) {
			System.out.print(i+"단\t\t");
		}
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j+" X "+i+" = "+(i*j)+"\t");
			}
			System.out.println();
		}
		
		System.out.println("----------------");
		
		for(int i=0; i<=9; i++) {
			for (int j=2; j<=9; j++) {
				if(i == 0) {
					System.out.print(j+"단\t\t");
				}else {
					System.out.print(j+" X "+i+" = "+(i*j)+"\t");
				}
			}
			System.out.println();
		}
	}
}
