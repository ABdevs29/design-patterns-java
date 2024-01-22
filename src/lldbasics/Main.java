package lldbasics;

public class Main {
    public static void main (String[] args) {
        Pigeon b1 = new Pigeon();
        b1.setName("pigeon");
        b1.setAge(2);
        b1.setColor("white");
        b1.setNoOfWings(2);


        Crow b2 = new Crow();
        b2.setName("crow");
        b2.setAge(1);
        b2.setColor("black");
        b2.setNoOfWings(2);
        b2.makeSound();
        b2.fly();

        Peacock b3 = new Peacock();
        b3.setName("peacock");
        b3.setAge(2);
        b3.setColor("blue");
        b3.setNoOfWings(2);
        b3.makeSound();

    }
}
