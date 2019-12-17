package ru.gb.level_one.home.zoo;

public class Animal {

    public String name;
    public double runMax;
    public double swimMax;
    public double jumpMax;

    public Animal (String name, double runMax, double swimMax, double jumpMax) {
        this.name = name;
        this.runMax = runMax;
        this.swimMax = swimMax;
        this.jumpMax = jumpMax;
    }

    public void run (double length) {
        if (length < runMax)
            System.out.println(name + " ran " + length + " meters");
    }

    public void swim (int length) {
        if (length < swimMax)
            System.out.println(name + " swam " + length + " meters");
    }

    public void jump (double height) {
        if (height < jumpMax)
            System.out.println(name + " jumped " + height + " meters");
    }

}
