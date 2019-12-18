package ru.gb.level_one.home.zoo;

public class Dog extends Animal {

    public Dog (String name) {
        super(name);
        runMax = 500;
        swimMax = 10;
        jumpMax = 0.5;
    }

    public Dog (String name, double runMax, double swimMax, double jumpMax) {
        super(name, runMax, swimMax, jumpMax);
    }
}
