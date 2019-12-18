package ru.gb.level_one.home.zoo;

public class Cat extends Animal {

    public Cat (String name) {
        super(name);
        runMax = 200;
        jumpMax = 2;
    }

    public Cat (String name, double runMax, double swimMax, double jumpMax) {
        super(name, runMax, swimMax, jumpMax);
    }

    @Override
    public void swim(int length) { }
}
