package com.company;

import java.util.LinkedList;

public class RecordLabel {

    private String name;
    private String location;
    private int contactNumber;
    private LinkedList<Band> bandsSigned;

    public RecordLabel(){

    }

    public RecordLabel(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public RecordLabel(String name, String location, int contactNumber, LinkedList<Band> bandsSigned) {
        this.name = name;
        this.location = location;
        this.contactNumber = contactNumber;
        this.bandsSigned = bandsSigned;
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

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public LinkedList<Band> getBandsSigned() {
        return bandsSigned;
    }

    public void setBandsSigned(LinkedList<Band> bandsSigned) {
        this.bandsSigned = bandsSigned;
    }


    @Override
    public String toString() {
        return "RecordLabel{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", contactNumber=" + contactNumber +
                ", bandsSigned=" + bandsSigned +
                '}';
    }
}
