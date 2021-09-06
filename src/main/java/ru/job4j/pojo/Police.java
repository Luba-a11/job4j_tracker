package ru.job4j.pojo;

import java.util.Date;

public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Ivan Ivanov");
        license.setModel("saab");
        license.setCode("465465df");
        license.setCreated(new Date());

        System.out.println(license.getOwner() + " has a car - " + license.setModel() + " : " + license.getCode());
    }
}
