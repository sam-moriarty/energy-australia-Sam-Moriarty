package com.company;

import java.util.LinkedList;

public class Festivals {
    private String name;
    private LinkedList<Band> bandsAttended;

    public Festivals(){
    }

    public Festivals(String name, LinkedList<Band> bandsAttended) {
        this.name = name;
        this.bandsAttended = bandsAttended;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Band> getBandsAttended() {
        return bandsAttended;
    }

    public void setBandsAttended(LinkedList<Band> bandsAttended) {
        this.bandsAttended = bandsAttended;
    }

    @Override
    public String toString() {
        return "Festivals{" +
                "name='" + name + '\'' +
                ", bandsAttended=" + bandsAttended +
                '}';
    }
}
