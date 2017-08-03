import java.util.Date;

public class Transaction {
	private Date date;
	private double amount;
	private String description;
	
	public Transaction(double amount , String description){
		this.amount = amount;
		this.description = description;
	}
	
	public String toString(){
		return amount+" "+description;
	}
	
	public void print(){
		System.out.print(date+" "+toString());
	}


	public static void main(String[] args){
		Transaction t = new Transaction(23, "sdgsgnbv");
		t.print();
	}
}
