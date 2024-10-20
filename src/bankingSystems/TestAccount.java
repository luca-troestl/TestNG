package bankingSystems;

public class TestAccount {
	public static void main(String[] args) {
        Account account = new Account("123456", 1000.0);
        //Test richtiges einzahlen
        try {
            account.deposit(200);
            System.out.println("Einzahlung erfolgreich");
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
        //Test falsches einzahlen
        try {
            account.deposit(-50);
            System.out.println("Einzahlung erfolgreich");
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

        //Test richtiges abheben
        try {
            account.withdraw(500);
            System.out.println("Abhebung erfolgreich");
        } catch (InvalidAmountException | OverdraftException e) {
            System.out.println(e.getMessage());
        }

        //Test falsches abheben (zu kleiner Kontostand)
        try {
            account.withdraw(800);
            System.out.println("Abhebung erfolgreich");
        } catch (InvalidAmountException | OverdraftException e) {
            System.out.println(e.getMessage());
        }

        //Test falsches abheben (negativer Betrag)
        try {
            account.withdraw(-100);
            System.out.println("Abhebung erfolgreich");
        } catch (InvalidAmountException | OverdraftException e) {
            System.out.println(e.getMessage());
        }
    }
}
