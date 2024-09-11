abstract class ABCBank{
    public void BankName(){
        System.out.println("ABC Bank");
    }
    public static void Manager(){
        System.out.println("Manager");
    }
    abstract void openAccount();
    abstract void closeAccount();
}

abstract class BankAccount extends ABCBank{
    public static void AccountName(){
        System.out.println("s");
    }
    abstract void deposit();
    abstract void withdraw();
    abstract void balance();
}

class SavingAccount extends BankAccount{
    void deposit(){
        System.out.println("Savin Account  Deposit");
    }

    
    void withdraw() {
        System.out.println("Saving Account Withdraw");
    }

    
    void balance() {
        System.out.println("Saving Account Balance");
    }

    
    void openAccount() {
        System.out.println("Open Account");
    }

    
    void closeAccount() {
        System.out.println("Close Account");
    }

}
class CurrentAccount extends BankAccount{

    
    void deposit() {
        System.out.println("Current Account Deposit");
        }

    
    void withdraw() {
        System.out.println("Current Account Withdraw");
        }

    
    void balance() {
        System.out.println("current Account Balance");
        }

    
    void openAccount() {
        System.out.println("C - Open Account");
        }

    
    void closeAccount() {
        System.out.println("C- Close Acccount");
        }
    
}

public class abstractDemo {
    public static void main(String[] args) {

        BankAccount.AccountName();
        
        ABCBank.Manager();
        SavingAccount save = new SavingAccount();
        save.BankName();
        save.deposit();
        save.balance();
        save.withdraw();
        save.openAccount();
        save.closeAccount();

        System.out.println("*************************");

        CurrentAccount current = new CurrentAccount();
        current.deposit();
        current.withdraw();
        current.balance();
        current.openAccount();
        current.closeAccount();
        
    }
}
