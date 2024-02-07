package objectClass;
//은행 계좌(통장) 클래스
public class Account {
	//멤버 변수(필드, 속성)
	static final String BANKNAME="신한은행"; //상수=늘상 똑같은 수, 대문자로 넣어야 고정 됨
	String accountNo; //계좌번호
	String ownerName; //예금주 이름
	int balance; //잔액
	
	//생성자
	public Account() {
	
	}
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	//예금한다는 메서드
	void deposit(int amount) {
		balance+=amount; //balance=balance+amount;
	}
	//인출한다는 메서드
	int withdraw(int amount) throws Exception {
		if(balance < amount) {
			throw new Exception("잔액이 부족합니다.");
		}
		balance-=amount; //balance=balance-amount;
		return amount;
	}
}

