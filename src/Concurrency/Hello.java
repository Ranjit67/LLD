package Concurrency;

public class Hello implements Runnable {
    public void doSomething() {
        System.out.println("do something " + Thread.currentThread().getName());

    }

    public void run() {
        // TODO Auto-generated method stub
        // System.out.println("Hello world");
        this.doSomething();

    }
}
