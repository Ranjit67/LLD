package Interfaces;

public class Client {
    public static void main(String[] args) {
        ICICIAPI ICICI = new ICICIAPI();
        PhonePe phonePe = new PhonePe(ICICI);
        int amount = phonePe.checkBalance();
        System.out.println("Current amount is " + amount);
    }
}
