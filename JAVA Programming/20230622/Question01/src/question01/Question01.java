package question01;

public class Question01 {


    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        CheckingAccount checkingAccount = new CheckingAccount();
        
        
        //saving acc
        savingAccount.setAccNumber(10001);
        savingAccount.setBalance(20000000.00);
       
        System.out.println("Account detils of your saving account :");
        System.out.println("Account No: "+ savingAccount.getAccNumber());
        System.out.println("Account Balance: "+ savingAccount.getBalance());
        System.out.println("Interest: "+ savingAccount.calculateInterest());
        
        System.out.println("");
        
        
        //cheking acc
        checkingAccount.setAccNumber(10002);
        checkingAccount.setBalance(1000000.00);
        
        System.out.println("Account detils of your checking account :");
        System.out.println("Account No: "+ checkingAccount.getAccNumber());
        System.out.println("Account Balance: "+ checkingAccount.getBalance());
        System.out.println("Interest: "+ checkingAccount.calculateInterest());
        
       
    }
    
}
