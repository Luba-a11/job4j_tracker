package ru.job4j.oop;

public class Dentist extends Doctor{
    //поля
    private int amountOfClient;


    //конструктор
    public Dentist(String name, String surname, String education, int birthday, int amountOfClient) {
        super(name, surname, education, birthday);
        this.amountOfClient = amountOfClient;

    }

    Dentist(int amountOfClient) {
        super();
        this.amountOfClient = amountOfClient;

    }

    //метод возвращает количество клиентов
    public int getAmountOfClient() {
        return this.amountOfClient;
    }



}
