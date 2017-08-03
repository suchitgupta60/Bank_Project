import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> accounts;
	
	public boolean hasAccount(String accountHolder){
		boolean x = false;
		for(Account a : accounts){
			String acct = a.getAccountHolder();
			if(acct.equals(accountHolder));
			x = true;
		}
			return x;
	}

	public Account getAccount(String accountHolder){
		for(Account myacc : accounts){
			if(myacc.getAccountHolder().equals(accountHolder))
				return myacc;
		}
		return null;
	}
	
	public Account getAccount(int accountNumber){
		for(Account myacc : accounts){
			if(myacc.getAccountNumber()==accountNumber)
				return myacc;
		}
	return null;
	}
	
	
}
