package edu.dio.bank;

public class SavingAccount extends Account { 
    @Override
    public void showBalance() {
        System.out.println("=== Savings account statement ===");
        super.showInfo();
    }
}
