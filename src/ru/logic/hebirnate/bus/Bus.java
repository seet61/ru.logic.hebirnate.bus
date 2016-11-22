package ru.logic.hebirnate.bus;

import java.util.HashSet;
import java.util.Set;

/**
 * Класс автобус
 * Created by dmitry.arefyev on 22.11.2016.
 */
public class Bus {
    private Long id;
    private String number;
    private Set drivers = new HashSet();
    private Long route_id;

    //Констурктор по умолчанию
    public Bus() {}

    //методы сеттеры
    public void setId(Long id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDrivers(Set drivers) {
        this.drivers = drivers;
    }

    public void setRoute_id(Long route_id) {
        this.route_id = route_id;
    }

    //методы геттеры
    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public Set getDrivers() {
        return drivers;
    }

    public Long getRoute_id() {
        return route_id;
    }
}
