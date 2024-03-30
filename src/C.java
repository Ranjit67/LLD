public class C extends B {
    C() {
        this("Hello world");
        System.out.println("C constructor.");

    }

    C(String h) {
        System.out.println(h);
    }

}
