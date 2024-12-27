package day0823;

class BankAccount{
	private String account;
	private double balance;
	private static double interestRate = 0.02;
	
	
	BankAccount(){}
	BankAccount(String account, int balance){
		this.account=account;
		this.balance=balance;
		System.out.println("계좌번호 : "+account);
		System.out.println("잔액 : "+balance);
	}
	
	public void deposit(int deposit) {
		balance+=deposit;
		System.out.println("입금액 : "+deposit);
	}
	
	public void withdraw(int withdraw) {
		balance-=withdraw;
		System.out.println("출금액 : "+withdraw);
	}
	
	public void ApplyInterest(double interestRate) {
		if(interestRate==0.02) {
			this.interestRate = interestRate;
		}else {
			System.out.println("사용자 지정 이자율 : "+interestRate);
		}
		System.out.println("이자 지급");
	}
}

class SavingsAccount extends BankAccount{
	
	private int minBalance;

	
}

public class BankMain {

	public static void main(String[] args) {
		
		BankAccount p1 = new BankAccount("123-4567",1000);
		p1.deposit(500);
		p1.withdraw(200);
		p1.ApplyInterest(0);
		
		System.out.println();
		
		BankAccount p2 = new BankAccount("456-7890",2000);
		p2.deposit(1000);
		p2.withdraw(2500);
		p2.ApplyInterest(0.03);
		
		System.out.println();
		
//		System.out.println((double)p1.balance+(p1.balance*p1.interestRate));
//		System.out.println((double)p2.balance+(p2.balance*p2.interestRate));
//		
	}
}

