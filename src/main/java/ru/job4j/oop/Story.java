package ru.job4j.oop;

public class Story {
    public static void main(String[] args) {
        Pioneer petya = new Pioneer(); // создали объект пионер
        Girl masha = new Girl(); // создали объект девочка
        Wolf grayWolf = new Wolf(); // создали объект волк

        masha.help(petya);
        petya.kill(grayWolf);
        grayWolf.eat(masha);

    }
}
