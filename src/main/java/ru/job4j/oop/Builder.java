package ru.job4j.oop;


public class Builder extends Engineer{
    //инициализация полей
    private String objectOfBuild;
    private int yearsOfExperience;
    private boolean permissionToWork;


    //конструктор для инициализации нач значений
    public Builder(String objectOfBuild, int yearsOfExperience, boolean permissionToWork) {
    this.objectOfBuild = objectOfBuild;
    this.yearsOfExperience = yearsOfExperience;
    this.permissionToWork = permissionToWork;
    }


    //метод возвращает название объекта строительства
    public String getObjectOfBuild() {
        return this.objectOfBuild;
    }

    public int getYearsOfExperience() {
        return this.yearsOfExperience;
    }

    public boolean isPermissionToWork () {
        return this.permissionToWork;

    }


}

