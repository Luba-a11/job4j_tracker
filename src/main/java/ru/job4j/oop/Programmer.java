package ru.job4j.oop;

public class Programmer extends Engineer {
    //объявление полей
    private int amoutOfCode;
    private String nameOfcompany;

    //объявление конструктора для инициализации нач значений
    public Programmer (int amoutOfCode, String nameOfcompany) {
        this.amoutOfCode = amoutOfCode;
        this.nameOfcompany = nameOfcompany;
    }

    // методы
    public int getAmoutOfCode() {
        return this.amoutOfCode;
    }

    public String getNameOfcompany() {
        return this.nameOfcompany;
    }

}
