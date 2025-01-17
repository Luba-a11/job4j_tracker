package ru.job4j.pojo;

import javax.sound.midi.Soundbank;

public class Library {
    public static void main(String[] args) {
        //new objects
        Book b1 = new Book("Kolobok", 232);
        Book b2 = new Book("Alisa", 154);
        Book b3 = new Book("Red hat", 15);
        Book b4 = new Book("Wolf and 7 goats", 54);

        Book[] books = new Book[4];
        books[0] = b1;
        books[1] = b2;
        books[2] = b3;
        books[3] = b4;


        for (int i = 0; i < books.length; i++) {
            Book bs = books[i];
            System.out.println(bs.getName() + " --> " + bs.getNumberOfPages());

        }
        System.out.println();



        Book b5 = new Book("Clean code", 546);
        books[0] = b5;
        for (int i = 0; i < books.length; i++) {
            Book bs = books[i];
            System.out.println(bs.getName() + " >>> " + bs.getNumberOfPages());
        }
        System.out.println();
        System.out.println("Переставьте местами книги с индексом 0 и 3");
        for (int i = 0; i < books.length; i++) {
            Book bs = books[i];
            Book temp = books[0];
            books[0] = books[3];
            books[3] = temp;
            System.out.println(bs.getName() + " --- " + bs.getNumberOfPages());

        }

        System.out.println();
        System.out.println("Добавьте цикл с выводом книг с именем \"Clean code\"");
        for (int i = 0; i < books.length; i++) {
            Book bs = books[i];
            if(books[i] == "Clean code"){
                System.out.println((bs.getName() + " --- " + bs.getNumberOfPages()));
            }
        }

    }
}
