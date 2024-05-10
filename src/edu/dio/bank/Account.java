package edu.dio.bank;

public abstract class Account implements IAccount{
    private static final int AGENCY_DEFAULT = 1;
    private static int SEQUENCE = 1;

    protected int agency;
    protected int number;
    protected double balance;

    public Account() {
        this.agency = AGENCY_DEFAULT;
        this.number = SEQUENCE++;
    }

    @Override
    public void withdraw(double value) {
        this.balance -= value;
    }

    @Override
    public void deposit(double value) {
        this.balance += value;
    }

    @Override
    public void bankTrasfer(double value, Account targetAccount) {
        this.withdraw(value);
        targetAccount.deposit(value);
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    } 

    protected void showInfo() {
        System.out.println(String.format("Agency: %d", this.getAgency()));
        System.out.println(String.format("Number: %d", this.getNumber()));
        System.out.println(String.format("Balance: %.2f", this.getBalance()));
    }
}
