package ru.gb.level_one.home.zoo;

public class Main {

    /*
    1. Создать классы Собака, Лошадь, Птица и Кот с наследованием от класса Животное.
    2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
    В качестве параметра каждому методу передается величина,
    означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
    3. У каждого животного есть ограничения на действия
    (бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,;
    прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ;
    плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).
    4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат.
    (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')
    5. Добавить животным разброс в ограничениях.
    То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
    */

    public static void main(String[] args) {

        Cat cat = new Cat("Vasiliy", 400, 0, 2);
        Cat catDef = new Cat("Tishka");
        Dog dog = new Dog("Sharik", 300, 15, 1.5);
        Dog dogDef = new Dog("Barbos");
        Bird bird = new Bird("Sinichka", 3, 0, 0.3);
        Bird birdDef = new Bird("Grisha");
        Horse horse = new Horse("Marfa", 1200, 120, 2);
        Horse horseDef = new Horse("Poloniy");

        Animal[] zoo = {cat, catDef, dog, dogDef, bird, birdDef, horse, horseDef};

        for (int i = 0; i < zoo.length; i ++) {
            zoo[i].run(300);
            zoo[i].swim(5);
            zoo[i].jump(1);
        }

        for (int i = 0; i < zoo.length; i++) {
        if (zoo[i] instanceof Cat) {
            ((Cat) zoo[i]).run(0.5);
            }
        if (zoo[i] instanceof Bird) {
            ((Bird) zoo[i]).jump(0.1);
            }
        }

    }
}
