package ru.gb.level_one.home.zoo;

public class Horse extends Animal {

    public Horse (String name) {
        super(name);
        runMax = 1500;
        swimMax = 100;
        jumpMax = 3;
    }

    public Horse (String name, double runMax, double swimMax, double jumpMax) {
        super(name, runMax, swimMax, jumpMax);
    }
}
