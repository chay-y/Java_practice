package d2;
	//계좌정보
public class Account {
	   
	private String accNUmber;  //계좌번호
	private int balance; //예금액 
	private int clientNumber;  //계좌를 소유한 회원번호
	
	    //생성자
	public Account(String accNUmber, int balance, int clientNumber) {
		this.accNUmber = accNUmber;
	    this.balance = balance;
	    this.clientNumber = clientNumber;
	    }

	    //각 필드의 getter, setter
	public String getAccNUmber() {
		return accNUmber;
	}

	public void setAccNUmber(String accNUmber) {
		this.accNUmber = accNUmber;
	}

	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getClientNumber() {
		return clientNumber;
	}
	
	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}
	
	//toString
	@Override
	public String toString() {
		return "Account{" +"accNUmber='" + accNUmber + '\'' +", balance=" + balance +", clientNumber=" + clientNumber +'}';
	    }
	}


