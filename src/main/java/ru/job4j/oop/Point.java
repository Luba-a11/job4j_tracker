package ru.job4j.oop;

import static java.lang.StrictMath.sqrt;
import static java.lang.StrictMath.pow;

public class Point {
    //создание полей для объекта х и у ВСЕ ПОЛЯ НАЧИНАЮТСЯ С PRIVATE
    private double x;
    private double y;
    private double z;

    //создание конструктора для задания нач состояния
    public Point(double first, double second, double third) {
        this.x = first;
        this.y = second;
        this.z = third;

    }

    //создаем метод distance3d, который будет принимать переменную Point

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        //cоздаем объекты
        Point a = new Point(0, 0, 8);
        Point b = new Point(2, 2, 9);
        Point z = new Point(7, 9, 9);

        //вызов метода distance3d
        double dist = a.distance3d(b.distance3d(z));
        System.out.println(dist);

    }

}
