package ru.job4j.oop;

public class Triangle {
    //создаем поля
    private Point first;
    private Point second;
    private Point third;

    //делаем конструктор для установки начальных значений
    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    //создаем метод, который вычисляет полупериметр
    public double semiPerimeter(double a, double b, double c) {
        return ((this.first + this.second + this.third) / 2);
    }

    //создаем метод который проверяет существует ли данный треугольник
    public boolean exist (double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }
    //метод который расчитывает площадь треугольника
    public double area(){
        double rsl = Triangle.area();
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        if (this.exist(ab, ac, bc)) {
            double p = semiPerimeter(ab, ac, bc);
            double rsl = Math.sqrt(p * (p - this.first) * (p - this.second) * (p - this.third));

        }

        return rsl;
    }

}
