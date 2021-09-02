package ru.job4j.oop;


public class Engineer extends Profession{
    //поля
    private String nameOfspecialisation;
    private int numberOfPermision;

    //контейнер
    public Engineer(String nameOfspecialisation, int numberOfPermision) {
        this.nameOfspecialisation = nameOfspecialisation;
        this.numberOfPermision = numberOfPermision;

    }

    //метод возвращает имя специальности
    public String getNameOfspecialisation() {
        return this.nameOfspecialisation;
    }

    //метод возвращает номер разрешения на работу
    public int getNumberOfPermision() {
        return  this.numberOfPermision;
    }






}

