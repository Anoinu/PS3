import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	public Account(){
		id=0;
		balance=0;
		annualInterestRate=0;
		dateCreated = this.dateCreated;
		
	}
	public Account(int id, double balance){
		this.id=id;
		this.balance=balance;
	}
	public int getid(){
		return this.id;
	}
	public Date getdateCreated(){
		return this.dateCreated;
	}
	public double getbalance(){
		return this.balance;
	}
	public double getannualrate(){
		return this.annualInterestRate;
	}
	public double getMonthlyInterestRate(){
		return this.annualInterestRate/12;
	}
	public void withdraw(double amount) throws InsufficientFundsException{
		if(amount <= balance){
			balance -= amount;
			} 
		else{
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
			}
		}
	public void deposit(double amount){
		balance= balance + amount;
	}
	
}
