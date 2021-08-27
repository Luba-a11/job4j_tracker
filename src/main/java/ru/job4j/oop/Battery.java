package ru.job4j.oop;

public class Battery {
    //создаем поле
    private int charge;
    private int add;

    //создаем конструктор для инициализации нач состояния
    public Battery(int size) {
        this.charge = size;
        this.add = size;
    }

    // создаем конструктор для увеличения заряда
    public void addCharge (Battery another) {
        another.charge = this.charge + this.add;
        this.charge = 0;

    }

    public static void main(String[] args) {
        Battery before = new Battery(17);
        Battery add = new Battery(33);

        System.out.println("Первоначальный заряд батарии: " + before.charge + "%. Дополнительно зарядили на " + add.charge + "%.");
        before.addCharge(add);
        System.out.println("Суммарный заряд батарии: " + add.charge + "%. Остаток: " + before.charge + "%.");
    }
}
