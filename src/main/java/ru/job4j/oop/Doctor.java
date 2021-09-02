package ru.job4j.oop;

public class Doctor extends Profession {
    //поля
    private int amountOfPatient;
    private String nameOfWard;
    private int amountOfPrescrition;

    //конструктор
    public Doctor(int amountOfPatient, String nameOfWard, int amountOfPrescrition) {
        this.amountOfPatient = amountOfPatient;
        this.nameOfWard = nameOfWard;
        this.amountOfPrescrition = amountOfPrescrition;

    }

    //метод возвращает количество пациентов
    public int getAmountOfPatient() {
        return this.amountOfPatient;
    }
    //метод возвращает имя отделения
    public String getNameOfWard() {
        return this.nameOfWard;

    }
    //метод возвращает количество выданных направлений
    public int getAmountOfPrescrition() {
        return this.amountOfPrescrition;
    }

}
