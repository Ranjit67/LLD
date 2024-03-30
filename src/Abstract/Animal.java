package Abstract;

public abstract class Animal {

    public int noOfLegs;

    public void eat() {
        System.out.println("Animal Eat.");
    }

    abstract void makeSound();

    abstract void walk();
}
