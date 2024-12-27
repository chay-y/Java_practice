package day0826;

class BankAccount{
	private String account;
	private double balance;
	private static double interestRate = 0.02; //이자율(클래스 변수)
	
	public BankAccount(String account, double balance) {
		this.account=account;
		this.balance=balance;
	}
	
	//입금=========================================
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
		}
	}
	//출금=========================================
	public void withdraw(double d) {
		if(d>0&&d<=balance) {
			balance-=d;
		}
	}
	//이자계산======================================
	public void applyInterest() {
		balance += balance*interestRate;
	}
	//이자계산의 오버로딩==============================
	public void applyInterest(double customRate) {
		balance += balance*customRate;
	}
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}

class SavingsAccount extends BankAccount{
	private double minBalance;
	public SavingsAccount(String account, double balance, double minBalnce) {
		super(account, balance);
		this.minBalance=minBalance;
	}
	public void withdraw(double amount) {
		if(getBalance()-amount >= minBalance) {
			super.withdraw(amount);
		}else {
			System.out.println("출금 실패. 최소 잔액을 유지해야 합니다.");
		}
	}
	
	public double getMinBalance() {
		return minBalance;
	}
}
public class BankMain {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount("123-4567",1000);
		account1.deposit(500);
		account1.withdraw(200);
		account1.applyInterest();
		
		System.out.println(account1.getAccount()+"의 잔액 : "+account1.getBalance());
		
		BankAccount account2 = new SavingsAccount("456-7890",2000,500);
		account2.deposit(1000);
		account2.withdraw(2500);
		account2.applyInterest(0.03);
		
		System.out.println(account2.getAccount()+"의 잔액 : "+account2.getBalance());
	}
}
