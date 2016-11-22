package ru.logic.hebirnate.bus;

import java.util.HashSet;
import java.util.Set;

/**
 * Класс маршрут
 * Created by dmitry.arefyev on 22.11.2016.
 */
public class Route {
    private Long id;
    private String name;
    private int number;
    private Set busses = new HashSet();

    //Констурктор по умолчанию
    public Route() {}

    //методы сеттеры
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public int getNumber() {
        return number;
    }

    public Set getBusses() {
        return busses;
    }
}
