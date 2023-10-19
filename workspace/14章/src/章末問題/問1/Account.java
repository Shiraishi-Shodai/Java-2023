package 章末問題.問1;

public class Account {

	String accountNumber;
	int balance;
	
	public Account(String accountNumber,int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String toString(){
		return "￥"+this.balance+"(口座番号:"+this.accountNumber+")";
	}
	
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o instanceof Account) {
			Account a = (Account)o;
			if(this.equals(a)) {
				return true;
			}
		}
		return false;
	}
	
}
