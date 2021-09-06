package ru.job4j.oop;


public class Engineer extends Profession{
    //поля
    private String nameOfspecialisation;


    //контейнер
    public Engineer(String name, String surname, String education, int birthday, String nameOfspecialisation) {
        super(name, surname, education, birthday);
        this.nameOfspecialisation = nameOfspecialisation;

    }

    Engineer(String nameOfspecialisation) {
        super();
        this.nameOfspecialisation = nameOfspecialisation;
    }

    //метод возвращает имя специальности
    public String getNameOfspecialisation() {
        return this.nameOfspecialisation;
    }

}

