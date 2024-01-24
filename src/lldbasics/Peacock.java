package lldbasics;

public class Peacock extends Bird implements DancingBird {

    public void makeSound() {
        System.out.println("Peacock peacock");
    }
    public void eat() {
        System.out.println("Peacock eats");
    }
    public void dance() {
        System.out.println("Peacock dances");
    }
}
