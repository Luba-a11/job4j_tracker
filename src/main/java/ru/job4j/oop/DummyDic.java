package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return  "Неизвествное слово: " + eng;
    }

    public static void main(String[] args) {
        DummyDic dd = new DummyDic();
        String word = dd.engToRus();
        System.out.println(word);

    }

}
