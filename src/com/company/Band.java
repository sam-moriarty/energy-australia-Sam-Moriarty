package com.company;

import java.util.Date;
import java.util.LinkedList;

public class Band {
    private String name;
    private String genre;
    private String countryOfOrigin;
    private Date dateFormed;
    private LinkedList<String> members;
    private int contactNumber;

    public Band(){

    }
    public Band(String name){
        this.name = name;
    }
    public Band(String name, LinkedList<String> members){
        this.name = name;
        this.members = members;
    }

    public Band(String name, String genre, String countryOfOrigin, Date dateFormed, LinkedList<String> members, int contactNumber) {
        this.name = name;
        this.genre = genre;
        this.countryOfOrigin = countryOfOrigin;
        this.dateFormed = dateFormed;
        this.members = members;
        this.contactNumber = contactNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public Date getDateFormed() {
        return dateFormed;
    }

    public void setDateFormed(Date dateFormed) {
        this.dateFormed = dateFormed;
    }

    public LinkedList<String> getMembers() {
        return members;
    }

    public void setMembers(LinkedList<String> members) {
        this.members = members;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Band{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", dateFormed=" + dateFormed +
                ", members=" + members +
                ", contactNumber=" + contactNumber +
                '}';
    }
}
