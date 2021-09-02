package ru.job4j.oop;

public class Surgeon extends Doctor{
    //инициализация полей
    private int amountOfOperation;
    private String namaOfPatient;
    private boolean aliveOrdied;

    //контейнеры для инициализации нач значений
    public Surgeon(int amountOfOperation, String namaOfPatient, boolean aliveOrdied) {
        this.amountOfOperation = amountOfOperation;
        this.namaOfPatient = namaOfPatient;
        this.aliveOrdied = aliveOrdied;
    }

    //метод возвращает количество операций
    public int getAmountOfOperation(){
        return this.amountOfOperation;
    }

    //метод возвращает имя пациента
    public String getNamaOfPatient(){
        return this.namaOfPatient;
    }

    //метод возвращае итог опарации
    public boolean isAliveOrdied() {
        return this.aliveOrdied;
    }


}
