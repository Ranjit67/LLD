import java.util.*;

import Concurrency.Hello;

public class Client {
    public static void main(String[] args) {
        Hello hello = new Hello();
        Thread thread = new Thread(hello);
        thread.start();
        hello.run();
        System.out.println("Thread " + Thread.currentThread().getName());

    }
}
