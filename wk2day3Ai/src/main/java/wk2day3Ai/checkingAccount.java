package wk2day3Ai;

public class checkingAccount<T> {
	private int balance=0;
	 
	
	checkingAccount(int amt){
		this.balance = amt;
	}


	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean desiredAmt(int amount) throws customException {
		if (amount > balance) {
			throw new customException(amount);
			
		}else {
			if(amount > 1000) {
				System.out.println("inccurred additional Charges because withdrawal exceed limit (1000)");
				amount = amount + 50;
			}
			withdraw(amount);
		}
		return true;
	}
	
	public void withdraw(int amt) {
		balance = balance - amt;
	}
	
	public void deposit(int amt) {
		balance = balance + amt;
	}

}
