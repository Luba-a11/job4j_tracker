package ru.job4j.oop;

public class Battery {
    //создаем поле
    private int charge;

    //создаем конструктор для инициализации нач состояния
    public Battery(int size) {
        this.charge = size;
    }
    // создаем конструктор для увеличения заряда
    public void addCharge (Battery another) {
        this.charge = this.charge + another.charge;
        another.charge = 0;

    }

    public static void main(String[] args) {
        Battery before = new Battery(17);
        Battery add = new Battery(33);

        System.out.println("Первоначальный заряд батарии: " + before.charge + "%. Дополнительно зарядили на " + add.charge + "%.");
        before.addCharge(add);
        System.out.println("Суммарный заряд батарии: " + before.charge + "%. Остаток: " + add.charge + "%.");
    }
}
