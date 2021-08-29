package ru.job4j.oop;

public class Max {

    //создаем 1-ый метод
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    //создаем 2-ой метод
    public static int max(int first, int second, int third, int fourth) {
        int tmp = max(third, fourth);
        return max(first, tmp);

    }
    public static void main(String[] args) {
        int msg = max(5, 22, 343, 35);
        System.out.println(msg);
    }

}
