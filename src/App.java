import edu.dio.bank.Account;
import edu.dio.bank.CurrentAcount;
import edu.dio.bank.SavingAccount;

public class App {
    public static void main(String[] args) throws Exception {
        Account sa1 = new SavingAccount();

        Account ca1 = new CurrentAcount();
        ca1.deposit(1000);
        ca1.bankTrasfer(250, sa1);        

        ca1.showBalance();
        sa1.showBalance();
    }
}
