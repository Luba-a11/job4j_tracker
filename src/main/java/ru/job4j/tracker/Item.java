package ru.job4j.tracker;

import java.time.LocalDateTime;

public class Item {
    private int id;
    private String name;
    private LocalDateTime created = LocalDateTime.now();

    //конструктор без параметров,
    public Item(){

    }

    //конструктор с параметром String name,
    public Item(String name) {

        this.name = name;
    }

    //конструктор с параметрами int id и String name.
    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Item(LocalDateTime created) {
        this.created = created;

    }

    public LocalDateTime getCreated(){
        return created;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}