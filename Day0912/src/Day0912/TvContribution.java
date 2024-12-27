//package Day0912;
//
//class TvThread extends Thread{
//	Account acc;
//	
//	TvThread(Account acc, String name){
//		this.acc=acc;
//		setName(name);
//	}
//	
//	@Override
//	public void run() {
//		for(int i=1; i<200; i++) {
//			System.out.println(getName()+" : "+i+"번째");
//			acc.deposit();
//			
//			if(acc.getTotal() >= 500000) {
//				break;
//			}
//		}
//	}
//}
//
//public class TvContribution {
//
//	public static void main(String[] args) {s
//		
//		
//		TvThread donator1 = new TvThread(account, "1번째 성금자");
//		TvThread donator2 = new TvThread(account, "2번째 성금자");
//		TvThread donator3 = new TvThread(account, "3번째 성금자");
//		TvThread donator4 = new TvThread(account, "4번째 성금자");
//		TvThread donator5 = new TvThread(account, "5번째 성금자");
//		
//		donator1.start();
//		donator2.start();
//		donator3.start();
//		donator4.start();
//		donator5.start();
//		
//		donator1.join();
//		donator2.join();
//		donator3.join();
//		donator4.join();
//		donator5.join();
//		
//		System.out.println("성금 총액 : "+account.getTotal());
//		
//	}
//}
