package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Иван Иванович Петров");
        student.setNumberOfGroup("821");
        student.setAdmissionDate(new Date());

        System.out.println("Студент: " + student.getFio() + " поступил в Колледж "
                + student.getAdmissionDate() + "зачислен в группу: " + student.getNumberOfGroup());
    }
}
