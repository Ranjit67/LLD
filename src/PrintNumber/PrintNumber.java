package PrintNumber;

public class PrintNumber implements Runnable {

    private int num;

    PrintNumber(int value) {

        this.num = value;
        this.dome();

    }

    void dome() {
        Thread thread = new Thread();
        System.out.println("Print " + thread.currentThread().getName());
    }

    public void run() {
        // System.out.println(Thread().currentThread().getName());
    }

}
