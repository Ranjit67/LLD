package PrintNumber;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) {
        PrintNumber printNumber = new PrintNumber(5);
        Thread thread = new Thread(printNumber);
        thread.start();
        System.out.println(thread.getName());
        Thread t = new Thread();
        int i;
        Lock lock = new ReentrantLock();
        lock.lock();

        lock.unlock();

        System.out.println(t.currentThread().getName());

    }

    void check() {
        try {
            // await
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
