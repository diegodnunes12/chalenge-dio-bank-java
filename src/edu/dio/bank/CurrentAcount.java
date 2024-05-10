package edu.dio.bank;

public class CurrentAcount extends Account {

    @Override
    public void showBalance() {
        System.out.println("=== Current account statement ===");
        super.showInfo();
    }

}
