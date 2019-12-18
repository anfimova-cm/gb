package ru.gb.level_one.home.zoo;

public class Bird extends Animal {

    public Bird (String name) {
        super(name);
        runMax = 5;
        jumpMax = 0.2;
    }

    public Bird (String name, double runMax, double swimMax, double jumpMax) {
        super(name, runMax, swimMax, jumpMax);
    }

    @Override
    public void swim(int length) { }
}
