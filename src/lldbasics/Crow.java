package lldbasics;

public class Crow extends Bird implements FlyingBird{

    public void fly() {
        System.out.println("Crow fly");
    }
    public void makeSound() {
        System.out.println("Crow crow");
    }
    public void eat() {
        System.out.println("Crow eats");
    }
    public void dance() {
        System.out.println("Crow dances");
    }
}
