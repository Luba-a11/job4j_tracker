package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Иван Иванович Петров");
        student.setNumberOfgroup("mk-8/21");
        student.setAsmissionDate(new Date());

        System.out.println("Студент: " + student.setFio() + " поступил в Колледж " + student.getAsmissionDate() + "зачислен в группу: " + student.getNumberOfgroup());
    }
}
