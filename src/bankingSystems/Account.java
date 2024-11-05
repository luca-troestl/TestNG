package bankingSystems;

public class Account {

	private String accountNumber;
	private double balance;

	public Account(String accountNumber, double balance) {
	    this.accountNumber = accountNumber;
	    this.balance = balance;
	}

	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0;
	}
	
	public double getBalance() {
        return balance;
    }
	public void setBalance(double newBalance) {
        this.balance = newBalance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }
    
    /**
     * The method increases the value at variable balance by the amount amount. It throws an Exception if the amount is 
     * smaller or equal to 0
     * @param amount
     * @throws InvalidAmountException
     */
	public void deposit(double amount) throws InvalidAmountException {
	   if (amount <= 0) {
	       throw new InvalidAmountException("Der einzuzahlende Betrag muss größer als 0 sein!");
	   }
	   this.balance = this.balance + amount;
	}
	
	/**
	 * The method decreases the value of the variable balance by the value of the variable amount.
	 * If the amount is equal or smaller than 0 it throws an Exception. It also throws an Exception if the balance
	 * minus the amount is smaller than 0.
	 * @param amount
	 * @throws OverdraftException
	 * @throws InvalidAmountException
	 */
	public void withdraw(double amount) throws OverdraftException, InvalidAmountException {
	    if (amount <= 0) {
	        throw new InvalidAmountException("Der Betrag der abgehoben werden soll muss größer als 0 sein!");
	    }
	    if ((balance - amount) < 0) {
	        throw new OverdraftException("Nicht genuegend Guthaben! Waehle einen Betrag der "
	        		+ "kleiner als der aktuelle Kontostand ist!");
	    }
	    this.balance = this.balance - amount;
	}


}
