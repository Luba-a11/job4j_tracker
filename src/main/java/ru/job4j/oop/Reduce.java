package ru.job4j.oop;

public class Reduce {
    //объявление поля
    private int[] array;

    //объявление метода
    public void to(int[] array) {
        this.array = array;
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] aray = {1, 2, 3};

        //объявление объекта
        Reduce reduce = new Reduce();

        //вызов метода to
        reduce.to(aray);
        reduce.print();
    }

}
