package ru.job4j.oop;

public class Profession {
    //инициализация полей
    private String name;
    private String surname;
    private String education;
    private int birthday;

    //инициализация конструкторa
    public Profession(String name, String surname, String education, int birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public Profession() {

    }

    //методы
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEducation() {
        return this.education;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public int getBirthday() {
        return this.birthday;
    }


}
