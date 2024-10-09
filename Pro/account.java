import java.util.HashMap;
import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Map.Entry;

public class Bank extends account{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Java Bank");
        System.out.println("Enter your Bank Id: ");

        HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();

        public void getLogin() throws IOException{
            int x=1;
            do{
                try{
                    data.put(98989898, 0101);
                    data.put(90909090, 0011);

                    System.out.println("Welcome to ATM Project");

                    System.out.println("Enter the customer Number: ");
                    setCustomerNumber(sc.nextInt());

                    System.out.println("Enter the PIN Number: ");
                    setPinNumber(sc.nextInt());    
                } catch(Exception e){
                    System.out.println("\n"+ "Invalid Characters. Only numbers."+ "\n");
                    x=2;
                }
                for(Entry<Integer, Integer> entry : data.entrySet()){
                   if(entry.getKey()==getCustometNumber() && entry.getValue()==getPinNumber()){
                    getAccountType();}
                    
                }
                System.out.println("\n Wroong Customer or Pin Number \n");
            }
            while (x==1);
        }
        public void getAccountType(){
            System.out.println("Select the account you want to access: ");
            System.out.println("Type 1: Check Account");
            System.out.println("Type 2: Saving Account");
            System.out.println("Type 3: Quit");
            System.out.print("Choice: ");

            int selection=sc.nextInt();

            switch(selection){
                case 1:
                getChecking();
                break;
                case 2:
                getSaving();
                break;
                case 3:
                System.out.println("ThankYou for using this ATM");
                break;
                default:
                System.out.println("Inalid Choice");
                getAccountType();
            }
        }
        public void getChecking(){
            System.out.println("Checking Account:");
            System.out.println("Type 1 : view Balance");
            System.out.println("Type 2: Withdraw Fund");
            System.out.println("Type 3: Deposit Fund");
            System.out.println("Type 4: Exit");
            System.out.println("Choice:");

            int selection=sc.nextInt();
            switch(selection){
                case 1:
                System.out.println("Checking Account Balance:"+moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;
                case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
                case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
                case 4:
                System.out.println("ThankYou for using this ATM");
                break;
                default:
                System.out.println("Invalid Choice");
                getChecking();
            }
        }

        public void getSaving(){
            System.out.println("Checking Account:");
            System.out.println("Type 1 : view Balance");
            System.out.println("Type 2: Withdraw Fund");
            System.out.println("Type 3: Deposit Fund");
            System.out.println("Type 4: Exit");
            System.out.println("Choice:");

            int selection = sc.nextInt();
            switch(selection){
                case 1:
                System.out.println("Checking Account Balance:"+moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;
                case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
                case 3:
                getSavingDepositInput();
                getAccountType();
                break;
                case 4:
                System.out.println("ThankYou for using this ATM");
                break;
                default:
                System.out.println("Invalid Choice");
                getSaving();
            }
        }
    }

    


public class account{
    Scanner sc=new Scanner(System.in);
    DecimalFormat moneyFormat= new DecimalFormat("'$'###,##0.00");

    public int setCustomerNumber(int customerNumber){
        this.customerNumber =customerNumber;
        return customerNumber;
   }
   public int getCustometNumber(){
    return customerNumber;

   }

   public int setPinNumber(int pinNumber){
    this.pinNumber=pinNumber;
    return pinNumber;
   }
   public int getPinNumber(){
    return pinNumber;
   }
   public double getCheckingBalance(){
    return checkingBalance;
   }
   public double getSavingBalance(){
    return savingBalance;
   }

   public double calCheckingWithdraw(double amount){
    checkingBalance=(checkingBalance-amount);
    return checkingBalance;
   }
   public double calSavingWithdraw(double amount){
    savingBalance=(savingBalance-amount);
    return savingBalance;
   }
   public double calCheckingDeposit(double amount){
    checkingBalance=(checkingBalance+amount);
    return checkingBalance;
   }
   public double calSavingDeposit(double amount){
    savingBalance=(savingBalance+amount);
    return savingBalance;
   }

   public void getCheckingWithdrawInput(){
    System.out.println("Checking Account Balance: " +moneyFormat.format(checkingBalance));
    System.out.println("Amount you want to withdraw from the Checking Account:");
    double amount=sc.nextDouble();

    if((checkingBalance-amount)>=0){
        calCheckingWithdraw(amount);
        System.out.println("Your new account balance is: " +moneyFormat.format(checkingBalance));

    }
    else{
        System.out.println("Account can't be Negative.");
    }
   }

   public void getSavingWithdrawInput(){
    System.out.println("Saving account Balance: "+moneyFormat.format(savingBalance));
    System.out.println("Amount to Withdraw from Saving Account: ");
    double amount=sc.nextDouble();

    if((savingBalance-amount)>=0){
        calSavingWithdraw(amount);
        System.out.println("Your new account balance is: " +savingBalance);

    }
    else{
        System.out.println("Account can't be Negative.");
    }
      }

      public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance: " +moneyFormat.format(checkingBalance));
        System.out.println("Enter the Amount to deposit:");
        double amount=sc.nextDouble();
        if((checkingBalance+amount)>0){
            calCheckingDeposit(amount);
            System.out.println("Your account balance: "+moneyFormat.format(checkingBalance));
        }
        else {
            System.out.println("Account won't be negative");
        }
      }

      public void getSavingDepositInput(){
        System.out.println("Checking Account Balance: " +moneyFormat.format(savingBalance));
        System.out.println("Enter the Amount to deposit:");
        double amount=sc.nextDouble();
        if((savingBalance+amount)>0){
            calSavingDeposit(amount);
            System.out.println("New Saving balance:"+moneyFormat.format(savingBalance));
        }
        else{
            System.out.println("Balance can't be negative");
        }
      }

      private int customerNumber;
      private int pinNumber;
      private double checkingBalance=0;
      private double savingBalance=0;
}


public class ATM extends Bank{
    public static void main(String[] args) throws IOException {
        Bank bank= new Bank();
        bank.getLogin();
    }
}