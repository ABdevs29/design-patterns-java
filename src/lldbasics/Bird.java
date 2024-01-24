package lldbasics;

import javax.sound.midi.Soundbank;

public abstract class Bird {
    private String name;
    private int age;
    private int noOfWings;
    private String color;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNoOfWings(int noOfWings) {
        this.noOfWings = noOfWings;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void makeSound();
    public abstract void eat();
}
