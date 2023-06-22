package question01;

public abstract class BankAccount {
    private int accNumber;
    private double accBalance;
    
    //setters
    public void setAccNumber(int accNumber){
        this.accNumber=accNumber;
    }
     public void setBalance(double accBalance){
        this.accBalance=accBalance;
    }
    //getters
    public int getAccNumber(){
        return accNumber;
    }
    public double getBalance(){
        return accBalance;
    }
    
    public abstract double calculateInterest();
    
   
}
