package ru.job4j.oop;

public class Doctor extends Profession {
    //поля
    private String nameOfWard;


    //конструктор
    public Doctor(String name, String surname, String education, int birthday, String nameOfWard) {
        super(name, surname, education, birthday);
        this.nameOfWard = nameOfWard;

    }

    Doctor(String nameOfWard) {
        super();
        this.nameOfWard = nameOfWard;

    }

    //метод возвращает имя отделения
    public String getNameOfWard() {
        return this.nameOfWard;

    }

}
