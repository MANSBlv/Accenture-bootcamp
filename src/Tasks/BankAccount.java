package Tasks;

public class BankAccount {
	
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		BankAccount secondAccount = new BankAccount(300f);
		bankAccount.withdraw(300f);
		bankAccount.deposit(6000f);
		bankAccount.transferFrom(bankAccount, bankAccount, 0);
		bankAccount.transferFrom(bankAccount,secondAccount, 400f);
	}

	private float balance;
	
	public BankAccount(){
		balance = 100f;
	}
	

	public BankAccount(float balance) {
		
		this.balance = balance;
	}
	
	public void deposit (float amount) {
		if(amount < 5000) {
		balance += amount;
		}else {
			System.out.println(  "Transaction canceled. Max deposit - 5000 | Your deposit: "+amount);
		}
	}
	
	public void withdraw (float amount) {
		if (amount > 0 && amount <= balance) {
			
		balance -= amount;
		
		}else {
			
			System.out.println("There is not enough funds");
		}
	}
	
	public void transferFrom (BankAccount accountFrom,BankAccount accountTo, float amount) {
		if(accountFrom.balance >= amount) {
			
		accountFrom.balance -= amount;
		accountTo.balance +=amount;
		
		}else {
			System.out.println( "Transfer canceled. You are trying to transfer "+amount+" units, but only "+accountFrom.balance+" are available.");
		}
	}


	
	public String printBalance() {
		return "BankAccount balance= " + balance ;
	}


	public float getBalance() {
		return balance;
	}


	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	
	
}
