package question01;

public class CheckingAccount extends BankAccount{
    private static final double interest=0.02;
    
    @Override
    public double calculateInterest() {
     return getBalance()*interest;
    }
    
    
}
