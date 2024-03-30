package Polymorphism;

public class Client {
    public static void main(String[] args) {
        User user = new User();
        Student student = new Student();
        TA ta = new TA();
        User temp = student;
        temp.doSomething();

    }

}
