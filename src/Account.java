import java.util.ArrayList;

public class Account {
	private int accountNumber;
	private String accountHolder;
	private double balance; 
	private ArrayList<Transaction> transactions;
	
	public Account(int accountNumber , String accountHolder){
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	
	public void deposit(Transaction ad){
		transactions.add(ad);
	}
	
	public void withdraw(Transaction rem){
		transactions.remove(rem);
	}
	
	public void printSummary(){
	//Transaction acc = new Transaction();
	 for(Transaction t : transactions){
		System.out.println(t);
	 }
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public static void main(String[] args){
		Account acc = new Account(23 , "system");
		acc.printSummary();
	}
	
	
}
