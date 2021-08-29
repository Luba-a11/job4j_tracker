package ru.job4j.oop;

public class Error {
    // создаем поля
    private boolean active;
    private int status;
    private String message;

    //явный способ задать конструктор
    public Error() {
        active = true;
        status = 0;
        message = "Высокая, нет ошибок";
    }

    //конструктор
    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активность: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Грамотность: " + message);
    }



    public static void main(String[] args) {
        Error error = new Error(true,0, "Высокая, нет ошибок");
        error.printInfo();
    }
}
