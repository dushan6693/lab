package question01;

public class SavingAccount extends BankAccount {
    private static final double interest=0.12;
    
    @Override
    public double calculateInterest() {
     return getBalance()*interest;
    }
    
    
    
}
