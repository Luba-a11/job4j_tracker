package ru.job4j.oop;

public class Computer {
//добавление полей
    private boolean multiMonitor;

    private int ssd;

    private String cpu;

    //метод выводит на консоль
    public void printInfo() {
        System.out.println("много мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("модель CPU: " + cpu);

    }

    // явный способ создать дефолтный конструктор
  /*  public Computer() {
    multiMonitor = true; //инициализация значений
    ssd = 500;
    cpu =  "Intel Core I7-10700K";
    }*/

    //создали конструктор чтобы инициализация была однозначной
    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;

    }

    public static void main(String[] args) {
      //  Computer comp = new Computer(); // создали объект
      //  Computer comp = new Computer(true, 550, "Intel Core I7-10700K");
        Computer comp = new Computer(true, 256, "AMD Ryzen 5 3600");
        comp.printInfo(); // вызов метода
        Computer two = new Computer();

    }
}
