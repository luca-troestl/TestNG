package bankingSystem;
 
public class TestAccount {
	public static void main(String[] args) {
        Account account = new Account("123456", 1000.0);
        //Test if deposit is correct
        try {
            account.deposit(200);
            System.out.println("Einzahlung erfolgreich");
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
        //Test if deposit is correct
        try {
            account.deposit(-50);
            System.out.println("Einzahlung erfolgreich");
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
 
        //Test if withdrawal is correct
        try {
            account.withdraw(500);
            System.out.println("Abhebung erfolgreich");
        } catch (InvalidAmountException | OverdraftException e) {
            System.out.println(e.getMessage());
        }
 
        //Test if the withdrawal process is valid
        try {
            account.withdraw(800);
            System.out.println("Abhebung erfolgreich");
        } catch (InvalidAmountException | OverdraftException e) {
            System.out.println(e.getMessage());
        }
 
        //Test if the withdrawal process is valid and not negative
        try {
            account.withdraw(-100);
            System.out.println("Abhebung erfolgreich");
        } catch (InvalidAmountException | OverdraftException e) {
            System.out.println(e.getMessage());
        }
    }
}