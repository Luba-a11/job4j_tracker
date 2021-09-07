package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String fio;
    private String numberOfGroup;
    private Date admissionDate;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(String numberOfgroup) {
        this.numberOfGroup = numberOfgroup;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date asmissionDate) {
        this.admissionDate = asmissionDate;
    }
}
