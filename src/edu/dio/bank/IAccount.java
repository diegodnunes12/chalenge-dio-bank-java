package edu.dio.bank;

public interface IAccount {
    // sacar o valor
    void withdraw(double value);

    // depositar o valor
    void deposit(double value);

    // trasferencia bancária
    void bankTrasfer(double value, Account targetAccount);

    // extratos bancário
    void showBalance();
}
