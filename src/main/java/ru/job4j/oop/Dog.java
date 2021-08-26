package ru.job4j.oop;

import java.lang.reflect.AnnotatedElement;

public class Dog {
    public String sound() {
        String voice = "gav";
        return voice;
    }

    public String food; // создали поле объекта food

    public void show() { // метод
        System.out.println("Name of this pet is: " + this.name + " He eats: " + this.food); //чтобы обратиться к полю объекта исп. ключевое слово this, оно указывает что нужно вывести содержимое поля
    }

    void eat(String meal) { // метод eat, записывает в поле объекта food значение переменной meal
        this.food = meal;
    }

    public String name; // создали поле объекта name
    void getNick(String nick) {
        this.name = nick;
    }


    public static void main(String[] args) {
        Dog polkan = new Dog();
        Dog sharik = new Dog();
        Dog zhychka = new Dog();
        String say = polkan.sound(); //вызов метода саунд
        System.out.println("polkan says " + say);

        System.out.println("еда гава");
        Dog reks = new Dog(); // объект
        reks.eat("kotleta");
        reks.getNick("reks");
        reks.show(); // вызов метода

        System.out.println("еда пушка");
        Dog pushok = new Dog(); // объект
        pushok.eat("curry");
        pushok.getNick("pushok");
        pushok.show(); //вызов метода






    }
}
