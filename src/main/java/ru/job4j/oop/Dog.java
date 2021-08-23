package ru.job4j.oop;

public class Dog {
    public String sound() {
        String voice = "gav";
        return voice;
    }

    public static void main(String[] args) {
        Dog polkan = new Dog();
        Dog sharik = new Dog();
        Dog zhychka = new Dog();
        String say = polkan.sound(); //вызов метода саунд
        System.out.println("polkan says " + say);

    }
}
