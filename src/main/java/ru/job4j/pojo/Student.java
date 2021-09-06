package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String fio;
    private int numberOfgroup;
    private Date asmissionDate;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getNumberOfgroup() {
        return numberOfgroup;
    }

    public void setNumberOfgroup(int numberOfgroup) {
        this.numberOfgroup = numberOfgroup;
    }

    public Date getAsmissionDate() {
        return asmissionDate;
    }

    public void setAsmissionDate(Date asmissionDate) {
        this.asmissionDate = asmissionDate;
    }
}
