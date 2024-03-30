package Polymorphism;

public class User {
    private String email;
    private String password;

    void doSomething() {
        System.out.println("Do something");
    }

    String getPassword() {
        return password;
    }

    String getEmail() {
        return email;
    }

    void setEmail(String email) {
        this.email = email;
    }

    void setPassword(String password) {
        this.password = password;
    }
}
