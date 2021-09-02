package ru.job4j.oop;

public class Dentist extends Doctor{
    //поля
    private int amountOfClien;
    private String typeOfproblem;

    //конструктор
    public Dentist(int amountOfClien, String typeOfproblem) {
        this.amountOfClien = amountOfClien;
        this.typeOfproblem = typeOfproblem;
    }

    //метод возвращает количество клиентов
    public int getAmountOfClien() {
        return this.amountOfClien;
    }

    public String getTypeOfproblem() {
        return this.typeOfproblem
    }

}
