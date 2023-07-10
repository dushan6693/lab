package com.mycompany.question8;

public class Question8 {

    public static void main(String[] args) {
        
        SavingAccount saver1 = new SavingAccount(2000.00);
        SavingAccount saver2 = new SavingAccount(3000.00);
        
        SavingAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saving acc 1 balance is at 4% rate: "+saver1.getSavingBalance());
        System.out.println("Saving acc 2 balance is at 4% rate: "+saver2.getSavingBalance());
        
        SavingAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saving acc 1 balance is at 5% rate: "+saver1.getSavingBalance());
        System.out.println("Saving acc 2 balance is at 5% rate: "+saver2.getSavingBalance());
        
    }
}
