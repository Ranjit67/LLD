package Interfaces;

public class YesBankAPI implements BankAPI {
    @Override
    public int getBalance(int accNumber) {
        return accNumber;
    }

    @Override
    public void transferMoney(String from, String to, int amount) {
        System.out.println("Money is transferred by Yes bank");
    }
}
