package classbasics;

public class ClassBasics {
    private int age;
    public String name;

    ClassBasics(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printDetails() {
        System.out.println(this.name + "'s age is " + this.age);
    }
}
