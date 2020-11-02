package SixthThirdBank;

public class ActivityInfo {
	
	private int currentBalance;
	
	private int withdrawAmount;
	
	private int depositAmount;
	
	private String typeofAccount;
	
	
	public ActivityInfo() {
		super();
	}
	
	
	public ActivityInfo(int currentBalance, String typeofAccount) {
		this.currentBalance = currentBalance;
		this.typeofAccount = typeofAccount;
	}
	// method to withdraw money
	//want to add in total withdraws for the day method
	void withdrawFunds(int amount) {
		System.out.println("You current balance is " + currentBalance);
		while(currentBalance != 0) {
			int total = currentBalance - amount;
			currentBalance = total;
			System.out.println("You currentBalnce is " + currentBalance);
		}System.out.println("Insufficient funds");
		
}
	//method for depositing money
	void depositFunds(int amount) {
		System.out.println("Your current balance is " + currentBalance);
		if( amount !=0) {
			int total = currentBalance + amount;
			currentBalance = total;
			System.out.println("Your current balance is "+ currentBalance);
		}
		else {
			System.out.println("Invalid deposit amount");
		}
	}


	public int getCurrentBalance() {
		return currentBalance;
	}


	public void setCurrentBalance(int currentBalance) {
		this.currentBalance = currentBalance;
	}


	public int getWithdrawAmount() {
		return withdrawAmount;
	}


	public void setWithdrawAmount(int withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}


	public int getDepositAmount() {
		return depositAmount;
	}


	public void setDepositAmount(int depositAmount) {
		this.depositAmount = depositAmount;
	}


	public String getTypeofAccount() {
		return typeofAccount;
	}


	public void setTypeofAccount(String typeofAccount) {
		this.typeofAccount = typeofAccount;
	}
	
	

