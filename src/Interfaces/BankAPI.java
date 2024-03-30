package Interfaces;

public interface BankAPI {
    int getBalance(int accNumber);

    void transferMoney(String from, String to, int amount);
}
