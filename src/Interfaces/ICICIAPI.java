package Interfaces;

public class ICICIAPI implements BankAPI {
    @Override
    public int getBalance(int accNumber) {
        return accNumber;
    }

    @Override
    public void transferMoney(String from, String to, int amount) {
        System.out.println("Money Transferred from ICICI");
    }
}
