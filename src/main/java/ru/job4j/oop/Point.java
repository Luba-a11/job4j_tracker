package ru.job4j.oop;

import static java.lang.StrictMath.sqrt;
import static java.lang.StrictMath.pow;
public class Point {
    //создание полей для объекта х и у ВСЕ ПОЛЯ НАЧИНАЮТСЯ С PRIVATE
    private int x;
    private int y;

    //создание конструктора для задания нач состояния
    public Point(int first, int second) {
        this.x = first;
        this.y = second;

    }

    //создаем метод distance, который будет принимать переменную Point
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        //cоздаем объекты
        Point a = new Point(0, 0);
        Point b = new Point(8, 2);
        //вызов метода distance
        double dist = a.distance(b);
        System.out.println(dist);

    }


}
