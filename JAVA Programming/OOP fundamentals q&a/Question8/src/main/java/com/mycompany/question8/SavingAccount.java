package com.mycompany.question8;

public class SavingAccount {
    private static double annualInterestRate;
    private double savingBalance;
    
    public SavingAccount(double savingBalance){
        this.savingBalance = savingBalance;
    }
    public void calculateMonthlyInterest(){
        savingBalance += savingBalance*annualInterestRate/12.00;
    }
    public static void modifyInterestRate(double annualInterestRate){
        SavingAccount.annualInterestRate = annualInterestRate;
    }
    public double getSavingBalance(){
        return savingBalance;
    }
}
