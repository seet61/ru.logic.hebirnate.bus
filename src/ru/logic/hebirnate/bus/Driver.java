package ru.logic.hebirnate.bus;

import java.util.HashSet;
import java.util.Set;

/**
 * Класс водитель
 * Created by dmitry.arefyev on 22.11.2016.
 */
public class Driver {
    private Long id;
    private String name;
    private String surname;
    private int age;
    private Set busses = new HashSet();

    //Констурктор по умолчанию
    public Driver() {}

    //методы сеттеры
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBusses(Set busses) {
        this.busses = busses;
    }

    //методы геттеры
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Set getBusses() {
        return busses;
    }


}
