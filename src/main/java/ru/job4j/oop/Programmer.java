package ru.job4j.oop;

public class Programmer extends Engineer {
    //объявление полей
    private int amountOfCode;

    //объявление конструктора для инициализации нач значений
    public Programmer (String name, String surname, String education, int birthday, int amountOfCode) {
        super(name, surname, education, birthday);
        this.amountOfCode = amountOfCode;
    }

    Programmer(int amountOfCode) {
        super();
        this.amountOfCode = amountOfCode;

    }

    // методы
    public int getAmountOfCode() {
        return this.amountOfCode;
    }

}
