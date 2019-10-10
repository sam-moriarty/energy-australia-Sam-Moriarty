package com.company;

import java.util.LinkedList;

public class Festivals {
    private String name;
    private String location;
    private int attendees;
    private double ticketSalesTotal;
    private LinkedList<Band> bandsAttended;

    public Festivals(){
    }

    public Festivals(String name){
        this.name = name;
    }
    public Festivals(String name, String location){
        this.name = name;
        this.location = location;
    }

    public Festivals(String name, String location, int attendees, double ticketSalesTotal) {
        this.name = name;
        this.location = location;
        this.attendees = attendees;
        this.ticketSalesTotal = ticketSalesTotal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAttendees() {
        return attendees;
    }

    public void setAttendees(int attendees) {
        this.attendees = attendees;
    }

    public double getTicketSalesTotal() {
        return ticketSalesTotal;
    }

    public void setTicketSalesTotal(double ticketSalesTotal) {
        this.ticketSalesTotal = ticketSalesTotal;
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
                ", location='" + location + '\'' +
                ", attendees=" + attendees +
                ", ticketSalesTotal=" + ticketSalesTotal +
                '}';
    }
}
