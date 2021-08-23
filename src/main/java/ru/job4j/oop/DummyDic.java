package ru.job4j.oop;

public class DummyDic {
    public String engToRus() {
        String engl = "forever";
        return engl;
    }

    public static void main(String[] args) {
        DummyDic dd = new DummyDic();
        String word = dd.engToRus();
        System.out.println("Неизвествное слово: " + word);
    }
}
