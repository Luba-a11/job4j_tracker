package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hare trysishka = new Hare();
        Fox alica = new Fox();
        Woolf gray = new Woolf();

        trysishka.tryEat(kolobok);
        alica.tryEat(kolobok);
        gray.tryEat(kolobok);
        kolobok.tryEat(kolobok);

    }
}
